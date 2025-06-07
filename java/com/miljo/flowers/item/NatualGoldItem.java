
package com.miljo.flowers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NatualGoldItem extends Item {
	public NatualGoldItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(64));
	}
}
