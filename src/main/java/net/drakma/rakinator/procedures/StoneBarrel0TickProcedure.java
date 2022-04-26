package net.drakma.rakinator.procedures;

import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicInteger;

public class StoneBarrel0TickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double CurrentLevel = 0;
		CurrentLevel = new Object() {
			public int getFluidTankLevel(LevelAccessor level, BlockPos pos, int tank) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = level.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getFluidInTank(tank).getAmount()));
				return _retval.get();
			}
		}.getFluidTankLevel(world, new BlockPos(x, y, z), 1);
		if ((blockstate.getBlock().getStateDefinition().getProperty("fill") instanceof IntegerProperty _ip ? blockstate.getValue(_ip) : -1) <= 7) {
			if (CurrentLevel == 1000) {
				{
					int _value = 7;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel >= 858 && CurrentLevel < 1000) {
				{
					int _value = 6;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel >= 715 && CurrentLevel < 858) {
				{
					int _value = 5;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel >= 572 && CurrentLevel < 715) {
				{
					int _value = 4;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel >= 429 && CurrentLevel < 572) {
				{
					int _value = 3;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel >= 286 && CurrentLevel < 429) {
				{
					int _value = 2;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel >= 143 && CurrentLevel < 286) {
				{
					int _value = 1;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			} else if (CurrentLevel < 143) {
				{
					int _value = 0;
					BlockPos _pos = new BlockPos((int) x, (int) y, (int) z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("fill");
					if (_property instanceof IntegerProperty _integerProp && _property.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
