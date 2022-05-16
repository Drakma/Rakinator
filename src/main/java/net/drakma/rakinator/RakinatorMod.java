/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and it won't get overwritten.
 *    If you change your modid or package, you need to apply these changes to this file MANUALLY.
 *
 *    Settings in @Mod annotation WON'T be changed in case of the base mod element
 *    files lock too, so you need to set them manually here in such case.
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.drakma.rakinator;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;

import net.drakma.rakinator.init.RakinatorModTabs;
import net.drakma.rakinator.init.RakinatorModItems;
import net.drakma.rakinator.init.RakinatorModFluids;
import net.drakma.rakinator.init.RakinatorModEnchantments;
import net.drakma.rakinator.init.RakinatorModBlocks;
import net.drakma.rakinator.init.RakinatorModBlockEntities;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;

@Mod("rakinator")
public class RakinatorMod {
	public static final Logger LOGGER = LogManager.getLogger(RakinatorMod.class);
	public static final String MODID = "rakinator";
	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
			PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
	private static int messageID = 0;

	public RakinatorMod() {
		RakinatorModTabs.load();
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		RakinatorModBlocks.REGISTRY.register(bus);
		RakinatorModItems.REGISTRY.register(bus);

		RakinatorModBlockEntities.REGISTRY.register(bus);

		RakinatorModFluids.REGISTRY.register(bus);
		RakinatorModEnchantments.REGISTRY.register(bus);

	}

	public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}
}
