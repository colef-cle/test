package com.test.heritage.core.services;

import com.test.heritage.core.entities.spotstate.SpotState;

public interface SpotStateServiceInterface {

	Iterable<SpotState> getAllSpotStates();

	SpotState save( SpotState sst );
}
