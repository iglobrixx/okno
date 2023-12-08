
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package rus.iglo.okno;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DialogOknoModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(DialogOknoModMenus.GUI_2.get(), Gui2Screen::new);
			MenuScreens.register(DialogOknoModMenus.GUI_1.get(), Gui1Screen::new);
			MenuScreens.register(DialogOknoModMenus.GUI_3.get(), Gui3Screen::new);
			MenuScreens.register(DialogOknoModMenus.GUI_4.get(), Gui4Screen::new);
			MenuScreens.register(DialogOknoModMenus.GUI_5.get(), Gui5Screen::new);
		});
	}
}
