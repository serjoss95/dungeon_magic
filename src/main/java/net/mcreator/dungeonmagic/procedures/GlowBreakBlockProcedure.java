package net.mcreator.dungeonmagic.procedures;

import net.minecraftforge.eventbus.api.Event;

public class GlowBreakBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DungeonmagicMod.LOGGER.warn("Failed to load dependency entity for procedure GlowBreakBlock!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 60, (int) 1));
	}

}
