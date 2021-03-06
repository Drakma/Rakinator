
package net.drakma.rakinator.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.drakma.rakinator.init.RakinatorModTabs;

public class OsmiumIngotItem extends Item {
	public OsmiumIngotItem() {
		super(new Item.Properties().tab(RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
