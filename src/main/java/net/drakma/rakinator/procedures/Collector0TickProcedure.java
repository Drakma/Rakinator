package net.drakma.rakinator.procedures;

import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.FluidStack;

import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.drakma.rakinator.network.RakinatorModVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class Collector0TickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
boolean IsMorning = false;double DailyFill = 0;double CurrentLevel = 0;
DailyFill = 1000/RakinatorModVariables.collector_days_to_fill;if (world.dayTime()>=167&&world.dayTime()<=2000) {IsMorning = true;}else{IsMorning = false;if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putBoolean("filled_today", (false));
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (IsMorning&&!(new Object(){
public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getBoolean(tag);
return false;
}
}.getValue(world, new BlockPos(x,y,z), "filled_today"))
&&new Object() {
public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
AtomicInteger _retval = new AtomicInteger(0);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
_retval.set(capability.getFluidInTank(tank).getAmount()));
return _retval.get();
}
}.getFluidTankLevel(world, new BlockPos(x,y,z),1)<1000) {{
BlockEntity _ent = world.getBlockEntity(new BlockPos(x,y,z));
int _amount = (int)DailyFill;
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
capability.fill(new FluidStack(Fluids.WATER, _amount), IFluidHandler.FluidAction.EXECUTE)
);
}
if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putBoolean("filled_today", (true));
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}CurrentLevel = new Object() {
public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
AtomicInteger _retval = new AtomicInteger(0);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
_retval.set(capability.getFluidInTank(tank).getAmount()));
return _retval.get();
}
}.getFluidTankLevel(world, new BlockPos(x,y,z),1);if (!=8) {if (CurrentLevel==1000) {}else if (CurrentLevel>=858&&CurrentLevel<1000) {}else if (CurrentLevel>=715&&CurrentLevel<858) {}else if (CurrentLevel>=572&&CurrentLevel<715) {}else if (CurrentLevel>=429&&CurrentLevel<572) {}else if (CurrentLevel>=286&&CurrentLevel<429) {}else if (CurrentLevel>=143&&CurrentLevel<286) {}else if (CurrentLevel<143) {}}
}
}
