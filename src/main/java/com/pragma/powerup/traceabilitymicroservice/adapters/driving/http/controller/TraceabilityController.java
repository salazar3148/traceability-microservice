package com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.controller;

import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityRequestDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.dto.TraceabilityResponseDto;
import com.pragma.powerup.traceabilitymicroservice.adapters.driving.http.handlers.ITraceabilityHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.pragma.powerup.traceabilitymicroservice.config.Constants.RESPONSE_MESSAGE_KEY;
import static com.pragma.powerup.traceabilitymicroservice.config.Constants.TRACEABILITY_ADDED_MESSAGE;

@RestController
@RequiredArgsConstructor
@RequestMapping("/traceability")
public class TraceabilityController {

    private final ITraceabilityHandler traceabilityHandler;

    @Operation(summary = "get traceability of one order",
            responses = {
                    @ApiResponse(responseCode = "200", description = "traceability returned",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map")))
            })
    @GetMapping("/{orderId}")
    public ResponseEntity<List<TraceabilityResponseDto>> consultTraceability(@PathVariable Long orderId) {
        return ResponseEntity.status(HttpStatus.OK).body(traceabilityHandler.consultTraceability(orderId));
    }

    @Operation(summary = "add traceability to an order",
            responses = {
                    @ApiResponse(responseCode = "201", description = "traceability added",
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Map")))
            })
    @PostMapping
    public ResponseEntity<Map<String, String>> saveTraceability(@RequestBody TraceabilityRequestDto traceabilityRequestDto) {
        traceabilityHandler.saveTraceability(traceabilityRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(RESPONSE_MESSAGE_KEY, TRACEABILITY_ADDED_MESSAGE));
    }
}
