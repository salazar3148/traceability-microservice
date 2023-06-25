package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.mappers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityResponseDto;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityResponseMapper {
    TraceabilityResponseDto traceabilityToTraceabilityResponseDto(Traceability traceability);
    List<TraceabilityResponseDto> traceabilityListToTraceabilityRespondeDtoList(List<Traceability> traceabilityList);
}
