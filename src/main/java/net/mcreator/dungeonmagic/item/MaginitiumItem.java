
package net.mcreator.dungeonmagic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.dungeonmagic.itemgroup.MDTabItemGroup;
import net.mcreator.dungeonmagic.DungeonmagicModElements;

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
			super(new Item.Properties().group(MDTabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
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
	}
}
