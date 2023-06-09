package com.pragma.powerup.adapters.driven.mongo.repositories;

import com.pragma.powerup.adapters.driven.mongo.entity.TraceabilityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityEntity, Long> {
}
