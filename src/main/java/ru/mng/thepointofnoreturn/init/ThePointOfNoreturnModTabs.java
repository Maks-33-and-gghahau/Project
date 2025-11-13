/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ThePointOfNoreturnModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThePointOfNoreturnMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(ThePointOfNoreturnModBlocks.TRASH_BLOCK.get().asItem());
			tabData.accept(ThePointOfNoreturnModBlocks.CARTON_BOX_BLOCK.get().asItem());
			tabData.accept(ThePointOfNoreturnModBlocks.BOX_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ThePointOfNoreturnModItems.HEMP_FIBER.get());
			tabData.accept(ThePointOfNoreturnModItems.STONE.get());
			tabData.accept(ThePointOfNoreturnModItems.PLANKS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ThePointOfNoreturnModItems.BAT.get());
			tabData.accept(ThePointOfNoreturnModItems.BAT_SPICES.get());
			tabData.accept(ThePointOfNoreturnModItems.IRON_KNIFE.get());
		}
	}
}