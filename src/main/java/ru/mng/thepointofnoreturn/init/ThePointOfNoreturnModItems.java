/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.item.ZincIngotItem;
import ru.mng.thepointofnoreturn.item.WaterBottleItem;
import ru.mng.thepointofnoreturn.item.TomatoSeedsItem;
import ru.mng.thepointofnoreturn.item.TomateSoupItem;
import ru.mng.thepointofnoreturn.item.StringItem;
import ru.mng.thepointofnoreturn.item.StoneItem;
import ru.mng.thepointofnoreturn.item.SteelIngotItem;
import ru.mng.thepointofnoreturn.item.SteelComponentItem;
import ru.mng.thepointofnoreturn.item.SilverIngotItem;
import ru.mng.thepointofnoreturn.item.RotItem;
import ru.mng.thepointofnoreturn.item.PlanksItem;
import ru.mng.thepointofnoreturn.item.NickelIngotItem;
import ru.mng.thepointofnoreturn.item.MetalNuggetLeadItem;
import ru.mng.thepointofnoreturn.item.MaterialComponentElectronicItem;
import ru.mng.thepointofnoreturn.item.LeadIngotItem;
import ru.mng.thepointofnoreturn.item.LatchkeyItem;
import ru.mng.thepointofnoreturn.item.IronWireItem;
import ru.mng.thepointofnoreturn.item.IronKnifeItem;
import ru.mng.thepointofnoreturn.item.HempFiberItem;
import ru.mng.thepointofnoreturn.item.HempFabricItem;
import ru.mng.thepointofnoreturn.item.GooglesItem;
import ru.mng.thepointofnoreturn.item.GazetaItem;
import ru.mng.thepointofnoreturn.item.FuelItem;
import ru.mng.thepointofnoreturn.item.FryingItem;
import ru.mng.thepointofnoreturn.item.FriedRiceItem;
import ru.mng.thepointofnoreturn.item.FriedEggItem;
import ru.mng.thepointofnoreturn.item.FilterItem;
import ru.mng.thepointofnoreturn.item.ExperienceNuggetItem;
import ru.mng.thepointofnoreturn.item.ElectrumIngotItem;
import ru.mng.thepointofnoreturn.item.ElectronTubeItem;
import ru.mng.thepointofnoreturn.item.CopperWireItem;
import ru.mng.thepointofnoreturn.item.CopperSpiralItem;
import ru.mng.thepointofnoreturn.item.CoockedRiceItem;
import ru.mng.thepointofnoreturn.item.ConstantanIngotItem;
import ru.mng.thepointofnoreturn.item.CoffeeBeanItem;
import ru.mng.thepointofnoreturn.item.CanItem;
import ru.mng.thepointofnoreturn.item.CabbageseedsItem;
import ru.mng.thepointofnoreturn.item.CabbageRollsItem;
import ru.mng.thepointofnoreturn.item.CabbageLeafItem;
import ru.mng.thepointofnoreturn.item.CabbageItem;
import ru.mng.thepointofnoreturn.item.BunkerComponentItem;
import ru.mng.thepointofnoreturn.item.BronzeIngotItem;
import ru.mng.thepointofnoreturn.item.BatteryItem;
import ru.mng.thepointofnoreturn.item.BatSpicesItem;
import ru.mng.thepointofnoreturn.item.BatItem;
import ru.mng.thepointofnoreturn.item.AntenaItem;
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
	public static final DeferredItem<Item> TOMATO_SEEDS = register("tomato_seeds", TomatoSeedsItem::new);
	public static final DeferredItem<Item> CABBAGESEEDS = register("cabbageseeds", CabbageseedsItem::new);
	public static final DeferredItem<Item> GAZETA = register("gazeta", GazetaItem::new);
	public static final DeferredItem<Item> WATER_BOTTLE = register("water_bottle", WaterBottleItem::new);
	public static final DeferredItem<Item> TOMATE_SOUP = register("tomate_soup", TomateSoupItem::new);
	public static final DeferredItem<Item> ZINC_INGOT = register("zinc_ingot", ZincIngotItem::new);
	public static final DeferredItem<Item> HEMP_FABRIC = register("hemp_fabric", HempFabricItem::new);
	public static final DeferredItem<Item> METAL_NUGGET_LEAD = register("metal_nugget_lead", MetalNuggetLeadItem::new);
	public static final DeferredItem<Item> COPPER_WIRE = register("copper_wire", CopperWireItem::new);
	public static final DeferredItem<Item> IRON_WIRE = register("iron_wire", IronWireItem::new);
	public static final DeferredItem<Item> ANTENA = register("antena", AntenaItem::new);
	public static final DeferredItem<Item> BUNKER_COMPONENT = register("bunker_component", BunkerComponentItem::new);
	public static final DeferredItem<Item> CAN = register("can", CanItem::new);
	public static final DeferredItem<Item> COPPER_SPIRAL = register("copper_spiral", CopperSpiralItem::new);
	public static final DeferredItem<Item> ELECTRON_TUBE = register("electron_tube", ElectronTubeItem::new);
	public static final DeferredItem<Item> EXPERIENCE_NUGGET = register("experience_nugget", ExperienceNuggetItem::new);
	public static final DeferredItem<Item> FILTER = register("filter", FilterItem::new);
	public static final DeferredItem<Item> FRYING = register("frying", FryingItem::new);
	public static final DeferredItem<Item> FUEL = register("fuel", FuelItem::new);
	public static final DeferredItem<Item> GOOGLES = register("googles", GooglesItem::new);
	public static final DeferredItem<Item> BAT = register("bat", BatItem::new);
	public static final DeferredItem<Item> BATTERY = register("battery", BatteryItem::new);
	public static final DeferredItem<Item> BAT_SPICES = register("bat_spices", BatSpicesItem::new);
	public static final DeferredItem<Item> CABBAGE = register("cabbage", CabbageItem::new);
	public static final DeferredItem<Item> CABBAGE_LEAF = register("cabbage_leaf", CabbageLeafItem::new);
	public static final DeferredItem<Item> CABBAGE_ROLLS = register("cabbage_rolls", CabbageRollsItem::new);
	public static final DeferredItem<Item> COFFEE_BEAN = register("coffee_bean", CoffeeBeanItem::new);
	public static final DeferredItem<Item> COOCKED_RICE = register("coocked_rice", CoockedRiceItem::new);
	public static final DeferredItem<Item> FRIED_EGG = register("fried_egg", FriedEggItem::new);
	public static final DeferredItem<Item> FRIED_RICE = register("fried_rice", FriedRiceItem::new);
	public static final DeferredItem<Item> IRON_KNIFE = register("iron_knife", IronKnifeItem::new);
	public static final DeferredItem<Item> LATCHKEY = register("latchkey", LatchkeyItem::new);
	public static final DeferredItem<Item> MATERIAL_COMPONENT_ELECTRONIC = register("material_component_electronic", MaterialComponentElectronicItem::new);
	public static final DeferredItem<Item> STEEL_COMPONENT = register("steel_component", SteelComponentItem::new);
	public static final DeferredItem<Item> STEEL_INGOT = register("steel_ingot", SteelIngotItem::new);
	public static final DeferredItem<Item> SILVER_INGOT = register("silver_ingot", SilverIngotItem::new);
	public static final DeferredItem<Item> BRONZE_INGOT = register("bronze_ingot", BronzeIngotItem::new);
	public static final DeferredItem<Item> CONSTANTAN_INGOT = register("constantan_ingot", ConstantanIngotItem::new);
	public static final DeferredItem<Item> ELECTRUM_INGOT = register("electrum_ingot", ElectrumIngotItem::new);
	public static final DeferredItem<Item> LEAD_INGOT = register("lead_ingot", LeadIngotItem::new);
	public static final DeferredItem<Item> NICKEL_INGOT = register("nickel_ingot", NickelIngotItem::new);

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