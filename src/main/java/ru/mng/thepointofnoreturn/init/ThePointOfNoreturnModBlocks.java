/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.block.TrashBlockBlock;
import ru.mng.thepointofnoreturn.block.CartonBoxBlockBlock;
import ru.mng.thepointofnoreturn.block.BoxBlockBlock;
import ru.mng.thepointofnoreturn.block.BlockYorkBlock;
import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class ThePointOfNoreturnModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ThePointOfNoreturnMod.MODID);
	public static final DeferredBlock<Block> TRASH_BLOCK = register("trash_block", TrashBlockBlock::new);
	public static final DeferredBlock<Block> CARTON_BOX_BLOCK = register("carton_box_block", CartonBoxBlockBlock::new);
	public static final DeferredBlock<Block> BOX_BLOCK = register("box_block", BoxBlockBlock::new);
	public static final DeferredBlock<Block> BLOCK_YORK = register("block_york", BlockYorkBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}