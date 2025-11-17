package com.flightapp.dto;

import lombok.Data;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class SearchRequest {
    @NotBlank
    @NotNull
    private String fromPlace;
    @NotBlank
    @NotNull
    private String toPlace;
    @NotNull
    private LocalDate journeyDate;
}

