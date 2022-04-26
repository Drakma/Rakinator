
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

public abstract class SaltWaterFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RakinatorModFluids.SALT_WATER_FLUID,
			RakinatorModFluids.FLOWING_SALT_WATER_FLUID, FluidAttributes.builder(new ResourceLocation("rakinator:blocks/salt_water_still"),
					new ResourceLocation("rakinator:blocks/salt_water_flow"))

	).explosionResistance(100f)

			.bucket(RakinatorModItems.SALT_WATER_FLUID_BUCKET).block(() -> (LiquidBlock) RakinatorModBlocks.SALT_WATER_FLUID.get());

	private SaltWaterFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SaltWaterFluidFluid {
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

	public static class Flowing extends SaltWaterFluidFluid {
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
