package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.impl;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityRequestDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityResponseDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.mappers.ITraceabilityRequestMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.mappers.ITraceabilityResponseMapper;
import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TraceabilityHandlerImpl implements ITraceabilityHandler {

    private final ITraceabilityServicePort traceabilityServicePort;
    private final ITraceabilityRequestMapper traceabilityRequestMapper;
    private final ITraceabilityResponseMapper traceabilityResponseMapper;

    @Override
    public List<TraceabilityResponseDto> consultTraceability(Long idOrder) {
        return traceabilityResponseMapper.traceabilityListToTraceabilityRespondeDtoList(
                traceabilityServicePort.consultTraceability(idOrder)
        );
    }
    @Override
    public void saveTraceability(TraceabilityRequestDto traceabilityRequestDto) {
        traceabilityServicePort.saveTraceability(
                traceabilityRequestMapper.traceabilityRequestDtoToTraceability(
                        traceabilityRequestDto
                )
        );
    }
}
