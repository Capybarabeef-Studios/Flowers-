
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import com.miljo.flowers.FlowersplusMod;

public class FlowersplusModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, FlowersplusMod.MODID);
	public static final DeferredHolder<Potion, Potion> AROMA = REGISTRY.register("aroma", () -> new Potion("aroma", new MobEffectInstance(FlowersplusModMobEffects.AROMA_POTION_EFFECT, 6000, 0, false, true)));
}
