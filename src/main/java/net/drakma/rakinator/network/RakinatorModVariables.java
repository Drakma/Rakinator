package net.drakma.rakinator.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RakinatorModVariables {
	public static double barrel_time_between_filling = 150.0;
	public static double collector_days_to_fill = 4.0;
	public static boolean collector_filled_today = false;
	public static double crucible_time_between_smelting = 1200.0;
	public static double wooden_lava_bucket_damage = 0.5;
	public static double heat_block_modifier_1 = 1.0;
	public static double heat_block_modifier_2 = 0.8;
	public static double heat_block_modifier_3 = 0.6;
	public static double heat_block_modifier_4 = 0.4;
	public static double heat_block_modifier_5 = 0.2;
	public static double composting_time = 240.0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
