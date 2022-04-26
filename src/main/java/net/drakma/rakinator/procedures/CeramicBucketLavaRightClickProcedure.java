package net.drakma.rakinator.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.FluidStack;

import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.Util;

import net.drakma.rakinator.init.RakinatorModItems;

import java.util.concurrent.atomic.AtomicInteger;

public class CeramicBucketLavaRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction, Entity entity) {
		if (direction == null || entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CAULDRON) {
			world.setBlock(new BlockPos(x, y, z), Blocks.LAVA_CAULDRON.defaultBlockState(), 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RakinatorModItems.CERAMIC_BUCKET.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (0 != 0) {
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("place holder"), ChatType.SYSTEM, Util.NIL_UUID);
			}
		} else if (new Object() {
			public int fillTankSimulate(LevelAccessor level, BlockPos pos, int amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(
							capability -> _retval.set(capability.fill(new FluidStack(Fluids.LAVA, amount), IFluidHandler.FluidAction.SIMULATE)));
				return _retval.get();
			}
		}.fillTankSimulate(world, new BlockPos(x, y, z), 1000) == 1000) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				int _amount = 1000;
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> capability.fill(new FluidStack(Fluids.LAVA, _amount), IFluidHandler.FluidAction.EXECUTE));
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(RakinatorModItems.CERAMIC_BUCKET.get());
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty_lava")),
							SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (direction.getAxis() == Direction.Axis.Y
				&& (world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
			CeramicBucketPlaceLavaProcedure.execute(world, x, (y - 1), z, entity);
		} else if (direction.getAxis() == Direction.Axis.Z
				&& (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
			CeramicBucketPlaceLavaProcedure.execute(world, x, y, (z - 1), entity);
		} else if (direction.getAxis() == Direction.Axis.Z
				&& (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
			CeramicBucketPlaceLavaProcedure.execute(world, x, y, (z + 1), entity);
		} else if (direction.getAxis() == Direction.Axis.X
				&& (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
			CeramicBucketPlaceLavaProcedure.execute(world, (x - 1), y, z, entity);
		} else if (direction.getAxis() == Direction.Axis.X
				&& (world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
			CeramicBucketPlaceLavaProcedure.execute(world, (x + 1), y, z, entity);
		} else if (direction.getAxis() == Direction.Axis.Y
				&& (world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
			CeramicBucketPlaceLavaProcedure.execute(world, x, (y + 1), z, entity);
		}
		if (world instanceof Level _level)
			_level.updateNeighborsAt(new BlockPos(x, y, z), _level.getBlockState(new BlockPos(x, y, z)).getBlock());
	}
}
