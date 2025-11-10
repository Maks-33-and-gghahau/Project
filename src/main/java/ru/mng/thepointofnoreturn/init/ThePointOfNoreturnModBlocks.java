/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.block.TrwaBlock;
import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class ThePointOfNoreturnModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ThePointOfNoreturnMod.MODID);
	public static final DeferredBlock<Block> TRWA = register("trwa", TrwaBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}