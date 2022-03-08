
package net.mcreator.dungeonmagic.itemgroup;

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
