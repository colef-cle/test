package com.test.heritage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.test.heritage.core.controllers.PositionController;
import com.test.heritage.core.controllers.SpotStateController;
import com.test.heritage.core.entities.position.IndoorPosition;
import com.test.heritage.core.entities.position.Position;
import com.test.heritage.core.entities.spotstate.OutdoorRepairSpotState;
import com.test.heritage.core.entities.spotstate.RepairEfficiency;
import com.test.heritage.core.entities.spotstate.SpotState;

@SpringBootApplication
public class TestHeritageApplication {

	@Bean
	public Integer getSpotStateController( SpotStateController controller ) {
<<<<<<< HEAD
		System.out.println("NON DE DIEU");
=======
		System.out.println("Entering method getSporController");
>>>>>>> refs/heads/master
		Position position = new IndoorPosition();
		
<<<<<<< HEAD
=======
		System.out.println("tryout something");
>>>>>>> refs/heads/master
		position.setAlias( "new SDF In" );

		OutdoorRepairSpotState ors = new OutdoorRepairSpotState(
		        "ceci est une description de outdoor" // description
		        , true// interValidation
		        , true// customerCanSee
		        , false// needMonitoring
		        , (short) 69// radialPosition
		        , false// warranted
		        , null// endOfWarranty
		        , false// toBeHlpMonitored
		        , RepairEfficiency.NOT_REPAIRED// efficiency
		        , position// position
		);

		System.out.println( ors );
		controller.save( ors );
		System.out.println( ors );

		controller.writeAllSpotStates();

		SpotState ss = new SpotState( 1, "blablabla", true, false, false );
		System.out.println( ss );

		System.out.println( "aller test modif" );
		System.out.println( "aller test modif encore encore" );

		return 0;
	}

	@Bean
	public Integer getPositionController( PositionController controller ) {

		controller.listAllPositions();

		return 0;
	}

	public static void main( String[] args ) {
		SpringApplication.run( TestHeritageApplication.class, args );
	}

}
