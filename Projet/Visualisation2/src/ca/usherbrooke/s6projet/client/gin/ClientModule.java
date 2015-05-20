package ca.usherbrooke.s6projet.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import ca.usherbrooke.s6projet.client.place.ClientPlaceManager;
import ca.usherbrooke.s6projet.client.core.MainPagePresenter;
import ca.usherbrooke.s6projet.client.core.MainPageView;
import ca.usherbrooke.s6projet.client.place.DefaultPlace;
import ca.usherbrooke.s6projet.client.place.NameTokens;
import ca.usherbrooke.s6projet.client.core.ResponsePresenter;
import ca.usherbrooke.s6projet.client.core.ResponseView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class,
				MainPageView.class, MainPagePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.main);

		bindPresenter(ResponsePresenter.class, ResponsePresenter.MyView.class,
				ResponseView.class, ResponsePresenter.MyProxy.class);
	}
}
