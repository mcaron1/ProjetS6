package ca.usherbrooke.s6projet.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import ca.usherbrooke.s6projet.shared.SendTextToServer;
import ca.usherbrooke.s6projet.server.SendTextToServerActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(SendTextToServer.class, SendTextToServerActionHandler.class);
	}
}
