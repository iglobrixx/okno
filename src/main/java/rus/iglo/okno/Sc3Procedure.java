package rus.iglo.okno;

import rus.iglo.okno.DialogOknoModVariables;

import net.minecraft.world.level.LevelAccessor;

public class Sc3Procedure {
	public static void execute(LevelAccessor world) {
		DialogOknoModVariables.MapVariables.get(world).gui3 = 1;
		DialogOknoModVariables.MapVariables.get(world).syncData(world);
	}
}
