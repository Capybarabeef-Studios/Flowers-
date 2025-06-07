
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.miljo.flowers.FlowersplusMod;

public class FlowersplusModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, FlowersplusMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BUTTERFLY_PARTICLE = REGISTRY.register("butterfly_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> AROMA_PARTICLE = REGISTRY.register("aroma_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BUTTERFLY_PARTICLE_RED = REGISTRY.register("butterfly_particle_red", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BUTTERFLY_PARTICLE_BLUE = REGISTRY.register("butterfly_particle_blue", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BUTTERFLY_PARTICLE_MAGENTA = REGISTRY.register("butterfly_particle_magenta", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BUTTERFLY_PARTICLE_MINT = REGISTRY.register("butterfly_particle_mint", () -> new SimpleParticleType(false));
}
