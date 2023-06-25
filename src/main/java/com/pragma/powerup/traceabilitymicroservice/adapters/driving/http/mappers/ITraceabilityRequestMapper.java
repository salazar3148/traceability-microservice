package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.mappers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityRequestDto;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityRequestMapper {
    Traceability traceabilityRequestDtoToTraceability(TraceabilityRequestDto traceabilityRequestDto);
}
