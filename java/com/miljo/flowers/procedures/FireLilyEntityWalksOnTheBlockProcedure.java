package com.miljo.flowers.procedures;

import net.minecraft.world.entity.Entity;

public class FireLilyEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			entity.igniteForSeconds(30);
		}
	}
}
