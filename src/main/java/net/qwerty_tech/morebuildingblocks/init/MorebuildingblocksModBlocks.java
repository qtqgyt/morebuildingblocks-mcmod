
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwerty_tech.morebuildingblocks.init;

import net.qwerty_tech.morebuildingblocks.block.AcaciaLogStairsBlock;
import net.qwerty_tech.morebuildingblocks.MorebuildingblocksMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class MorebuildingblocksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MorebuildingblocksMod.MODID);
	public static final RegistryObject<Block> ACACIA_LOG_STAIRS = REGISTRY.register("acacia_log_stairs", () -> new AcaciaLogStairsBlock());
}
