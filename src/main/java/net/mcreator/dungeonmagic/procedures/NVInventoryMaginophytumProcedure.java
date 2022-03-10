package net.mcreator.dungeonmagic.procedures;

import net.minecraftforge.eventbus.api.Event;

public class NVInventoryMaginophytumProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DungeonmagicMod.LOGGER.warn("Failed to load dependency entity for procedure NVInventoryMaginophytum!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(MaginophytumBlock.block)) : false) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 100000, (int) 1));
		}
	}

}
