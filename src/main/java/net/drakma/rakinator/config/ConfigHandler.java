package net.drakma.rakinator.config;

import net.drakma.rakinator.RakinatorMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.ForgeConfigSpec.DoubleValue;
import net.minecraftforge.common.ForgeConfigSpec.DoubleValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import org.checkerframework.common.value.qual.IntVal;

public class ConfigHandler {
	public static class Common {
		public final IntValue woodenBarrelRainFillInterval;
		public final IntValue woodenBarrelRainFillAmount;

		public final IntValue stoneBarrelRainFillInterval;
		public final IntValue stoneBarrelRainFillAmount;
    
		public final IntValue barrelTransformEnchantedWaterTicks;
		public final IntValue barrelTransformNetherrackTicks;
		public final IntValue barrelTransformEndStoneTicks;
     
		public final IntValue crucibleMeltingInterval;
		public final IntValue crucibleMeltingAmount;
		public final IntValue crucibleHeatBlockMultiplierLevel1;
		public final IntValue crucibleHeatBlockMultiplierLevel2;
		public final IntValue crucibleHeatBlockMultiplierLevel3;
		public final IntValue crucibleHeatBlockMultiplierLevel4;
   
    public final IntValue collectorDaysToFill;

    public final IntValue compostingInterval;

		public final IntValue woodenBucketLavaBurnInterval;
		public final DoubleValue woodenBucketLavaBurnDamage;

		Common(ForgeConfigSpec.Builder builder) {
			//General Settings
			builder.comment("Barrels")
					.push("barrel")
          .push("wooden");
        
          woodenBarrelRainFillInterval = builder	
					.comment("Ticks between rain fills [default: 300]")
					.defineInRange("woodenBarrelRainFillInterval", 300, 1, 1000);

          woodenBarrelRainFillAmount = builder	
					.comment("mB of rain to fill each interval [default: 200]")
					.defineInRange("woodenBarrelRainFillAmount", 200, 1, 1000);

          builder.pop().push("stone");
          stoneBarrelRainFillInterval = builder	
					.comment("Ticks between rain fills [default: 200]")
					.defineInRange("stoneBarrelRainFillInterval", 200, 1, 1000);

          stoneBarrelRainFillAmount = builder	
					.comment("mB of rain to fill each interval [default: 200]")
					.defineInRange("stoneBarrelRainFillAmount", 200, 1, 1000);
   
          builder.pop().push("transformations");
          
          barrelTransformEnchantedWaterTicks = builder	
					.comment("Ticks for water to convert to Enchanted Water [default: 300]")
					.defineInRange("barrelTransformEnchantedWaterTicks", 300, 1, 25000);
   
          barrelTransformNetherrackTicks = builder	
					.comment("Ticks for lava to convert to netherack [default: 300]")
					.defineInRange("barrelTransformNetherrackTicks", 400, 1, 25000);
   
          barrelTransformEndStoneTicks = builder	
					.comment("Ticks for lava to convert to end stone [default: 300]")
					.defineInRange("barrelTransformEndStoneTicks", 600, 1, 25000);
   
          builder.pop().pop();

      builder.comment("Crucible settings")
      .push("crucible");

        crucibleMeltingInterval = builder
        .comment("Ticks between melting [default: 1200]")
        .defineInRange("crucibleMeltingInterval", 1200, 1, 100000);

        crucibleMeltingAmount = builder
        .comment("Lava per block [default: 200]\n Should be evenly divisible into 1000")
        .defineInRange("crucibleMeltingAmount", 200, 1, 1000);

        crucibleHeatBlockMultiplierLevel1 = builder
        .comment("Multiplier for blocks tagged as heatblock_1 [default: 1]")
        .defineInRange("crucibleHeatBlockMultiplierLevel1", 1, 1, 1000);

        crucibleHeatBlockMultiplierLevel2 = builder
        .comment("Multiplier for blocks tagged as heatblock_2 [default: 3]")
        .defineInRange("crucibleHeatBlockMultiplierLevel2", 3, 1, 1000);

        crucibleHeatBlockMultiplierLevel3 = builder
        .comment("Multiplier for blocks tagged as heatblock_3 [default: 10]")
        .defineInRange("crucibleHeatBlockMultiplierLevel3", 10, 1, 1000);

        crucibleHeatBlockMultiplierLevel4 = builder
        .comment("Multiplier for blocks tagged as heatblock_4 [default: 25]")
        .defineInRange("crucibleHeatBlockMultiplierLevel4", 25, 1, 1000);

      builder.pop();
      builder.comment("Collector settings")
      .push("collector");

        collectorDaysToFill = builder
        .comment("Total days needed to fill Collector [default: 4]")
        .defineInRange("collectorDaysToFill", 4, 1, 24);

      builder.pop();
      builder.comment("Composter settings")
      .push("composter");
  
        compostingInterval = builder
        .comment("Ticks to convert full inventory of compost to dirt [default: 600]")
        .defineInRange("compostingInterval", 600, 1, 6000);

      builder.pop();
      builder.comment("Bucket settings")
      .push("bucket");

        woodenBucketLavaBurnInterval = builder
        .comment("Ticks between burns [default: 20]")
        .defineInRange("woodenBucketLavaBurnInterval", 20, 1, 1000);

        woodenBucketLavaBurnDamage = builder
        .comment("Damage per burn interval [default: 1.5]")
        .defineInRange("woodenBucketLavaBurnDamage", 1.5, 0, 1000);
		}
	}

	public static final ForgeConfigSpec commonSpec;
	public static final Common COMMON;

	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		commonSpec = specPair.getRight();
		COMMON = specPair.getLeft();
	}

	@SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading configEvent) {
        RakinatorMod.LOGGER.debug("Loaded Rakinator's config file {}", configEvent.getConfig().getFileName());
    }

    @SubscribeEvent
    public static void onFileChange(final ModConfigEvent.Reloading configEvent) {
        RakinatorMod.LOGGER.fatal("Rakinator's config just got changed on the file system!");
    }
}