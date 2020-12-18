package com.test.heritage.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.heritage.core.entities.spotstate.SpotState;
import com.test.heritage.core.services.SpotStateServiceInterface;

@Controller
public class SpotStateController {

	@Autowired
	private SpotStateServiceInterface spotStateService;

	public SpotStateServiceInterface getSpotStateService() {
		return spotStateService;
	}

	public void setSpotStateService( SpotStateServiceInterface spotStateService ) {
		this.spotStateService = spotStateService;
	}

	public void writeAllSpotStates() {
		spotStateService.getAllSpotStates().forEach( sst -> System.out.println( sst ) );
	}

	public SpotState save( SpotState sst ) {
		return spotStateService.save( sst );
	}
}
