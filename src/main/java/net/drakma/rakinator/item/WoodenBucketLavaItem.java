
package net.drakma.rakinator.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;

import net.drakma.rakinator.procedures.WoodenBucketLavaRightClickProcedure;
import net.drakma.rakinator.procedures.WoodenBucketLavaItemInHandTickProcedure;
import net.drakma.rakinator.init.RakinatorModTabs;

public class WoodenBucketLavaItem extends Item {
	public WoodenBucketLavaItem() {
		super(new Item.Properties().tab(RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		WoodenBucketLavaRightClickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer());
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		WoodenBucketLavaItemInHandTickProcedure.execute(entity, itemstack);
	}
}
