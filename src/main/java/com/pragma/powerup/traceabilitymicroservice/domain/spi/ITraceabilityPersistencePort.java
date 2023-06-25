package com.pragma.powerup.traceabilitymicroservice.domain.spi;

import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityPersistencePort {
    List<Traceability> getTraceabilityByOrderId(Long orderId);
    void saveTraceability(Traceability traceability);
}
