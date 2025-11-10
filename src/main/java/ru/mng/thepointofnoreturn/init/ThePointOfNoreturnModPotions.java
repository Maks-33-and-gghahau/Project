/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.core.registries.Registries;

public class ThePointOfNoreturnModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, ThePointOfNoreturnMod.MODID);
	public static final DeferredHolder<Potion, Potion> AWESR = REGISTRY.register("awesr", () -> new Potion("awesr"));
}