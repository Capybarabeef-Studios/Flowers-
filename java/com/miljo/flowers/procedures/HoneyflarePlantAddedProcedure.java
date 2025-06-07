package com.miljo.flowers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class HoneyflarePlantAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double bee_number = 0;
		bee_number = Mth.nextDouble(RandomSource.create(), 1, 4);
		if (bee_number == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		} else {
			if (bee_number == 2) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
			} else {
				if (bee_number == 3) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
				} else {
					if (bee_number == 4) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.BEE.spawn(_level, BlockPos.containing(x, y, z), EntitySpawnReason.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					}
				}
			}
		}
	}
}
