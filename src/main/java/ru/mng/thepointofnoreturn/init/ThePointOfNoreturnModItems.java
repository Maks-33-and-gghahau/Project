/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.item.StringItem;
import ru.mng.thepointofnoreturn.item.StoneItem;
import ru.mng.thepointofnoreturn.item.RotItem;
import ru.mng.thepointofnoreturn.item.PlanksItem;
import ru.mng.thepointofnoreturn.item.HempFiberItem;
import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

public class ThePointOfNoreturnModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThePointOfNoreturnMod.MODID);
	public static final DeferredItem<Item> TRASH_BLOCK = block(ThePointOfNoreturnModBlocks.TRASH_BLOCK);
	public static final DeferredItem<Item> HEMP_FIBER = register("hemp_fiber", HempFiberItem::new);
	public static final DeferredItem<Item> STONE = register("stone", StoneItem::new);
	public static final DeferredItem<Item> STRING = register("string", StringItem::new);
	public static final DeferredItem<Item> ROT = register("rot", RotItem::new);
	public static final DeferredItem<Item> PLANKS = register("planks", PlanksItem::new);
	public static final DeferredItem<Item> CARTON_BOX_BLOCK = block(ThePointOfNoreturnModBlocks.CARTON_BOX_BLOCK);
	public static final DeferredItem<Item> BOX_BLOCK = block(ThePointOfNoreturnModBlocks.BOX_BLOCK);
	public static final DeferredItem<Item> BLOCK_YORK = block(ThePointOfNoreturnModBlocks.BLOCK_YORK);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}