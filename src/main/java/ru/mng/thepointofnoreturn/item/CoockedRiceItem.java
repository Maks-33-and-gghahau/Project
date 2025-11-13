package ru.mng.thepointofnoreturn.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CoockedRiceItem extends Item {
	public CoockedRiceItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4f).build()).usingConvertsTo(Items.BOWL));
	}
}