package com.test.heritage.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.heritage.core.services.PositionServiceInterface;

@Controller
public class PositionController {

	/*Commentaire de test*/

	@Autowired
	private PositionServiceInterface positionService;

	public void listAllPositions() {
		positionService.getAllPositions().forEach( pos -> System.out.println( pos ) );
	}
}
