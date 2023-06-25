package com.pragma.powerup.traceabilitymicroservice.adapters.driven.mappers;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.document.TraceabilityDocument;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityDocumentMapper {
    Traceability traceabilityDocumentToTraceability(TraceabilityDocument traceabilityDocument);
    TraceabilityDocument traceabilityToTraceabilityDocument(Traceability traceability);
    List<Traceability> traceabilityDocumentListToTracealibityList(List<TraceabilityDocument> traceabilityDocumentList);
}
