package ru.mng.thepointofnoreturn.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class FriedEggItem extends Item {
	public FriedEggItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.2f).build()));
	}
}