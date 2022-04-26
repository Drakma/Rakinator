package net.drakma.rakinator.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.drakma.rakinator.init.RakinatorModItems;

public class SugarcaneSeedRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getFluidState(new BlockPos(x + 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:cactus_plantable")))
					|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:plantable")))) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.SUGAR_CANE.defaultBlockState(), 3);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RakinatorModItems.SUGARCANE_SEED.get());
					_setstack.setCount(
							(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		} else if ((world.getFluidState(new BlockPos(x - 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:cactus_plantable")))
					|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:plantable")))) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.SUGAR_CANE.defaultBlockState(), 3);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RakinatorModItems.SUGARCANE_SEED.get());
					_setstack.setCount(
							(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		} else if ((world.getFluidState(new BlockPos(x, y, z + 1)).createLegacyBlock()).getBlock() == Blocks.WATER) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:cactus_plantable")))
					|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:plantable")))) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.SUGAR_CANE.defaultBlockState(), 3);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RakinatorModItems.SUGARCANE_SEED.get());
					_setstack.setCount(
							(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		} else if ((world.getFluidState(new BlockPos(x, y, z - 1)).createLegacyBlock()).getBlock() == Blocks.WATER) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:cactus_plantable")))
					|| (world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("forge:plantable")))) {
				world.setBlock(new BlockPos(x, y + 1, z), Blocks.SUGAR_CANE.defaultBlockState(), 3);
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(RakinatorModItems.SUGARCANE_SEED.get());
					_setstack.setCount(
							(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}