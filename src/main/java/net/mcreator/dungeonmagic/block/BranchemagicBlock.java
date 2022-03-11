
package net.mcreator.dungeonmagic.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@DungeonmagicModElements.ModElement.Tag
public class BranchemagicBlock extends DungeonmagicModElements.ModElement {

	@ObjectHolder("dungeonmagic:branchemagic")
	public static final Block block = null;

	public BranchemagicBlock(DungeonmagicModElements instance) {
		super(instance, 11);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MDTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends LeavesBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.VINE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).notSolid());

			setRegistryName("branchemagic");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 1;
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
