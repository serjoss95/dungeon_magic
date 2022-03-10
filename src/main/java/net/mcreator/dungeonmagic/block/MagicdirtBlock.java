
package net.mcreator.dungeonmagic.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@DungeonmagicModElements.ModElement.Tag
public class MagicdirtBlock extends DungeonmagicModElements.ModElement {

	@ObjectHolder("dungeonmagic:magicdirt")
	public static final Block block = null;

	public MagicdirtBlock(DungeonmagicModElements instance) {
		super(instance, 7);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MDTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.EARTH).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("magicdirt");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.DIRT));
		}

	}

}
