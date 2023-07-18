
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.qwerty_tech.morebuildingblocks.init;

import net.qwerty_tech.morebuildingblocks.MorebuildingblocksMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

public class MorebuildingblocksModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MorebuildingblocksMod.MODID);
	public static final RegistryObject<Item> ACACIA_LOG_STAIRS = block(MorebuildingblocksModBlocks.ACACIA_LOG_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
