package com.pragma.powerup.traceabilitymicroservice.config;

import com.pragma.powerup.traceabilitymicroservice.adapters.driven.exceptions.TraceabilityNotFoundByOrderIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.Collections;
import java.util.Map;
import static com.pragma.powerup.traceabilitymicroservice.config.Constants.ORDER_NOT_FOUND_BY_ORDER_ID_MESSAGE;
import static com.pragma.powerup.traceabilitymicroservice.config.Constants.RESPONSE_ERROR_MESSAGE_KEY;

@ControllerAdvice
public class ControllerAdvisor {
    @ExceptionHandler(TraceabilityNotFoundByOrderIdException.class)
    public ResponseEntity<Map<String, String>> handleAuthenticationException(TraceabilityNotFoundByOrderIdException traceabilityNotFoundByOrderIdException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(RESPONSE_ERROR_MESSAGE_KEY, ORDER_NOT_FOUND_BY_ORDER_ID_MESSAGE));
    }
}
