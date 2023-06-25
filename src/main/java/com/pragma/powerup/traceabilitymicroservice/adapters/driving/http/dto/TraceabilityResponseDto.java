package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class TraceabilityResponseDto {
    private String id;
    private Long orderId;
    private String customerMail;
    private LocalDateTime date;
    private String oldStatus;
    private String newStatus;
    private String employeeId;
    private String employeeMail;
}
