
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package rus.iglo.okno;

import rus.iglo.okno.Gui5Menu;
import rus.iglo.okno.Gui4Menu;
import rus.iglo.okno.Gui3Menu;
import rus.iglo.okno.Gui2Menu;
import rus.iglo.okno.Gui1Menu;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class DialogOknoModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DialogOknoMod.MODID);
	public static final RegistryObject<MenuType<Gui2Menu>> GUI_2 = REGISTRY.register("gui_2", () -> IForgeMenuType.create(Gui2Menu::new));
	public static final RegistryObject<MenuType<Gui1Menu>> GUI_1 = REGISTRY.register("gui_1", () -> IForgeMenuType.create(Gui1Menu::new));
	public static final RegistryObject<MenuType<Gui3Menu>> GUI_3 = REGISTRY.register("gui_3", () -> IForgeMenuType.create(Gui3Menu::new));
	public static final RegistryObject<MenuType<Gui4Menu>> GUI_4 = REGISTRY.register("gui_4", () -> IForgeMenuType.create(Gui4Menu::new));
	public static final RegistryObject<MenuType<Gui5Menu>> GUI_5 = REGISTRY.register("gui_5", () -> IForgeMenuType.create(Gui5Menu::new));
}
