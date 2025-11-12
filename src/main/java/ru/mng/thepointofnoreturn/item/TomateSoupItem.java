package ru.mng.thepointofnoreturn.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TomateSoupItem extends Item {
	public TomateSoupItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()).usingConvertsTo(Blocks.PALE_HANGING_MOSS.asItem()));
	}
}