package net.drakma.rakinator.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.drakma.rakinator.config.ConfigHandler;

public class WoodenBucketLavaItemInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("timer") == ConfigHandler.COMMON.woodenBucketLavaBurnInterval.get()) {
			entity.hurt(DamageSource.LAVA, (float) ConfigHandler.COMMON.woodenBucketLavaBurnDamage.get().floatValue());
			itemstack.getOrCreateTag().putDouble("timer", 0);
		}
		itemstack.getOrCreateTag().putDouble("timer", (itemstack.getOrCreateTag().getDouble("timer") + 1));
	}
}
