
package net.drakma.rakinator.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.drakma.rakinator.init.RakinatorModItems;

public class ElementalistEnchantment extends Enchantment {
	public ElementalistEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == RakinatorModItems.DIAMOND_RAKE.get())
			return true;
		if (stack.getItem() == RakinatorModItems.EMERALD_RAKE.get())
			return true;
		if (stack.getItem() == RakinatorModItems.NETHERITE_RAKE.get())
			return true;
		return false;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
