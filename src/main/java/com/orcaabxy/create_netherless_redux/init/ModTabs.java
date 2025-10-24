package com.orcaabxy.create_netherless_redux.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.orcaabxy.create_netherless_redux.CreateNetherlessRedux;

public class ModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateNetherlessRedux.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_NETHERLESS_REDUX = REGISTRY.register("create_netherless_redux",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.create_netherless_redux.create_netherless_redux")).icon(() -> new ItemStack(ModItems.FLINT_ROD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ModItems.FLINT_ROD.get().asItem());
			}).build());
}