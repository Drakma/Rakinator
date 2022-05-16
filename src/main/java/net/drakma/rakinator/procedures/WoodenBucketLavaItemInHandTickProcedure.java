package net.drakma.rakinator.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.drakma.rakinator.network.RakinatorModVariables;

public class WoodenBucketLavaItemInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("timer") == RakinatorModVariables.wooden_bucket_lava_burn_interval) {
			entity.hurt(DamageSource.LAVA, (float) RakinatorModVariables.wooden_bucket_lava_damage);
			itemstack.getOrCreateTag().putDouble("timer", 0);
		}
		itemstack.getOrCreateTag().putDouble("timer", (itemstack.getOrCreateTag().getDouble("timer") + 1));
	}
}
