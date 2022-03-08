
package net.mcreator.dungeonmagic.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@DungeonmagicModElements.ModElement.Tag
public class MagobsidienneBlock extends DungeonmagicModElements.ModElement {

	@ObjectHolder("dungeonmagic:magobsidienne")
	public static final Block block = null;

	public MagobsidienneBlock(DungeonmagicModElements instance) {
		super(instance, 4);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MDTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(99f, 10f).setLightLevel(s -> 2)
					.setNeedsPostProcessing((bs, br, bp) -> true).setEmmisiveRendering((bs, br, bp) -> true));

			setRegistryName("magobsidienne");
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
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
