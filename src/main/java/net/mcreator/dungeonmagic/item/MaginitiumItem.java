
package net.mcreator.dungeonmagic.item;

import net.minecraft.entity.ai.attributes.Attributes;

@DungeonmagicModElements.ModElement.Tag
public class MaginitiumItem extends DungeonmagicModElements.ModElement {

	@ObjectHolder("dungeonmagic:maginitium")
	public static final Item block = null;

	public MaginitiumItem(DungeonmagicModElements instance) {
		super(instance, 2);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("maginitium");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Cet item permet de cr\u00E9e le portal activator"));
		}

	}

}
