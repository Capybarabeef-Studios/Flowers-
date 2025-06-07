
package com.miljo.flowers.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import com.miljo.flowers.FlowersplusMod;

public class AromaPotionEffectMobEffect extends MobEffect {
	public AromaPotionEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -43345);
		this.addAttributeModifier(Attributes.MAX_HEALTH, ResourceLocation.fromNamespaceAndPath(FlowersplusMod.MODID, "effect.aroma_potion_effect_0"), 0.1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.BLOCK_INTERACTION_RANGE, ResourceLocation.fromNamespaceAndPath(FlowersplusMod.MODID, "effect.aroma_potion_effect_1"), 0.2, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.LUCK, ResourceLocation.fromNamespaceAndPath(FlowersplusMod.MODID, "effect.aroma_potion_effect_2"), 0.5, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.OXYGEN_BONUS, ResourceLocation.fromNamespaceAndPath(FlowersplusMod.MODID, "effect.aroma_potion_effect_3"), 0.4, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.FOLLOW_RANGE, ResourceLocation.fromNamespaceAndPath(FlowersplusMod.MODID, "effect.aroma_potion_effect_4"), 1, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MINING_EFFICIENCY, ResourceLocation.fromNamespaceAndPath(FlowersplusMod.MODID, "effect.aroma_potion_effect_5"), 0.3, AttributeModifier.Operation.ADD_VALUE);
	}
}
