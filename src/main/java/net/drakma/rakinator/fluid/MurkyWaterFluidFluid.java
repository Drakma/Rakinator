
package net.drakma.rakinator.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.drakma.rakinator.init.RakinatorModItems;
import net.drakma.rakinator.init.RakinatorModFluids;
import net.drakma.rakinator.init.RakinatorModBlocks;

public abstract class MurkyWaterFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RakinatorModFluids.MURKY_WATER_FLUID,
			RakinatorModFluids.FLOWING_MURKY_WATER_FLUID, FluidAttributes.builder(new ResourceLocation("rakinator:blocks/murky_water_still"),
					new ResourceLocation("rakinator:blocks/murky_water_flowing"))

	).explosionResistance(100f)

			.bucket(RakinatorModItems.MURKY_WATER_FLUID_BUCKET).block(() -> (LiquidBlock) RakinatorModBlocks.MURKY_WATER_FLUID.get());

	private MurkyWaterFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MurkyWaterFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MurkyWaterFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
