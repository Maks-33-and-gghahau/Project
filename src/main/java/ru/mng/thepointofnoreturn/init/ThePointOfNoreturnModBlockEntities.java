/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.block.entity.TrashBlockBlockEntity;
import ru.mng.thepointofnoreturn.block.entity.CartonBoxBlockBlockEntity;
import ru.mng.thepointofnoreturn.block.entity.BoxBlockBlockEntity;
import ru.mng.thepointofnoreturn.block.entity.BlockYorkBlockEntity;
import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ThePointOfNoreturnModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, ThePointOfNoreturnMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TrashBlockBlockEntity>> TRASH_BLOCK = register("trash_block", ThePointOfNoreturnModBlocks.TRASH_BLOCK, TrashBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CartonBoxBlockBlockEntity>> CARTON_BOX_BLOCK = register("carton_box_block", ThePointOfNoreturnModBlocks.CARTON_BOX_BLOCK, CartonBoxBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BoxBlockBlockEntity>> BOX_BLOCK = register("box_block", ThePointOfNoreturnModBlocks.BOX_BLOCK, BoxBlockBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlockYorkBlockEntity>> BLOCK_YORK = register("block_york", ThePointOfNoreturnModBlocks.BLOCK_YORK, BlockYorkBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TRASH_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, CARTON_BOX_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BOX_BLOCK.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLOCK_YORK.get(), SidedInvWrapper::new);
	}
}