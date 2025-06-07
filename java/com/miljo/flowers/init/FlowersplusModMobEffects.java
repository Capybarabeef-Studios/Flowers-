
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import com.miljo.flowers.potion.AromaPotionEffectMobEffect;
import com.miljo.flowers.FlowersplusMod;

public class FlowersplusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, FlowersplusMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> AROMA_POTION_EFFECT = REGISTRY.register("aroma_potion_effect", () -> new AromaPotionEffectMobEffect());
}
