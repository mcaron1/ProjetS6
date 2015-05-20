package ca.usherbrooke.s6projet.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import ca.usherbrooke.s6projet.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.inject.Provider;
import ca.usherbrooke.s6projet.client.core.MainPagePresenter;
import ca.usherbrooke.s6projet.client.core.ResponsePresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	Provider<MainPagePresenter> getMainPagePresenter();

	Provider<ResponsePresenter> getResponsePresenter();
}
