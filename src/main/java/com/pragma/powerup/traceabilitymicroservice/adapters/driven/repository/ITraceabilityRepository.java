package com.pragma.powerup.traceabilitymicroservice.adapters.driven.repository;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.document.TraceabilityDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ITraceabilityRepository extends MongoRepository<TraceabilityDocument, Long> {
    List<TraceabilityDocument> findAllByOrderId(Long orderId);
}
