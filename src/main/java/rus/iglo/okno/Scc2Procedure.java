package rus.iglo.okno;

import rus.iglo.okno.DialogOknoModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class Scc2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		DialogOknoModVariables.MapVariables.get(world).gui2 = 0;
		DialogOknoModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
