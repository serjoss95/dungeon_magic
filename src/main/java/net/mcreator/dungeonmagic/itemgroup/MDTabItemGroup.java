
package net.mcreator.dungeonmagic.itemgroup;

@DungeonmagicModElements.ModElement.Tag
public class MDTabItemGroup extends DungeonmagicModElements.ModElement {

	public MDTabItemGroup(DungeonmagicModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmd_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MaginitiumItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
