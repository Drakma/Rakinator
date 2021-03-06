
package net.drakma.rakinator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.drakma.rakinator.item.ZincPieceItem;
import net.drakma.rakinator.item.ZincIngotItem;
import net.drakma.rakinator.item.ZincChunkItem;
import net.drakma.rakinator.item.WoodenRakeItem;
import net.drakma.rakinator.item.WoodenHammerItem;
import net.drakma.rakinator.item.WoodenBucketWaterItem;
import net.drakma.rakinator.item.WoodenBucketSaltWaterItem;
import net.drakma.rakinator.item.WoodenBucketMurkyWaterItem;
import net.drakma.rakinator.item.WoodenBucketLavaItem;
import net.drakma.rakinator.item.WoodenBucketItem;
import net.drakma.rakinator.item.WoodenBucketEnchantedWaterItem;
import net.drakma.rakinator.item.WaterElementItem;
import net.drakma.rakinator.item.UraniumPieceItem;
import net.drakma.rakinator.item.UraniumIngotItem;
import net.drakma.rakinator.item.UraniumChunkItem;
import net.drakma.rakinator.item.UraninitePieceItem;
import net.drakma.rakinator.item.UnfiredCeramicItem;
import net.drakma.rakinator.item.TungstenPieceItem;
import net.drakma.rakinator.item.TungstenIngotItem;
import net.drakma.rakinator.item.TungstenChunkItem;
import net.drakma.rakinator.item.TuffPebbleItem;
import net.drakma.rakinator.item.TopazCrystalItem;
import net.drakma.rakinator.item.TitaniumPieceItem;
import net.drakma.rakinator.item.TitaniumIngotItem;
import net.drakma.rakinator.item.TitaniumChunkItem;
import net.drakma.rakinator.item.TinPieceItem;
import net.drakma.rakinator.item.TinIngotItem;
import net.drakma.rakinator.item.TinChunkItem;
import net.drakma.rakinator.item.SulfurDustItem;
import net.drakma.rakinator.item.SugarcaneSeedItem;
import net.drakma.rakinator.item.StoneRakeItem;
import net.drakma.rakinator.item.StoneHammerItem;
import net.drakma.rakinator.item.SteelIngotItem;
import net.drakma.rakinator.item.StarmetalPieceItem;
import net.drakma.rakinator.item.StarmetalIngotItem;
import net.drakma.rakinator.item.StarmetalChunkItem;
import net.drakma.rakinator.item.SpruceSeedItem;
import net.drakma.rakinator.item.SoulstonePieceItem;
import net.drakma.rakinator.item.SoulstoneIngotItem;
import net.drakma.rakinator.item.SoulstoneChunkItem;
import net.drakma.rakinator.item.SouliumCrystalItem;
import net.drakma.rakinator.item.SkystoneDustItem;
import net.drakma.rakinator.item.SilverPieceItem;
import net.drakma.rakinator.item.SilverIngotItem;
import net.drakma.rakinator.item.SilverChunkItem;
import net.drakma.rakinator.item.SiliconDustItem;
import net.drakma.rakinator.item.SapphireCrystalItem;
import net.drakma.rakinator.item.SaltpeterDustItem;
import net.drakma.rakinator.item.SaltWaterFluidItem;
import net.drakma.rakinator.item.RubyCrystalItem;
import net.drakma.rakinator.item.RockCrystalItem;
import net.drakma.rakinator.item.QuartzCrystalItem;
import net.drakma.rakinator.item.ProsperityCrystalItem;
import net.drakma.rakinator.item.PotatoSeedItem;
import net.drakma.rakinator.item.PorcelainBrickItem;
import net.drakma.rakinator.item.PlatinumPieceItem;
import net.drakma.rakinator.item.PlatinumIngotItem;
import net.drakma.rakinator.item.PlatinumChunkItem;
import net.drakma.rakinator.item.PeridotCrystalItem;
import net.drakma.rakinator.item.OsmiumPieceItem;
import net.drakma.rakinator.item.OsmiumIngotItem;
import net.drakma.rakinator.item.OsmiumChunkItem;
import net.drakma.rakinator.item.OakSeedItem;
import net.drakma.rakinator.item.NickelPieceItem;
import net.drakma.rakinator.item.NickelIngotItem;
import net.drakma.rakinator.item.NickelChunkItem;
import net.drakma.rakinator.item.NetheriteRakeItem;
import net.drakma.rakinator.item.NetheriteHammerItem;
import net.drakma.rakinator.item.NetherQuartzCrystalItem;
import net.drakma.rakinator.item.MurkyWaterFluidItem;
import net.drakma.rakinator.item.MithrilDustItem;
import net.drakma.rakinator.item.LumiumIngotItem;
import net.drakma.rakinator.item.LeadPieceItem;
import net.drakma.rakinator.item.LeadIngotItem;
import net.drakma.rakinator.item.LeadChunkItem;
import net.drakma.rakinator.item.KelpSeedItem;
import net.drakma.rakinator.item.JungleSeedItem;
import net.drakma.rakinator.item.IronRakeItem;
import net.drakma.rakinator.item.IronPieceItem;
import net.drakma.rakinator.item.IronHammerItem;
import net.drakma.rakinator.item.IronChunkItem;
import net.drakma.rakinator.item.IridiumPieceItem;
import net.drakma.rakinator.item.IridiumIngotItem;
import net.drakma.rakinator.item.IridiumChunkItem;
import net.drakma.rakinator.item.InvarIngotItem;
import net.drakma.rakinator.item.InferiumCrystalItem;
import net.drakma.rakinator.item.GrassSeedItem;
import net.drakma.rakinator.item.GraphiteIngotItem;
import net.drakma.rakinator.item.GraphiteDustItem;
import net.drakma.rakinator.item.GranitePebbleItem;
import net.drakma.rakinator.item.GoldPieceItem;
import net.drakma.rakinator.item.GoldChunkItem;
import net.drakma.rakinator.item.FireElementItem;
import net.drakma.rakinator.item.EnderiumIngotItem;
import net.drakma.rakinator.item.EnchantedWaterFluidItem;
import net.drakma.rakinator.item.EnchantedSeedItem;
import net.drakma.rakinator.item.EmeraldRakeItem;
import net.drakma.rakinator.item.EmeraldHammerItem;
import net.drakma.rakinator.item.ElementiumPieceItem;
import net.drakma.rakinator.item.ElementiumIngotItem;
import net.drakma.rakinator.item.ElementiumChunkItem;
import net.drakma.rakinator.item.ElectrumIngotItem;
import net.drakma.rakinator.item.EarthElementItem;
import net.drakma.rakinator.item.DragonstonePieceItem;
import net.drakma.rakinator.item.DragonstoneIngotItem;
import net.drakma.rakinator.item.DragonstoneChunkItem;
import net.drakma.rakinator.item.DioritePebbleItem;
import net.drakma.rakinator.item.DiamondRakeItem;
import net.drakma.rakinator.item.DiamondHammerItem;
import net.drakma.rakinator.item.DeepslatePebbleItem;
import net.drakma.rakinator.item.DarkOakSeedItem;
import net.drakma.rakinator.item.CopperPieceItem;
import net.drakma.rakinator.item.CopperChunkItem;
import net.drakma.rakinator.item.ConstantanIngotItem;
import net.drakma.rakinator.item.CobblestonePebbleItem;
import net.drakma.rakinator.item.CobaltPieceItem;
import net.drakma.rakinator.item.CobaltIngotItem;
import net.drakma.rakinator.item.CobaltChunkItem;
import net.drakma.rakinator.item.ChromeIngotItem;
import net.drakma.rakinator.item.ChromeDustItem;
import net.drakma.rakinator.item.CeramicBucketWaterItem;
import net.drakma.rakinator.item.CeramicBucketSaltWaterItem;
import net.drakma.rakinator.item.CeramicBucketMurkyWaterItem;
import net.drakma.rakinator.item.CeramicBucketLavaItem;
import net.drakma.rakinator.item.CeramicBucketItem;
import net.drakma.rakinator.item.CeramicBucketEnchantedWaterItem;
import net.drakma.rakinator.item.CarrotSeedItem;
import net.drakma.rakinator.item.CactusSeedItem;
import net.drakma.rakinator.item.BronzeIngotItem;
import net.drakma.rakinator.item.BrassIngotItem;
import net.drakma.rakinator.item.BlazingQuartzPieceItem;
import net.drakma.rakinator.item.BlazingQuartzIngotItem;
import net.drakma.rakinator.item.BlazingQuartzChunkItem;
import net.drakma.rakinator.item.BlackstonePebbleItem;
import net.drakma.rakinator.item.BirchSeedItem;
import net.drakma.rakinator.item.BambooSeedItem;
import net.drakma.rakinator.item.AndesitePebbleItem;
import net.drakma.rakinator.item.AmythestCrystalItem;
import net.drakma.rakinator.item.AluminumPieceItem;
import net.drakma.rakinator.item.AluminumIngotItem;
import net.drakma.rakinator.item.AluminumChunkItem;
import net.drakma.rakinator.item.AirElementItem;
import net.drakma.rakinator.item.AcaciaSeedItem;
import net.drakma.rakinator.RakinatorMod;

