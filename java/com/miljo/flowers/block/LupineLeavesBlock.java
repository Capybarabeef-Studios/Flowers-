
package com.miljo.flowers.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

import com.miljo.flowers.procedures.LupineLeavesAdditionalHarvestConditionProcedure;

public class LupineLeavesBlock extends LeavesBlock {
	@Override
	public MapCodec<? extends LeavesBlock> codec() {
		return null;
	}

	@Override
	protected void spawnFallingLeavesParticle(Level level, BlockPos blockPos, RandomSource randomSource) {
	}

	public LupineLeavesBlock(BlockBehaviour.Properties properties) {
		super(1f, properties.sound(SoundType.AZALEA_LEAVES).strength(1f, 10f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 1;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		return super.canHarvestBlock(state, world, pos, player) && LupineLeavesAdditionalHarvestConditionProcedure.execute(player.level(), pos.getX(), pos.getY(), pos.getZ(), player);
	}
}
