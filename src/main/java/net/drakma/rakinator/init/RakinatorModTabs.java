
package net.drakma.rakinator.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RakinatorModTabs {
	public static CreativeModeTab TAB_RAKINATOR_CREATIVE_TAB;

	public static void load() {
		TAB_RAKINATOR_CREATIVE_TAB = new CreativeModeTab("tabrakinator_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RakinatorModItems.WOODEN_RAKE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
