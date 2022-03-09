package net.mcreator.dungeonmagic.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.dungeonmagic.DungeonmagicMod;

import java.util.Map;

public class ParticlesMaginophytumProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DungeonmagicMod.LOGGER.warn("Failed to load dependency world for procedure ParticlesMaginophytum!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DungeonmagicMod.LOGGER.warn("Failed to load dependency x for procedure ParticlesMaginophytum!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DungeonmagicMod.LOGGER.warn("Failed to load dependency y for procedure ParticlesMaginophytum!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DungeonmagicMod.LOGGER.warn("Failed to load dependency z for procedure ParticlesMaginophytum!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.addParticle(ParticleTypes.ENCHANT, x, y, z, 0, 1, 0);
	}
}
