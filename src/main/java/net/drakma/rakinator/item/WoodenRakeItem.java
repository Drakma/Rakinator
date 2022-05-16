
package net.drakma.rakinator.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.core.BlockPos;

import net.drakma.rakinator.init.RakinatorModTabs;
import net.drakma.rakinator.init.RakinatorModBlocks;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class WoodenRakeItem extends Item {
	public WoodenRakeItem() {
		super(new Item.Properties().tab(RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB).durability(250));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
		return List
				.of(Blocks.OAK_LEAVES, Blocks.DIRT, Blocks.GRAVEL, RakinatorModBlocks.DUST.get(), Blocks.SOUL_SAND,
						RakinatorModBlocks.SHATTERED_ANDESITE.get(), RakinatorModBlocks.SHATTERED_DIORITE.get(),
						RakinatorModBlocks.SHATTERED_END_STONE.get(), RakinatorModBlocks.SHATTERED_GRANITE.get(),
						RakinatorModBlocks.SHATTERED_NETHERRACK.get(), RakinatorModBlocks.SHATTERED_SKYSTONE.get(), Blocks.GRASS_BLOCK, Blocks.SAND)
				.contains(blockstate.getBlock()) ? 4f : 1;
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		itemstack.hurtAndBreak(1, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		return true;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		itemstack.hurtAndBreak(2, entity, i -> i.broadcastBreakEvent(EquipmentSlot.MAINHAND));
		return true;
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getDefaultAttributeModifiers(equipmentSlot));
			builder.put(Attributes.ATTACK_DAMAGE,
					new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", -2f, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_SPEED,
					new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -3, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getDefaultAttributeModifiers(equipmentSlot);
	}
}
