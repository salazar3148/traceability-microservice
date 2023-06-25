package com.pragma.powerup.traceabilitymicroservice.domain.api;


import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;

import java.util.List;

public interface ITraceabilityServicePort {
    List<Traceability> consultTraceability(Long idOrder);
    void saveTraceability(Traceability traceability);
}
