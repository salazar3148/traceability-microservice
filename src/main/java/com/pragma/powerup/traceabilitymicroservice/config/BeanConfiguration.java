package com.pragma.powerup.traceabilitymicroservice.config;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.adapter.TraceabilityMongoAdapter;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.mappers.ITraceabilityDocumentMapper;
import com.pragma.powerup.traceabilitymicroservice.adapters.driven.repository.ITraceabilityRepository;
import com.pragma.powerup.traceabilitymicroservice.domain.api.ITraceabilityServicePort;
import com.pragma.powerup.traceabilitymicroservice.domain.spi.ITraceabilityPersistencePort;
import com.pragma.powerup.traceabilitymicroservice.domain.usecase.TraceabilityUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final ITraceabilityRepository traceabilityRepository;
    private final ITraceabilityDocumentMapper traceabilityDocumentMapper;

    @Bean
    public ITraceabilityPersistencePort traceabilityPersistencePort(){
        return new TraceabilityMongoAdapter(traceabilityRepository, traceabilityDocumentMapper);
    }

    @Bean
    public ITraceabilityServicePort traceabilityServicePort(){
        return new TraceabilityUseCase(traceabilityPersistencePort());
    }
}
