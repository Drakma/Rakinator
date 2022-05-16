
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.drakma.rakinator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.drakma.rakinator.block.ZincBlockBlock;
import net.drakma.rakinator.block.WoodenBarrel0Block;
import net.drakma.rakinator.block.UraniumBlockBlock;
import net.drakma.rakinator.block.TungstenBlockBlock;
import net.drakma.rakinator.block.TitaniumBlockBlock;
import net.drakma.rakinator.block.TinBlockBlock;
import net.drakma.rakinator.block.TemeriumBlockBlock;
import net.drakma.rakinator.block.StoneBarrelBlock;
import net.drakma.rakinator.block.SteelBlockBlock;
import net.drakma.rakinator.block.StarmetalBlockBlock;
import net.drakma.rakinator.block.SpilledMilkFluidBlock;
import net.drakma.rakinator.block.SoulstoneBlockBlock;
import net.drakma.rakinator.block.SkystoneBlock;
import net.drakma.rakinator.block.SilverBlockBlock;
import net.drakma.rakinator.block.ShatteredSkystoneBlock;
import net.drakma.rakinator.block.ShatteredNetherrackBlock;
import net.drakma.rakinator.block.ShatteredGraniteBlock;
import net.drakma.rakinator.block.ShatteredEndStoneBlock;
import net.drakma.rakinator.block.ShatteredDioriteBlock;
import net.drakma.rakinator.block.ShatteredAndesiteBlock;
import net.drakma.rakinator.block.SaltWaterFluidBlock;
import net.drakma.rakinator.block.PlatinumBlockBlock;
import net.drakma.rakinator.block.OsmiumBlockBlock;
import net.drakma.rakinator.block.NickelBlockBlock;
import net.drakma.rakinator.block.MurkyWaterFluidBlock;
import net.drakma.rakinator.block.LumiumBlockBlock;
import net.drakma.rakinator.block.LeadBlockBlock;
import net.drakma.rakinator.block.IridiumBlockBlock;
import net.drakma.rakinator.block.InvarBlockBlock;
import net.drakma.rakinator.block.GraphiteBlockBlock;
import net.drakma.rakinator.block.EnderiumBlockBlock;
import net.drakma.rakinator.block.EnchantedWaterFluidBlock;
import net.drakma.rakinator.block.EnchantedGrassBlock;
import net.drakma.rakinator.block.ElementiumBlockBlock;
import net.drakma.rakinator.block.ElectrumBlockBlock;
import net.drakma.rakinator.block.DustBlock;
import net.drakma.rakinator.block.DragonstoneBlockBlock;
import net.drakma.rakinator.block.Crucible0Block;
import net.drakma.rakinator.block.ConstantanBlockBlock;
import net.drakma.rakinator.block.Composter0Block;
import net.drakma.rakinator.block.Collector0Block;
import net.drakma.rakinator.block.CobaltBlockBlock;
import net.drakma.rakinator.block.ChromeBlockBlock;
import net.drakma.rakinator.block.BronzeBlockBlock;
import net.drakma.rakinator.block.BrassBlockBlock;
import net.drakma.rakinator.block.BlazeBlockBlock;
import net.drakma.rakinator.block.AluminumBlockBlock;
import net.drakma.rakinator.RakinatorMod;

