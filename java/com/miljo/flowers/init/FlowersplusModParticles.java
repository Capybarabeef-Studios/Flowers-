
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.miljo.flowers.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.miljo.flowers.client.particle.ButterflyParticleRedParticle;
import com.miljo.flowers.client.particle.ButterflyParticleParticle;
import com.miljo.flowers.client.particle.ButterflyParticleMintParticle;
import com.miljo.flowers.client.particle.ButterflyParticleMagentaParticle;
import com.miljo.flowers.client.particle.ButterflyParticleBlueParticle;
import com.miljo.flowers.client.particle.AromaParticleParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FlowersplusModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FlowersplusModParticleTypes.BUTTERFLY_PARTICLE.get(), ButterflyParticleParticle::provider);
		event.registerSpriteSet(FlowersplusModParticleTypes.AROMA_PARTICLE.get(), AromaParticleParticle::provider);
		event.registerSpriteSet(FlowersplusModParticleTypes.BUTTERFLY_PARTICLE_RED.get(), ButterflyParticleRedParticle::provider);
		event.registerSpriteSet(FlowersplusModParticleTypes.BUTTERFLY_PARTICLE_BLUE.get(), ButterflyParticleBlueParticle::provider);
		event.registerSpriteSet(FlowersplusModParticleTypes.BUTTERFLY_PARTICLE_MAGENTA.get(), ButterflyParticleMagentaParticle::provider);
		event.registerSpriteSet(FlowersplusModParticleTypes.BUTTERFLY_PARTICLE_MINT.get(), ButterflyParticleMintParticle::provider);
	}
}
