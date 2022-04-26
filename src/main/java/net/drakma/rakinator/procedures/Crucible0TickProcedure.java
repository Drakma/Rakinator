package net.drakma.rakinator.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.FluidStack;

import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.drakma.rakinator.network.RakinatorModVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class Crucible0TickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double CurrentLevel = 0;double InventoryLevel = 0;BlockState BlockUnder = Blocks.AIR.defaultBlockState();boolean OverHeat = false;
CurrentLevel = new Object() {
public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
AtomicInteger _retval = new AtomicInteger(0);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
_retval.set(capability.getFluidInTank(tank).getAmount()));
return _retval.get();
}
}.getFluidTankLevel(world, new BlockPos(x,y,z),1);InventoryLevel = new Object() {
public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
AtomicInteger _retval = new AtomicInteger(0);
BlockEntity _ent = world.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
return _retval.get();
}
}.getAmount(world, new BlockPos(x,y,z), 0);if (new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(world, new BlockPos(x,y,z), "timer")==RakinatorModVariables.crucible_time_between_smelting&&InventoryLevel>=1&&CurrentLevel<4000) {if ((world.getBlockState(new BlockPos(x,y-1,z))).is(BlockTags.create(new ResourceLocation("forge:heat_blocks")))) {OverHeat = true;}else{OverHeat = false;}if (InventoryLevel>=1&&OverHeat&&CurrentLevel<=4000) {{
BlockEntity _ent = world.getBlockEntity(new BlockPos(x,y,z));
if (_ent != null) {
final int _slotid = 0;
final int _amount = 1;
_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable) {
ItemStack _stk = capability.getStackInSlot(_slotid).copy();
_stk.shrink(_amount);
((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
}
});
}
}
{
BlockEntity _ent = world.getBlockEntity(new BlockPos(x,y,z));
int _amount = 200;
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
capability.fill(new FluidStack(Fluids.LAVA, _amount), IFluidHandler.FluidAction.EXECUTE)
);
}
if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putDouble("level", (new Object() {
public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
AtomicInteger _retval = new AtomicInteger(0);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
_retval.set(capability.getFluidInTank(tank).getAmount()));
return _retval.get();
}
}.getFluidTankLevel(world, new BlockPos(x,y,z),1))
);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putDouble("timer", 0);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}else if (InventoryLevel>=1) {if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putDouble("timer", (new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(world, new BlockPos(x,y,z), "timer")+1));
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
}.getFluidTankLevel(world, new BlockPos(x,y,z),1);if (!=8) {if (CurrentLevel>=1000) {}else if (CurrentLevel>=800&&CurrentLevel<1000) {}else if (InventoryLevel==5) {}else if (InventoryLevel==4) {}else if (InventoryLevel==3) {}else if (InventoryLevel==2) {}else if (InventoryLevel==1) {}else if (InventoryLevel<1) {}}
}
}
