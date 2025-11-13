package ru.mng.thepointofnoreturn.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CabbageRollsItem extends Item {
	public CabbageRollsItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.5f).build()));
	}
}