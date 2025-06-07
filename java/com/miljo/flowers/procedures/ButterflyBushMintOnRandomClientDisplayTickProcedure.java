package com.miljo.flowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import com.miljo.flowers.init.FlowersplusModParticleTypes;

public class ButterflyBushMintOnRandomClientDisplayTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double offsetX = 0;
		double offsetY = 0;
		double offsetZ = 0;
		offsetX = (Math.random() - 0.5) * 8;
		offsetY = Math.random() * 5;
		offsetZ = (Math.random() - 0.5) * 8;
		world.addParticle((SimpleParticleType) (FlowersplusModParticleTypes.BUTTERFLY_PARTICLE_MINT.get()), (x + offsetX), (y + offsetY), (z + offsetZ), (Mth.nextInt(RandomSource.create(), 0, (int) 0.02)), 0.03,
				(Mth.nextInt(RandomSource.create(), 0, (int) 0.02)));
	}
}
