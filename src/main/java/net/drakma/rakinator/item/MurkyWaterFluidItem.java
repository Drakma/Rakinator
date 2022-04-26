
package net.drakma.rakinator.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.drakma.rakinator.init.RakinatorModTabs;
import net.drakma.rakinator.init.RakinatorModFluids;

public class MurkyWaterFluidItem extends BucketItem {
	public MurkyWaterFluidItem() {
		super(RakinatorModFluids.MURKY_WATER_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB));
	}
}
