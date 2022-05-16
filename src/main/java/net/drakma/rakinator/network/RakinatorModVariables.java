package net.drakma.rakinator.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RakinatorModVariables {
	public static double barrel_time_between_filling = 300.0;
	public static double collector_days_to_fill = 4.0;
	public static boolean collector_filled_today = false;
	public static double crucible_time_between_smelting = 1200.0;
	public static double wooden_bucket_lava_damage = 1.5;
	public static double heat_block_modifier_1 = 1.0;
	public static double heat_block_modifier_2 = 3.0;
	public static double heat_block_modifier_3 = 10.0;
	public static double heat_block_modifier_4 = 25.0;
	public static double composting_time = 240.0;
	public static List<String> ResourceList = new ArrayList<String>();
	public static double wooden_bucket_lava_burn_interval = 20.0;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
