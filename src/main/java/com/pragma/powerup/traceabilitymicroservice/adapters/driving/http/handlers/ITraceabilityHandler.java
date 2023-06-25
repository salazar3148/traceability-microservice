package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityRequestDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityResponseDto;

import java.util.List;

public interface ITraceabilityHandler {
    List<TraceabilityResponseDto> consultTraceability(Long idOrder);
    void saveTraceability(TraceabilityRequestDto traceabilityRequestDto);
}
