
package net.drakma.rakinator.fluid;

import net.minecraftforge.registries.ForgeRegistries;
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

public abstract class EnchantedWaterFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RakinatorModFluids.ENCHANTED_WATER_FLUID,
			RakinatorModFluids.FLOWING_ENCHANTED_WATER_FLUID,
			FluidAttributes
					.builder(new ResourceLocation("rakinator:blocks/enchanted_water_still"),
							new ResourceLocation("rakinator:blocks/enchanted_water_flowing"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(100f)

			.bucket(RakinatorModItems.ENCHANTED_WATER_FLUID_BUCKET).block(() -> (LiquidBlock) RakinatorModBlocks.ENCHANTED_WATER_FLUID.get());

	private EnchantedWaterFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EnchantedWaterFluidFluid {
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

	public static class Flowing extends EnchantedWaterFluidFluid {
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
