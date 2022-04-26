package net.drakma.rakinator.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.drakma.rakinator.init.RakinatorModItems;

public class WoodenBucketRightClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double LocalRayTraceDistance = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == RakinatorModItems.WOODEN_BUCKET
				.get()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER_CAULDRON) {
				world.setBlock(new BlockPos(x, y, z), Blocks.CAULDRON.defaultBlockState(), 3);
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() == 1) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_WATER.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET.get());
						_setstack.setCount(
								(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_WATER.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
								SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LAVA_CAULDRON) {
				world.setBlock(new BlockPos(x, y, z), Blocks.CAULDRON.defaultBlockState(), 3);
				if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() == 1) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_LAVA.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET.get());
						_setstack.setCount(
								(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_LAVA.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			LocalRayTraceDistance = 0.5;
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if ((world
						.getFluidState(new BlockPos(
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
								entity.level
										.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getZ()))
						.createLegacyBlock()).getFluidState().isSource() == true
						&& (world
								.getFluidState(
										new BlockPos(
												entity.level.clip(
														new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getX(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getY(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getZ()))
								.createLegacyBlock()).is(BlockTags.create(new ResourceLocation("forge:water_placeable")))) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					world.setBlock(
							new BlockPos(
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
							Blocks.AIR.defaultBlockState(), 3);
					if (!world.isClientSide()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null,
										new BlockPos(
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getX(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getY(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill")), SoundSource.NEUTRAL, 1, 1,
										false);
							}
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET.get());
							_setstack.setCount(
									(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_WATER.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_WATER.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
					if (world instanceof Level _level)
						_level.updateNeighborsAt(
								new BlockPos(
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
												.getBlockPos().getX(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(
																entity.getViewVector(1f).scale(LocalRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
												.getBlockPos().getY(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
												.getBlockPos().getZ()),
								_level.getBlockState(
										new BlockPos(
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getX(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getY(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getZ()))
										.getBlock());
					break;
				} else if ((world
						.getFluidState(new BlockPos(
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
								entity.level.clip(new ClipContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
										ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
								entity.level
										.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
										.getBlockPos().getZ()))
						.createLegacyBlock()).getFluidState().isSource() == true
						&& (world
								.getFluidState(
										new BlockPos(
												entity.level.clip(
														new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getX(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getY(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getZ()))
								.createLegacyBlock()).is(BlockTags.create(new ResourceLocation("forge:lava_placeable")))) {
					if (entity instanceof LivingEntity _entity)
						_entity.swing(InteractionHand.MAIN_HAND, true);
					world.setBlock(
							new BlockPos(
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY(),
									entity.level.clip(new ClipContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
											ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
							Blocks.AIR.defaultBlockState(), 3);
					if (!world.isClientSide()) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null,
										new BlockPos(
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getX(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getY(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")), SoundSource.NEUTRAL, 1,
										1);
							} else {
								_level.playLocalSound(
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getX()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getY()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
												ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.fill_lava")), SoundSource.NEUTRAL, 1,
										1, false);
							}
						}
					}
					if ((new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId())
												.getGameMode() == GameType.CREATIVE;
							}
							return false;
						}
					}.checkGamemode(entity)) == false) {
						if (entity instanceof LivingEntity _entity) {
							ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET.get());
							_setstack.setCount(
									(int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
							_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
							if (_entity instanceof Player _player)
								_player.getInventory().setChanged();
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
							if (entity instanceof LivingEntity _entity) {
								ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_LAVA.get());
								_setstack.setCount(1);
								_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
								if (_entity instanceof Player _player)
									_player.getInventory().setChanged();
							}
						} else {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(RakinatorModItems.WOODEN_BUCKET_LAVA.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
					if (world instanceof Level _level)
						_level.updateNeighborsAt(
								new BlockPos(
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
												.getBlockPos().getX(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(
																entity.getViewVector(1f).scale(LocalRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
												.getBlockPos().getY(),
										entity.level
												.clip(new ClipContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
														ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
												.getBlockPos().getZ()),
								_level.getBlockState(
										new BlockPos(
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getX(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getY(),
												entity.level
														.clip(new ClipContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(LocalRayTraceDistance)),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.SOURCE_ONLY, entity))
														.getBlockPos().getZ()))
										.getBlock());
					break;
				}
				LocalRayTraceDistance = LocalRayTraceDistance + 1;
			}
		}
	}
}
