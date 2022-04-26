
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.drakma.rakinator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.drakma.rakinator.fluid.SpilledMilkFluidFluid;
import net.drakma.rakinator.fluid.SaltWaterFluidFluid;
import net.drakma.rakinator.fluid.MurkyWaterFluidFluid;
import net.drakma.rakinator.fluid.EnchantedWaterFluidFluid;
import net.drakma.rakinator.RakinatorMod;

public class RakinatorModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, RakinatorMod.MODID);
	public static final RegistryObject<Fluid> SALT_WATER_FLUID = REGISTRY.register("salt_water_fluid", () -> new SaltWaterFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SALT_WATER_FLUID = REGISTRY.register("flowing_salt_water_fluid",
			() -> new SaltWaterFluidFluid.Flowing());
	public static final RegistryObject<Fluid> ENCHANTED_WATER_FLUID = REGISTRY.register("enchanted_water_fluid",
			() -> new EnchantedWaterFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_ENCHANTED_WATER_FLUID = REGISTRY.register("flowing_enchanted_water_fluid",
			() -> new EnchantedWaterFluidFluid.Flowing());
	public static final RegistryObject<Fluid> MURKY_WATER_FLUID = REGISTRY.register("murky_water_fluid", () -> new MurkyWaterFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_MURKY_WATER_FLUID = REGISTRY.register("flowing_murky_water_fluid",
			() -> new MurkyWaterFluidFluid.Flowing());
	public static final RegistryObject<Fluid> SPILLED_MILK_FLUID = REGISTRY.register("spilled_milk_fluid", () -> new SpilledMilkFluidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SPILLED_MILK_FLUID = REGISTRY.register("flowing_spilled_milk_fluid",
			() -> new SpilledMilkFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SALT_WATER_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SALT_WATER_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(ENCHANTED_WATER_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ENCHANTED_WATER_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(MURKY_WATER_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MURKY_WATER_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SPILLED_MILK_FLUID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SPILLED_MILK_FLUID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
