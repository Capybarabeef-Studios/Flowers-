
package com.miljo.flowers.block;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import com.mojang.serialization.MapCodec;

import com.miljo.flowers.procedures.AromafloraBlockOnRandomClientDisplayTickProcedure;

public class AromafloraBlockBlock extends LeavesBlock {
	@Override
	public MapCodec<? extends LeavesBlock> codec() {
		return null;
	}

	@Override
	protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {
	}

	public AromafloraBlockBlock(BlockBehaviour.Properties properties) {
		super(1f, properties.sound(SoundType.AZALEA_LEAVES).strength(0.5f, 10f).jumpFactor(0.8f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 1;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		Player entity = Minecraft.getInstance().player;
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		AromafloraBlockOnRandomClientDisplayTickProcedure.execute(world, x, y, z);
	}
}
