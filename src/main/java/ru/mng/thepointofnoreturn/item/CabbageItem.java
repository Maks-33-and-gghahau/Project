package ru.mng.thepointofnoreturn.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CabbageItem extends Item {
	public CabbageItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.2f).build()));
	}
}