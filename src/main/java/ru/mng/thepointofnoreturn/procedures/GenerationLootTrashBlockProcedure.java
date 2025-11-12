package ru.mng.thepointofnoreturn.procedures;

import ru.mng.thepointofnoreturn.init.ThePointOfNoreturnModItems;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class GenerationLootTrashBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double ID_slot = 0;
		double random = 0;
		ID_slot = 0;
		for (int index0 = 0; index0 < 14; index0++) {
			random = Mth.nextInt(RandomSource.create(), 1, 100);
			if (random <= 40) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.AIR).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			} else if (random > 40 && random <= 60) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.COBWEB).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			} else if (random > 60 && random <= 100) {
				random = Mth.nextInt(RandomSource.create(), 1, 100);
				if (random <= 55) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(
								(BuiltInRegistries.ITEM.getRandomElementOf(ItemTags.create(ResourceLocation.parse("neoforge:common_item")), RandomSource.create()).orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value())).copy();
						_setstack.setCount(1);
						_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
					}
				} else if (random > 55 && random <= 85) {
					random = Mth.nextInt(RandomSource.create(), 1, 30);
					if (random <= 5) {
						if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
							ItemStack _setstack = new ItemStack((BuiltInRegistries.ITEM.getRandomElementOf(ItemTags.create(ResourceLocation.parse("neoforge:uncommon_item_material")), RandomSource.create())
									.orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value())).copy();
							_setstack.setCount(1);
							_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
						}
					} else if (random > 5 && random <= 15) {
						if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
							ItemStack _setstack = new ItemStack(
									(BuiltInRegistries.ITEM.getRandomElementOf(ItemTags.create(ResourceLocation.parse("neoforge:uncommon_item_metal")), RandomSource.create()).orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value()))
									.copy();
							_setstack.setCount(1);
							_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
						}
					} else if (random > 15 && random <= 30) {
						if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
							ItemStack _setstack = new ItemStack(
									(BuiltInRegistries.ITEM.getRandomElementOf(ItemTags.create(ResourceLocation.parse("neoforge:uncommon_item")), RandomSource.create()).orElseGet(() -> BuiltInRegistries.ITEM.wrapAsHolder(Items.AIR)).value())).copy();
							_setstack.setCount(1);
							_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
						}
					}
				}
			}
			if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), (int) ID_slot).copy()).getItem() == ThePointOfNoreturnModItems.HEMP_FIBER.get()) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ThePointOfNoreturnModItems.HEMP_FIBER.get()).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), (int) ID_slot).copy()).getItem() == ThePointOfNoreturnModItems.STONE.get()) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ThePointOfNoreturnModItems.STONE.get()).copy();
					_setstack.setCount(2 * Mth.nextInt(RandomSource.create(), 1, 16));
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), (int) ID_slot).copy()).getItem() == ThePointOfNoreturnModItems.STRING.get()) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ThePointOfNoreturnModItems.STRING.get()).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), (int) ID_slot).copy()).getItem() == ThePointOfNoreturnModItems.ROT.get()) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ThePointOfNoreturnModItems.ROT.get()).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			} else if ((itemFromBlockInventory(world, BlockPos.containing(x, y, z), (int) ID_slot).copy()).getItem() == ThePointOfNoreturnModItems.PLANKS.get()) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(ThePointOfNoreturnModItems.PLANKS.get()).copy();
					_setstack.setCount(2 * Mth.nextInt(RandomSource.create(), 1, 16));
					_itemHandlerModifiable.setStackInSlot((int) ID_slot, _setstack);
				}
			}
			ID_slot = ID_slot + 1;
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}