public class RakinatorModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RakinatorMod.MODID);

  //Hammers
  public static final RegistryObject<Item> WOODEN_HAMMER = REGISTRY.register("wooden_hammer", () -> new WoodenHammerItem());
  public static final RegistryObject<Item> STONE_HAMMER = REGISTRY.register("stone_hammer", () -> new StoneHammerItem());
  public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
  public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new DiamondHammerItem());
  public static final RegistryObject<Item> EMERALD_HAMMER = REGISTRY.register("emerald_hammer", () -> new EmeraldHammerItem());
  public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new NetheriteHammerItem());

  //Rakes
  public static final RegistryObject<Item> WOODEN_RAKE = REGISTRY.register("wooden_rake", () -> new WoodenRakeItem());
  public static final RegistryObject<Item> STONE_RAKE = REGISTRY.register("stone_rake", () -> new StoneRakeItem());
  public static final RegistryObject<Item> IRON_RAKE = REGISTRY.register("iron_rake", () -> new IronRakeItem());
  public static final RegistryObject<Item> DIAMOND_RAKE = REGISTRY.register("diamond_rake", () -> new DiamondRakeItem());
  public static final RegistryObject<Item> EMERALD_RAKE = REGISTRY.register("emerald_rake", () -> new EmeraldRakeItem());
  public static final RegistryObject<Item> NETHERITE_RAKE = REGISTRY.register("netherite_rake", () -> new NetheriteRakeItem());

  //Block Machines
  public static final RegistryObject<Item> WOODEN_BARREL_0 = block(RakinatorModBlocks.WOODEN_BARREL_0, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> STONE_BARREL = block(RakinatorModBlocks.STONE_BARREL, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> COLLECTOR_0 = block(RakinatorModBlocks.COLLECTOR_0, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> COMPOSTER_0 = block(RakinatorModBlocks.COMPOSTER_0, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> CRUCIBLE_0 = block(RakinatorModBlocks.CRUCIBLE_0, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);

  //Blocks
  public static final RegistryObject<Item> DUST = block(RakinatorModBlocks.DUST, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SHATTERED_ANDESITE = block(RakinatorModBlocks.SHATTERED_ANDESITE,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SHATTERED_DIORITE = block(RakinatorModBlocks.SHATTERED_DIORITE,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SHATTERED_END_STONE = block(RakinatorModBlocks.SHATTERED_END_STONE,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SHATTERED_GRANITE = block(RakinatorModBlocks.SHATTERED_GRANITE,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SHATTERED_NETHERRACK = block(RakinatorModBlocks.SHATTERED_NETHERRACK,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SHATTERED_SKYSTONE = block(RakinatorModBlocks.SHATTERED_SKYSTONE,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SKYSTONE = block(RakinatorModBlocks.SKYSTONE, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> ENCHANTED_GRASS = block(RakinatorModBlocks.ENCHANTED_GRASS, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> TEMERIUM_BLOCK = block(RakinatorModBlocks.TEMERIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);

  //Porcelain
  public static final RegistryObject<Item> UNFIRED_CERAMIC = REGISTRY.register("unfired_ceramic", () -> new UnfiredCeramicItem());
  public static final RegistryObject<Item> PORCELAIN_BRICK = REGISTRY.register("porcelain_brick", () -> new PorcelainBrickItem());

  //Forge Buckets
  public static final RegistryObject<Item> ENCHANTED_WATER_FLUID_BUCKET = REGISTRY.register("enchanted_water_fluid_bucket",    () -> new EnchantedWaterFluidItem());
  public static final RegistryObject<Item> MURKY_WATER_FLUID_BUCKET = REGISTRY.register("murky_water_fluid_bucket",    () -> new MurkyWaterFluidItem());
  public static final RegistryObject<Item> SALT_WATER_FLUID_BUCKET = REGISTRY.register("salt_water_fluid_bucket", () -> new SaltWaterFluidItem());

  //Wooden Buckets
  public static final RegistryObject<Item> WOODEN_BUCKET = REGISTRY.register("wooden_bucket", () -> new WoodenBucketItem());
  public static final RegistryObject<Item> WOODEN_BUCKET_WATER = REGISTRY.register("wooden_bucket_water", () -> new WoodenBucketWaterItem());
  public static final RegistryObject<Item> WOODEN_BUCKET_LAVA = REGISTRY.register("wooden_bucket_lava", () -> new WoodenBucketLavaItem());
  public static final RegistryObject<Item> WOODEN_BUCKET_ENCHANTED_WATER = REGISTRY.register("wooden_bucket_enchanted_water",    () -> new WoodenBucketEnchantedWaterItem());
  public static final RegistryObject<Item> WOODEN_BUCKET_MURKY_WATER = REGISTRY.register("wooden_bucket_murky_water",    () -> new WoodenBucketMurkyWaterItem());
  public static final RegistryObject<Item> WOODEN_BUCKET_SALT_WATER = REGISTRY.register("wooden_bucket_salt_water",    () -> new WoodenBucketSaltWaterItem());

  //Ceramic Buckets
  public static final RegistryObject<Item> CERAMIC_BUCKET = REGISTRY.register("ceramic_bucket", () -> new CeramicBucketItem());
  public static final RegistryObject<Item> CERAMIC_BUCKET_WATER = REGISTRY.register("ceramic_bucket_water", () -> new CeramicBucketWaterItem());
  public static final RegistryObject<Item> CERAMIC_BUCKET_LAVA = REGISTRY.register("ceramic_bucket_lava", () -> new CeramicBucketLavaItem());
  public static final RegistryObject<Item> CERAMIC_BUCKET_ENCHANTED_WATER = REGISTRY.register("ceramic_bucket_enchanted_water",    () -> new CeramicBucketEnchantedWaterItem());
  public static final RegistryObject<Item> CERAMIC_BUCKET_MURKY_WATER = REGISTRY.register("ceramic_bucket_murky_water",    () -> new CeramicBucketMurkyWaterItem());
  public static final RegistryObject<Item> CERAMIC_BUCKET_SALT_WATER = REGISTRY.register("ceramic_bucket_salt_water",    () -> new CeramicBucketSaltWaterItem());

  //Saplings
  public static final RegistryObject<Item> OAK_SEED = REGISTRY.register("oak_seed", () -> new OakSeedItem());
  public static final RegistryObject<Item> SPRUCE_SEED = REGISTRY.register("spruce_seed", () -> new SpruceSeedItem());
  public static final RegistryObject<Item> BIRCH_SEED = REGISTRY.register("birch_seed", () -> new BirchSeedItem());
  public static final RegistryObject<Item> JUNGLE_SEED = REGISTRY.register("jungle_seed", () -> new JungleSeedItem());
  public static final RegistryObject<Item> ACACIA_SEED = REGISTRY.register("acacia_seed", () -> new AcaciaSeedItem());
  public static final RegistryObject<Item> DARK_OAK_SEED = REGISTRY.register("dark_oak_seed", () -> new DarkOakSeedItem());

  //Plant Seeds
  public static final RegistryObject<Item> BAMBOO_SEED = REGISTRY.register("bamboo_seed", () -> new BambooSeedItem());
  public static final RegistryObject<Item> CACTUS_SEED = REGISTRY.register("cactus_seed", () -> new CactusSeedItem());
  public static final RegistryObject<Item> CARROT_SEED = REGISTRY.register("carrot_seed", () -> new CarrotSeedItem());
  public static final RegistryObject<Item> ENCHANTED_SEED = REGISTRY.register("enchanted_seed", () -> new EnchantedSeedItem());
  public static final RegistryObject<Item> GRASS_SEED = REGISTRY.register("grass_seed", () -> new GrassSeedItem());
  public static final RegistryObject<Item> KELP_SEED = REGISTRY.register("kelp_seed", () -> new KelpSeedItem());
  public static final RegistryObject<Item> POTATO_SEED = REGISTRY.register("potato_seed", () -> new PotatoSeedItem());
  public static final RegistryObject<Item> SUGARCANE_SEED = REGISTRY.register("sugarcane_seed", () -> new SugarcaneSeedItem());

  //Pebbles
  public static final RegistryObject<Item> COBBLESTONE_PEBBLE = REGISTRY.register("cobblestone_pebble", () -> new CobblestonePebbleItem());
  public static final RegistryObject<Item> GRANITE_PEBBLE = REGISTRY.register("granite_pebble", () -> new GranitePebbleItem());
  public static final RegistryObject<Item> DIORITE_PEBBLE = REGISTRY.register("diorite_pebble", () -> new DioritePebbleItem());
  public static final RegistryObject<Item> ANDESITE_PEBBLE = REGISTRY.register("andesite_pebble", () -> new AndesitePebbleItem());
  public static final RegistryObject<Item> DEEPSLATE_PEBBLE = REGISTRY.register("deepslate_pebble", () -> new DeepslatePebbleItem());
  public static final RegistryObject<Item> BLACKSTONE_PEBBLE = REGISTRY.register("blackstone_pebble", () -> new BlackstonePebbleItem());
  public static final RegistryObject<Item> TUFF_PEBBLE = REGISTRY.register("tuff_pebble", () -> new TuffPebbleItem());

  //Dusts
  public static final RegistryObject<Item> CHROME_DUST = REGISTRY.register("chrome_dust", () -> new ChromeDustItem());
  public static final RegistryObject<Item> GRAPHITE_DUST = REGISTRY.register("graphite_dust", () -> new GraphiteDustItem());
  public static final RegistryObject<Item> MITHRIL_DUST = REGISTRY.register("mithril_dust", () -> new MithrilDustItem());
  public static final RegistryObject<Item> SALTPETER_DUST = REGISTRY.register("saltpeter_dust", () -> new SaltpeterDustItem());
  public static final RegistryObject<Item> SILICON_DUST = REGISTRY.register("silicon_dust", () -> new SiliconDustItem());
  public static final RegistryObject<Item> SKYSTONE_DUST = REGISTRY.register("skystone_dust", () -> new SkystoneDustItem());
  public static final RegistryObject<Item> SULFUR_DUST = REGISTRY.register("sulfur_dust", () -> new SulfurDustItem());

  //Chunks & Pieces
  public static final RegistryObject<Item> ALUMINUM_CHUNK = REGISTRY.register("aluminum_chunk", () -> new AluminumChunkItem());
  public static final RegistryObject<Item> ALUMINUM_PIECE = REGISTRY.register("aluminum_piece", () -> new AluminumPieceItem());
  public static final RegistryObject<Item> BLAZING_QUARTZ_CHUNK = REGISTRY.register("blazing_quartz_chunk", () -> new BlazingQuartzChunkItem());
  public static final RegistryObject<Item> BLAZING_QUARTZ_PIECE = REGISTRY.register("blazing_quartz_piece", () -> new BlazingQuartzPieceItem());
  public static final RegistryObject<Item> COBALT_CHUNK = REGISTRY.register("cobalt_chunk", () -> new CobaltChunkItem());
  public static final RegistryObject<Item> COBALT_PIECE = REGISTRY.register("cobalt_piece", () -> new CobaltPieceItem());
  public static final RegistryObject<Item> COPPER_CHUNK = REGISTRY.register("copper_chunk", () -> new CopperChunkItem());
  public static final RegistryObject<Item> COPPER_PIECE = REGISTRY.register("copper_piece", () -> new CopperPieceItem());
  public static final RegistryObject<Item> DRAGONSTONE_CHUNK = REGISTRY.register("dragonstone_chunk", () -> new DragonstoneChunkItem());
  public static final RegistryObject<Item> DRAGONSTONE_PIECE = REGISTRY.register("dragonstone_piece", () -> new DragonstonePieceItem());
  public static final RegistryObject<Item> ELEMENTIUM_CHUNK = REGISTRY.register("elementium_chunk", () -> new ElementiumChunkItem());
  public static final RegistryObject<Item> ELEMENTIUM_PIECE = REGISTRY.register("elementium_piece", () -> new ElementiumPieceItem());
  public static final RegistryObject<Item> GOLD_CHUNK = REGISTRY.register("gold_chunk", () -> new GoldChunkItem());
  public static final RegistryObject<Item> GOLD_PIECE = REGISTRY.register("gold_piece", () -> new GoldPieceItem());
  public static final RegistryObject<Item> IRIDIUM_CHUNK = REGISTRY.register("iridium_chunk", () -> new IridiumChunkItem());
  public static final RegistryObject<Item> IRIDIUM_PIECE = REGISTRY.register("iridium_piece", () -> new IridiumPieceItem());
  public static final RegistryObject<Item> IRON_CHUNK = REGISTRY.register("iron_chunk", () -> new IronChunkItem());
  public static final RegistryObject<Item> IRON_PIECE = REGISTRY.register("iron_piece", () -> new IronPieceItem());
  public static final RegistryObject<Item> LEAD_CHUNK = REGISTRY.register("lead_chunk", () -> new LeadChunkItem());
  public static final RegistryObject<Item> LEAD_PIECE = REGISTRY.register("lead_piece", () -> new LeadPieceItem());
  public static final RegistryObject<Item> NICKEL_CHUNK = REGISTRY.register("nickel_chunk", () -> new NickelChunkItem());
  public static final RegistryObject<Item> NICKEL_PIECE = REGISTRY.register("nickel_piece", () -> new NickelPieceItem());
  public static final RegistryObject<Item> OSMIUM_CHUNK = REGISTRY.register("osmium_chunk", () -> new OsmiumChunkItem());
  public static final RegistryObject<Item> OSMIUM_PIECE = REGISTRY.register("osmium_piece", () -> new OsmiumPieceItem());
  public static final RegistryObject<Item> PLATINUM_CHUNK = REGISTRY.register("platinum_chunk", () -> new PlatinumChunkItem());
  public static final RegistryObject<Item> PLATINUM_PIECE = REGISTRY.register("platinum_piece", () -> new PlatinumPieceItem());
  public static final RegistryObject<Item> SILVER_CHUNK = REGISTRY.register("silver_chunk", () -> new SilverChunkItem());
  public static final RegistryObject<Item> SILVER_PIECE = REGISTRY.register("silver_piece", () -> new SilverPieceItem());
  public static final RegistryObject<Item> SOULSTONE_CHUNK = REGISTRY.register("soulstone_chunk", () -> new SoulstoneChunkItem());
  public static final RegistryObject<Item> SOULSTONE_PIECE = REGISTRY.register("soulstone_piece", () -> new SoulstonePieceItem());
  public static final RegistryObject<Item> STARMETAL_CHUNK = REGISTRY.register("starmetal_chunk", () -> new StarmetalChunkItem());
  public static final RegistryObject<Item> STARMETAL_PIECE = REGISTRY.register("starmetal_piece", () -> new StarmetalPieceItem());
  public static final RegistryObject<Item> TIN_CHUNK = REGISTRY.register("tin_chunk", () -> new TinChunkItem());
  public static final RegistryObject<Item> TIN_PIECE = REGISTRY.register("tin_piece", () -> new TinPieceItem());
  public static final RegistryObject<Item> TITANIUM_CHUNK = REGISTRY.register("titanium_chunk", () -> new TitaniumChunkItem());
  public static final RegistryObject<Item> TITANIUM_PIECE = REGISTRY.register("titanium_piece", () -> new TitaniumPieceItem());
  public static final RegistryObject<Item> TUNGSTEN_CHUNK = REGISTRY.register("tungsten_chunk", () -> new TungstenChunkItem());
  public static final RegistryObject<Item> TUNGSTEN_PIECE = REGISTRY.register("tungsten_piece", () -> new TungstenPieceItem());
  public static final RegistryObject<Item> URANINITE_PIECE = REGISTRY.register("uraninite_piece", () -> new UraninitePieceItem());
  public static final RegistryObject<Item> URANIUM_CHUNK = REGISTRY.register("uranium_chunk", () -> new UraniumChunkItem());
  public static final RegistryObject<Item> URANIUM_PIECE = REGISTRY.register("uranium_piece", () -> new UraniumPieceItem());
  public static final RegistryObject<Item> ZINC_CHUNK = REGISTRY.register("zinc_chunk", () -> new ZincChunkItem());
  public static final RegistryObject<Item> ZINC_PIECE = REGISTRY.register("zinc_piece", () -> new ZincPieceItem());

  //Ingots
  public static final RegistryObject<Item> ALUMINUM_INGOT = REGISTRY.register("aluminum_ingot", () -> new AluminumIngotItem());
  public static final RegistryObject<Item> BLAZING_QUARTZ_INGOT = REGISTRY.register("blazing_quartz_ingot", () -> new BlazingQuartzIngotItem());
  public static final RegistryObject<Item> BRASS_INGOT = REGISTRY.register("brass_ingot", () -> new BrassIngotItem());
  public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
  public static final RegistryObject<Item> CHROME_INGOT = REGISTRY.register("chrome_ingot", () -> new ChromeIngotItem());
  public static final RegistryObject<Item> COBALT_INGOT = REGISTRY.register("cobalt_ingot", () -> new CobaltIngotItem());
  public static final RegistryObject<Item> CONSTANTAN_INGOT = REGISTRY.register("constantan_ingot", () -> new ConstantanIngotItem());
  public static final RegistryObject<Item> DRAGONSTONE_INGOT = REGISTRY.register("dragonstone_ingot", () -> new DragonstoneIngotItem());
  public static final RegistryObject<Item> ELECTRUM_INGOT = REGISTRY.register("electrum_ingot", () -> new ElectrumIngotItem());
  public static final RegistryObject<Item> ELEMENTIUM_INGOT = REGISTRY.register("elementium_ingot", () -> new ElementiumIngotItem());
  public static final RegistryObject<Item> ENDERIUM_INGOT = REGISTRY.register("enderium_ingot", () -> new EnderiumIngotItem());
  public static final RegistryObject<Item> GRAPHITE_INGOT = REGISTRY.register("graphite_ingot", () -> new GraphiteIngotItem());
  public static final RegistryObject<Item> INVAR_INGOT = REGISTRY.register("invar_ingot", () -> new InvarIngotItem());
  public static final RegistryObject<Item> IRIDIUM_INGOT = REGISTRY.register("iridium_ingot", () -> new IridiumIngotItem());
  public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
  public static final RegistryObject<Item> LUMIUM_INGOT = REGISTRY.register("lumium_ingot", () -> new LumiumIngotItem());
  public static final RegistryObject<Item> NICKEL_INGOT = REGISTRY.register("nickel_ingot", () -> new NickelIngotItem());
  public static final RegistryObject<Item> OSMIUM_INGOT = REGISTRY.register("osmium_ingot", () -> new OsmiumIngotItem());
  public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
  public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
  public static final RegistryObject<Item> SOULSTONE_INGOT = REGISTRY.register("soulstone_ingot", () -> new SoulstoneIngotItem());
  public static final RegistryObject<Item> STARMETAL_INGOT = REGISTRY.register("starmetal_ingot", () -> new StarmetalIngotItem());
  public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
  public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
  public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
  public static final RegistryObject<Item> TUNGSTEN_INGOT = REGISTRY.register("tungsten_ingot", () -> new TungstenIngotItem());
  public static final RegistryObject<Item> URANIUM_INGOT = REGISTRY.register("uranium_ingot", () -> new UraniumIngotItem());
  public static final RegistryObject<Item> ZINC_INGOT = REGISTRY.register("zinc_ingot", () -> new ZincIngotItem());

  //Materiel Blocks
  public static final RegistryObject<Item> ALUMINUM_BLOCK = block(RakinatorModBlocks.ALUMINUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> BLAZE_BLOCK = block(RakinatorModBlocks.BLAZE_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> BRASS_BLOCK = block(RakinatorModBlocks.BRASS_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> BRONZE_BLOCK = block(RakinatorModBlocks.BRONZE_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> CHROME_BLOCK = block(RakinatorModBlocks.CHROME_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> COBALT_BLOCK = block(RakinatorModBlocks.COBALT_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> CONSTANTAN_BLOCK = block(RakinatorModBlocks.CONSTANTAN_BLOCK,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> DRAGONSTONE_BLOCK = block(RakinatorModBlocks.DRAGONSTONE_BLOCK,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> ELECTRUM_BLOCK = block(RakinatorModBlocks.ELECTRUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> ELEMENTIUM_BLOCK = block(RakinatorModBlocks.ELEMENTIUM_BLOCK,    RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> ENDERIUM_BLOCK = block(RakinatorModBlocks.ENDERIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> GRAPHITE_BLOCK = block(RakinatorModBlocks.GRAPHITE_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> INVAR_BLOCK = block(RakinatorModBlocks.INVAR_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> IRIDIUM_BLOCK = block(RakinatorModBlocks.IRIDIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> LEAD_BLOCK = block(RakinatorModBlocks.LEAD_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> LUMIUM_BLOCK = block(RakinatorModBlocks.LUMIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> NICKEL_BLOCK = block(RakinatorModBlocks.NICKEL_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> OSMIUM_BLOCK = block(RakinatorModBlocks.OSMIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> PLATINUM_BLOCK = block(RakinatorModBlocks.PLATINUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SILVER_BLOCK = block(RakinatorModBlocks.SILVER_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> SOULSTONE_BLOCK = block(RakinatorModBlocks.SOULSTONE_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> STARMETAL_BLOCK = block(RakinatorModBlocks.STARMETAL_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> STEEL_BLOCK = block(RakinatorModBlocks.STEEL_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> TIN_BLOCK = block(RakinatorModBlocks.TIN_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> TITANIUM_BLOCK = block(RakinatorModBlocks.TITANIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(RakinatorModBlocks.TUNGSTEN_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> URANIUM_BLOCK = block(RakinatorModBlocks.URANIUM_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);
  public static final RegistryObject<Item> ZINC_BLOCK = block(RakinatorModBlocks.ZINC_BLOCK, RakinatorModTabs.TAB_RAKINATOR_CREATIVE_TAB);

  //Elements
  public static final RegistryObject<Item> AIR_ELEMENT = REGISTRY.register("air_element", () -> new AirElementItem());
  public static final RegistryObject<Item> EARTH_ELEMENT = REGISTRY.register("earth_element", () -> new EarthElementItem());
  public static final RegistryObject<Item> FIRE_ELEMENT = REGISTRY.register("fire_element", () -> new FireElementItem());
  public static final RegistryObject<Item> WATER_ELEMENT = REGISTRY.register("water_element", () -> new WaterElementItem());

  //Crystals
  public static final RegistryObject<Item> AMYTHEST_CRYSTAL = REGISTRY.register("amythest_crystal", () -> new AmythestCrystalItem());
  public static final RegistryObject<Item> INFERIUM_CRYSTAL = REGISTRY.register("inferium_crystal", () -> new InferiumCrystalItem());
  public static final RegistryObject<Item> NETHER_QUARTZ_CRYSTAL = REGISTRY.register("nether_quartz_crystal", () -> new NetherQuartzCrystalItem());
  public static final RegistryObject<Item> PERIDOT_CRYSTAL = REGISTRY.register("peridot_crystal", () -> new PeridotCrystalItem());
  public static final RegistryObject<Item> PROSPERITY_CRYSTAL = REGISTRY.register("prosperity_crystal", () -> new ProsperityCrystalItem());
  public static final RegistryObject<Item> QUARTZ_CRYSTAL = REGISTRY.register("quartz_crystal", () -> new QuartzCrystalItem());
  public static final RegistryObject<Item> ROCK_CRYSTAL = REGISTRY.register("rock_crystal", () -> new RockCrystalItem());
  public static final RegistryObject<Item> RUBY_CRYSTAL = REGISTRY.register("ruby_crystal", () -> new RubyCrystalItem());
  public static final RegistryObject<Item> SAPPHIRE_CRYSTAL = REGISTRY.register("sapphire_crystal", () -> new SapphireCrystalItem());
  public static final RegistryObject<Item> SOULIUM_CRYSTAL = REGISTRY.register("soulium_crystal", () -> new SouliumCrystalItem());
  public static final RegistryObject<Item> TOPAZ_CRYSTAL = REGISTRY.register("topaz_crystal", () -> new TopazCrystalItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
