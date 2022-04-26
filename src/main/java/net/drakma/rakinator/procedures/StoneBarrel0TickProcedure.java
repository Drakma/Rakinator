package net.drakma.rakinator.procedures;

import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class StoneBarrel0TickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
double CurrentLevel = 0;
CurrentLevel = new Object() {
public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
AtomicInteger _retval = new AtomicInteger(0);
BlockEntity _ent = level.getBlockEntity(pos);
if (_ent != null)
_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null).ifPresent(capability ->
_retval.set(capability.getFluidInTank(tank).getAmount()));
return _retval.get();
}
}.getFluidTankLevel(world, new BlockPos(x,y,z),1);if (<=7) {if (CurrentLevel==1000) {}else if (CurrentLevel>=858&&CurrentLevel<1000) {}else if (CurrentLevel>=715&&CurrentLevel<858) {}else if (CurrentLevel>=572&&CurrentLevel<715) {}else if (CurrentLevel>=429&&CurrentLevel<572) {}else if (CurrentLevel>=286&&CurrentLevel<429) {}else if (CurrentLevel>=143&&CurrentLevel<286) {}else if (CurrentLevel<143) {}}
}
}
