
package net.mcreator.dungeonmagic.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@DungeonmagicModElements.ModElement.Tag
public class MagicgrassBlock extends DungeonmagicModElements.ModElement {

	@ObjectHolder("dungeonmagic:magicgrass")
	public static final Block block = null;

	public MagicgrassBlock(DungeonmagicModElements instance) {
		super(instance, 8);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MDTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.ORGANIC).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("magicgrass");
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
