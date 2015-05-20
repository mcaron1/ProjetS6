package ca.usherbrooke.s6projet.server.guice;

import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.Injector;
import com.google.inject.Guice;
import ca.usherbrooke.s6projet.server.guice.ServerModule;
import ca.usherbrooke.s6projet.server.guice.DispatchServletModule;

public class GuiceServletConfig extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice
				.createInjector(new ServerModule(), new DispatchServletModule());
	}
}
