
package net.drakma.rakinator.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;

import net.drakma.rakinator.procedures.CeramicBucketRightClickProcedure;
import net.drakma.rakinator.procedures.CeramicBucketRightClickEntityProcedure;
import net.drakma.rakinator.init.RakinatorModTabs;

public class CeramicBucketItem extends Item {
	public CeramicBucketItem() {
		super(new Item.Properties().tab(RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB).stacksTo(16).rarity(Rarity.COMMON));
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
		CeramicBucketRightClickProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		CeramicBucketRightClickEntityProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity, itemstack);
		return retval;
	}
}