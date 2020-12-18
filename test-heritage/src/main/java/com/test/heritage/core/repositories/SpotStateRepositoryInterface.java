package com.test.heritage.core.repositories;

import org.springframework.data.repository.CrudRepository;

import com.test.heritage.core.entities.spotstate.SpotState;

public interface SpotStateRepositoryInterface extends CrudRepository<SpotState, Integer> {

}
