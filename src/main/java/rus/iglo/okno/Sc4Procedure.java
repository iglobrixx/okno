package rus.iglo.okno;

import rus.iglo.okno.DialogOknoModVariables;
import net.minecraft.world.level.LevelAccessor;

public class Sc4Procedure {
	public static void execute(LevelAccessor world) {
		DialogOknoModVariables.MapVariables.get(world).gui4 = 1;
		DialogOknoModVariables.MapVariables.get(world).syncData(world);
	}
}
