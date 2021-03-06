
package net.mcreator.dungeonmagic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.dungeonmagic.itemgroup.MDTabItemGroup;
import net.mcreator.dungeonmagic.DungeonmagicModElements;

@DungeonmagicModElements.ModElement.Tag
public class CarteKiwiItem extends DungeonmagicModElements.ModElement {
	@ObjectHolder("dungeonmagic:carte_kiwi")
	public static final Item block = null;

	public CarteKiwiItem(DungeonmagicModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MDTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("carte_kiwi");
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
	}
}
