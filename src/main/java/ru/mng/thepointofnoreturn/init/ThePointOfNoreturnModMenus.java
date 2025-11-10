/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.world.inventory.TrashGUIMenu;
import ru.mng.thepointofnoreturn.world.inventory.FridgeGUIMenu;
import ru.mng.thepointofnoreturn.world.inventory.CreateGUIMenu;
import ru.mng.thepointofnoreturn.network.MenuStateUpdateMessage;
import ru.mng.thepointofnoreturn.ThePointOfNoreturnMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class ThePointOfNoreturnModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ThePointOfNoreturnMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TrashGUIMenu>> TRASH_GUI = REGISTRY.register("trash_gui", () -> IMenuTypeExtension.create(TrashGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FridgeGUIMenu>> FRIDGE_GUI = REGISTRY.register("fridge_gui", () -> IMenuTypeExtension.create(FridgeGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CreateGUIMenu>> CREATE_GUI = REGISTRY.register("create_gui", () -> IMenuTypeExtension.create(CreateGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof ThePointOfNoreturnModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}