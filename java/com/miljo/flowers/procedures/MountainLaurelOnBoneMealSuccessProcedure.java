package com.miljo.flowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import com.miljo.flowers.init.FlowersplusModBlocks;

public class MountainLaurelOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (FlowersplusModBlocks.MOUNTAIN_LAUREL.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y - 1, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			world.setBlock(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 3), y, z + Mth.nextDouble(RandomSource.create(), 1, 3)), FlowersplusModBlocks.MOUNTAIN_LAUREL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x + Mth.nextDouble(RandomSource.create(), 1, 3), y, z - Mth.nextDouble(RandomSource.create(), 1, 3)), FlowersplusModBlocks.MOUNTAIN_LAUREL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 3), y, z - Mth.nextDouble(RandomSource.create(), 1, 3)), FlowersplusModBlocks.MOUNTAIN_LAUREL.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x - Mth.nextDouble(RandomSource.create(), 1, 3), y, z + Mth.nextDouble(RandomSource.create(), 1, 3)), FlowersplusModBlocks.MOUNTAIN_LAUREL.get().defaultBlockState(), 3);
		}
	}
}
