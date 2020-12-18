package com.test.heritage.core.repositories;

import org.springframework.data.repository.CrudRepository;

import com.test.heritage.core.entities.position.Position;

public interface PositionRepositoryInterface extends CrudRepository<Position, Integer> {

}
