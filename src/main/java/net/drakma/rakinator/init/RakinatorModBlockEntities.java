
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.drakma.rakinator.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.drakma.rakinator.block.entity.WoodenBarrel0BlockEntity;
import net.drakma.rakinator.block.entity.StoneBarrel0BlockEntity;
import net.drakma.rakinator.block.entity.Crucible0BlockEntity;
import net.drakma.rakinator.block.entity.Composter0BlockEntity;
import net.drakma.rakinator.block.entity.Collector0BlockEntity;
import net.drakma.rakinator.RakinatorMod;

public class RakinatorModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RakinatorMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> WOODEN_BARREL_0 = register("wooden_barrel_0", RakinatorModBlocks.WOODEN_BARREL_0,
			WoodenBarrel0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STONE_BARREL_0 = register("stone_barrel_0", RakinatorModBlocks.STONE_BARREL_0,
			StoneBarrel0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUCIBLE_0 = register("crucible_0", RakinatorModBlocks.CRUCIBLE_0,
			Crucible0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COLLECTOR_0 = register("collector_0", RakinatorModBlocks.COLLECTOR_0,
			Collector0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COMPOSTER_0 = register("composter_0", RakinatorModBlocks.COMPOSTER_0,
			Composter0BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
