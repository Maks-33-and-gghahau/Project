package ru.mng.thepointofnoreturn.item;

import ru.mng.thepointofnoreturn.init.ThePointOfNoreturnModItems;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.component.UseRemainder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.core.component.DataComponents;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TomateSoupItem extends Item {
	public TomateSoupItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}

	@SubscribeEvent
	public static void modifyItemComponents(ModifyDefaultComponentsEvent event) {
		event.modify(ThePointOfNoreturnModItems.TOMATE_SOUP.get(), builder -> builder.set(DataComponents.USE_REMAINDER, new UseRemainder(new ItemStack(ThePointOfNoreturnModItems.CAN.get()))));
	}
}