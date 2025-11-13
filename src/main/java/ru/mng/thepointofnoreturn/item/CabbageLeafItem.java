package ru.mng.thepointofnoreturn.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CabbageLeafItem extends Item {
	public CabbageLeafItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0f).build()));
	}
}