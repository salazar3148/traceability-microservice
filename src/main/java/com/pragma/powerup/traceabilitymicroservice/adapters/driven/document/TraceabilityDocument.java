package com.pragma.powerup.traceabilitymicroservice.adapters.driven.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "TRACEABILITY")
@AllArgsConstructor
@Getter
public class TraceabilityDocument {
    @Id
    private String id;
    private Long orderId;
    private Long customerId;
    private String customerMail;
    private LocalDateTime date;
    private String oldStatus;
    private String newStatus;
    private Long employeeId;
    private String employeeMail;
}
