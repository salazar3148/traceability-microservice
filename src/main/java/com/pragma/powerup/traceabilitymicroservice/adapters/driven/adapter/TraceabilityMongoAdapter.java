package com.pragma.powerup.traceabilitymicroservice.adapters.driven.adapter;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mappers.ITraceabilityDocumentMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.repository.ITraceabilityRepository;
import com.pragma.powerup.traceabilitymicroservice.domain.model.Traceability;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TraceabilityMongoAdapter implements ITraceabilityPersistencePort {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityDocumentMapper traceabilityDocumentMapper;
    @Override
    public List<Traceability> getTraceabilityByOrderId(Long orderId) {
        return traceabilityDocumentMapper.traceabilityDocumentListToTracealibityList(
                traceabilityRepository.findAllByOrderId(orderId)
        );
    }

    @Override
    public void saveTraceability(Traceability traceability) {
        traceabilityRepository.save(
                traceabilityDocumentMapper.traceabilityToTraceabilityDocument(
                        traceability
                )
        );
    }
}
