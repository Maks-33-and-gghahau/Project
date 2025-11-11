/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.mng.thepointofnoreturn.init;

import ru.mng.thepointofnoreturn.client.gui.TrashGUIScreen;
import ru.mng.thepointofnoreturn.client.gui.FridgeGUIScreen;
import ru.mng.thepointofnoreturn.client.gui.CreateGUIScreen;
import ru.mng.thepointofnoreturn.client.gui.CartonBoxGUIScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThePointOfNoreturnModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ThePointOfNoreturnModMenus.TRASH_GUI.get(), TrashGUIScreen::new);
		event.register(ThePointOfNoreturnModMenus.FRIDGE_GUI.get(), FridgeGUIScreen::new);
		event.register(ThePointOfNoreturnModMenus.CREATE_GUI.get(), CreateGUIScreen::new);
		event.register(ThePointOfNoreturnModMenus.CARTON_BOX_GUI.get(), CartonBoxGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}