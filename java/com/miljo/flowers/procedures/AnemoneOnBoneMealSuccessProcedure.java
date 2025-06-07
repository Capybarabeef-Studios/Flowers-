package com.miljo.flowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import com.miljo.flowers.init.FlowersplusModBlocks;

public class AnemoneOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (FlowersplusModBlocks.ANEMONE.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y - 1, z))) {
			world.setBlock(BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 1, 2), y, z + Mth.nextInt(RandomSource.create(), 1, 2)), FlowersplusModBlocks.ANEMONE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + Mth.nextInt(RandomSource.create(), 1, 2), y, z - Mth.nextInt(RandomSource.create(), 1, 2)), FlowersplusModBlocks.ANEMONE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - Mth.nextInt(RandomSource.create(), 1, 2), y, z + Mth.nextInt(RandomSource.create(), 1, 2)), FlowersplusModBlocks.ANEMONE.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - Mth.nextInt(RandomSource.create(), 1, 2), y, z - Mth.nextInt(RandomSource.create(), 1, 2)), FlowersplusModBlocks.ANEMONE.get().defaultBlockState(), 3);
		}
	}
}
