package com.orcaabxy.create_netherless_redux.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.orcaabxy.create_netherless_redux.CreateNetherlessRedux;

public class ModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CreateNetherlessRedux.MODID);
	public static final DeferredItem<Item> FLINT_ROD = REGISTRY.registerSimpleItem("flint_rod");
	public static final DeferredItem<Item> INCOMPLETE_BLAZE_ROD = REGISTRY.registerSimpleItem("incomplete_blaze_rod");
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}