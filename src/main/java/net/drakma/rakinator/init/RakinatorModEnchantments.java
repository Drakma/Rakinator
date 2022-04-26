
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.drakma.rakinator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.drakma.rakinator.enchantment.ElementalistEnchantment;
import net.drakma.rakinator.RakinatorMod;

public class RakinatorModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RakinatorMod.MODID);
	public static final RegistryObject<Enchantment> ELEMENTALIST = REGISTRY.register("elementalist", () -> new ElementalistEnchantment());
}