public class RakinatorModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RakinatorMod.MODID);
	public static final RegistryObject<Block> DUST = REGISTRY.register("dust", () -> new DustBlock());
	public static final RegistryObject<Block> SKYSTONE = REGISTRY.register("skystone", () -> new SkystoneBlock());
	public static final RegistryObject<Block> SHATTERED_ANDESITE = REGISTRY.register("shattered_andesite", () -> new ShatteredAndesiteBlock());
	public static final RegistryObject<Block> SHATTERED_DIORITE = REGISTRY.register("shattered_diorite", () -> new ShatteredDioriteBlock());
	public static final RegistryObject<Block> SHATTERED_END_STONE = REGISTRY.register("shattered_end_stone", () -> new ShatteredEndStoneBlock());
	public static final RegistryObject<Block> SHATTERED_GRANITE = REGISTRY.register("shattered_granite", () -> new ShatteredGraniteBlock());
	public static final RegistryObject<Block> SHATTERED_NETHERRACK = REGISTRY.register("shattered_netherrack", () -> new ShatteredNetherrackBlock());
	public static final RegistryObject<Block> SHATTERED_SKYSTONE = REGISTRY.register("shattered_skystone", () -> new ShatteredSkystoneBlock());
	public static final RegistryObject<Block> ENCHANTED_GRASS = REGISTRY.register("enchanted_grass", () -> new EnchantedGrassBlock());
	public static final RegistryObject<Block> WOODEN_BARREL_0 = REGISTRY.register("wooden_barrel_0", () -> new WoodenBarrel0Block());
	public static final RegistryObject<Block> CRUCIBLE_0 = REGISTRY.register("crucible_0", () -> new Crucible0Block());
	public static final RegistryObject<Block> COLLECTOR_0 = REGISTRY.register("collector_0", () -> new Collector0Block());
	public static final RegistryObject<Block> COMPOSTER_0 = REGISTRY.register("composter_0", () -> new Composter0Block());
	public static final RegistryObject<Block> SALT_WATER_FLUID = REGISTRY.register("salt_water_fluid", () -> new SaltWaterFluidBlock());
	public static final RegistryObject<Block> ENCHANTED_WATER_FLUID = REGISTRY.register("enchanted_water_fluid",
			() -> new EnchantedWaterFluidBlock());
	public static final RegistryObject<Block> MURKY_WATER_FLUID = REGISTRY.register("murky_water_fluid", () -> new MurkyWaterFluidBlock());
	public static final RegistryObject<Block> SPILLED_MILK_FLUID = REGISTRY.register("spilled_milk_fluid", () -> new SpilledMilkFluidBlock());
	public static final RegistryObject<Block> ALUMINUM_BLOCK = REGISTRY.register("aluminum_block", () -> new AluminumBlockBlock());
	public static final RegistryObject<Block> BRASS_BLOCK = REGISTRY.register("brass_block", () -> new BrassBlockBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	public static final RegistryObject<Block> CHROME_BLOCK = REGISTRY.register("chrome_block", () -> new ChromeBlockBlock());
	public static final RegistryObject<Block> COBALT_BLOCK = REGISTRY.register("cobalt_block", () -> new CobaltBlockBlock());
	public static final RegistryObject<Block> CONSTANTAN_BLOCK = REGISTRY.register("constantan_block", () -> new ConstantanBlockBlock());
	public static final RegistryObject<Block> DRAGONSTONE_BLOCK = REGISTRY.register("dragonstone_block", () -> new DragonstoneBlockBlock());
	public static final RegistryObject<Block> ELECTRUM_BLOCK = REGISTRY.register("electrum_block", () -> new ElectrumBlockBlock());
	public static final RegistryObject<Block> ELEMENTIUM_BLOCK = REGISTRY.register("elementium_block", () -> new ElementiumBlockBlock());
	public static final RegistryObject<Block> ENDERIUM_BLOCK = REGISTRY.register("enderium_block", () -> new EnderiumBlockBlock());
	public static final RegistryObject<Block> GRAPHITE_BLOCK = REGISTRY.register("graphite_block", () -> new GraphiteBlockBlock());
	public static final RegistryObject<Block> INVAR_BLOCK = REGISTRY.register("invar_block", () -> new InvarBlockBlock());
	public static final RegistryObject<Block> IRIDIUM_BLOCK = REGISTRY.register("iridium_block", () -> new IridiumBlockBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> LUMIUM_BLOCK = REGISTRY.register("lumium_block", () -> new LumiumBlockBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> OSMIUM_BLOCK = REGISTRY.register("osmium_block", () -> new OsmiumBlockBlock());
	public static final RegistryObject<Block> PLATINUM_BLOCK = REGISTRY.register("platinum_block", () -> new PlatinumBlockBlock());
	public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlockBlock());
	public static final RegistryObject<Block> SOULSTONE_BLOCK = REGISTRY.register("soulstone_block", () -> new SoulstoneBlockBlock());
	public static final RegistryObject<Block> STARMETAL_BLOCK = REGISTRY.register("starmetal_block", () -> new StarmetalBlockBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> TUNGSTEN_BLOCK = REGISTRY.register("tungsten_block", () -> new TungstenBlockBlock());
	public static final RegistryObject<Block> URANIUM_BLOCK = REGISTRY.register("uranium_block", () -> new UraniumBlockBlock());
	public static final RegistryObject<Block> ZINC_BLOCK = REGISTRY.register("zinc_block", () -> new ZincBlockBlock());
	public static final RegistryObject<Block> TEMERIUM_BLOCK = REGISTRY.register("temerium_block", () -> new TemeriumBlockBlock());
	public static final RegistryObject<Block> STONE_BARREL = REGISTRY.register("stone_barrel", () -> new StoneBarrelBlock());
	public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlockBlock());
	public static final RegistryObject<Block> BLAZE_BLOCK = REGISTRY.register("blaze_block", () -> new BlazeBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			WoodenBarrel0Block.registerRenderLayer();
			Crucible0Block.registerRenderLayer();
			Collector0Block.registerRenderLayer();
			Composter0Block.registerRenderLayer();
			StoneBarrelBlock.registerRenderLayer();
		}
	}
}
