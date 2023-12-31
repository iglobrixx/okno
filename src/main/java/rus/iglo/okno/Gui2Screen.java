package rus.iglo.okno;

import rus.iglo.okno.Gui2Menu;
import rus.iglo.okno.Gui2ButtonMessage;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Gui2Screen extends AbstractContainerScreen<Gui2Menu> {
	private final static HashMap<String, Object> guistate = Gui2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_knopka;
	ImageButton imagebutton_knopka1;

	public Gui2Screen(Gui2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, new ResourceLocation("dialog_okno:textures/screens/okno.png"));
		this.blit(ms, this.leftPos + -143, this.topPos + -46, 0, 0, 454, 256, 454, 256);

		RenderSystem.setShaderTexture(0, new ResourceLocation("dialog_okno:textures/screens/vop.png"));
		this.blit(ms, this.leftPos + -110, this.topPos + -25, 0, 0, 205, 65, 205, 65);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		imagebutton_knopka = new ImageButton(this.leftPos + -110, this.topPos + 52, 185, 25, 0, 0, 25, new ResourceLocation("dialog_okno:textures/screens/atlas/imagebutton_knopka.png"), 185, 50, e -> {
			if (true) {
				DialogOknoMod.PACKET_HANDLER.sendToServer(new Gui2ButtonMessage(0, x, y, z));
				Gui2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_knopka", imagebutton_knopka);
		this.addRenderableWidget(imagebutton_knopka);
		imagebutton_knopka1 = new ImageButton(this.leftPos + -110, this.topPos + 97, 185, 25, 0, 0, 25, new ResourceLocation("dialog_okno:textures/screens/atlas/imagebutton_knopka1.png"), 185, 50, e -> {
			if (true) {
				DialogOknoMod.PACKET_HANDLER.sendToServer(new Gui2ButtonMessage(1, x, y, z));
				Gui2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_knopka1", imagebutton_knopka1);
		this.addRenderableWidget(imagebutton_knopka1);
	}
}
