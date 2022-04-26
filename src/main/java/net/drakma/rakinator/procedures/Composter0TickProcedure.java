package net.drakma.rakinator.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.drakma.rakinator.network.RakinatorModVariables;

import java.util.concurrent.atomic.AtomicReference;

public class Composter0TickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
boolean Composting = false;double InventoryLevel = 0;double CurrentFill = 0;
InventoryLevel = new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(world, new BlockPos(x,y,z), "items");CurrentFill = ;Composting = new Object(){
public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getBoolean(tag);
return false;
}
}.getValue(world, new BlockPos(x,y,z), "composting");if (!(new Object(){
public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getBoolean(tag);
return false;
}
}.getValue(world, new BlockPos(x,y,z), "composting"))
) {if (InventoryLevel==8) {if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putBoolean("composting", (true));
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}{
BlockEntity _ent = world.getBlockEntity(new BlockPos(x,y,z));
if (_ent != null) {
final int _slotid = 0;
_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable)
((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
});
}
}
}else if (InventoryLevel==7) {}else if (InventoryLevel==6) {}else if (InventoryLevel==5) {}else if (InventoryLevel==4) {}else if (InventoryLevel==3) {}else if (InventoryLevel==2) {}else if (InventoryLevel==1) {}else if (InventoryLevel==0) {}}if (new Object(){
public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getBoolean(tag);
return false;
}
}.getValue(world, new BlockPos(x,y,z), "composting")) {if (new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(world, new BlockPos(x,y,z), "timer")==RakinatorModVariables.composting_time) {{
BlockEntity _ent = world.getBlockEntity(new BlockPos(x,y,z));
if (_ent != null) {
final int _slotid = 0;
final ItemStack _setstack = new ItemStack(Blocks.DIRT);
_setstack.setCount(1);
_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
if (capability instanceof IItemHandlerModifiable)
((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
});
}
}
if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putDouble("timer", 0);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putDouble("items", 0);
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}if (new Object(){
public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getBoolean(tag);
return false;
}
}.getValue(world, new BlockPos(x,y,z), "composting")&&!((new Object() {
public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
BlockEntity _ent = world.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
return _retval.get();
}
}.getItemStack(world, new BlockPos(x,y,z), 0))
.getItem() == Blocks.DIRT.asItem())) {if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.MYCELIUM, (x+0.5), (y+0.8), (z+0.5), 5, 0.1, 0.5, 0.1, 0);}if(!world.isClientSide()) {
BlockPos _bp = new BlockPos(x,y,z);
BlockEntity _blockEntity = world.getBlockEntity(_bp);
BlockState _bs = world.getBlockState(_bp);
if(_blockEntity != null)
_blockEntity.getTileData().putDouble("timer", (1+new Object(){
public double getValue(LevelAccessor world, BlockPos pos, String tag) {
BlockEntity blockEntity=world.getBlockEntity(pos);
if(blockEntity != null) return blockEntity.getTileData().getDouble(tag);
return -1;
}
}.getValue(world, new BlockPos(x,y,z), "timer")));
if(world instanceof Level _level)
_level.sendBlockUpdated(_bp, _bs, _bs, 3);
}}
}
}
