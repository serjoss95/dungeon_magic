
package net.mcreator.dungeonmagic.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dungeonmagic.item.Maginitium2Item;
import net.mcreator.dungeonmagic.DungeonmagicModElements;

@DungeonmagicModElements.ModElement.Tag
public class TabDM2ItemGroup extends DungeonmagicModElements.ModElement {
	public TabDM2ItemGroup(DungeonmagicModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtab_dm_2") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Maginitium2Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
