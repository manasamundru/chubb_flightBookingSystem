package com.flightapp.dto;

import lombok.Data;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Data
public class BookingRequest {
    @NotBlank
    private String name;
    @Email
    private String email;
    @Min(1)
    @Max(500)
    private int seats;
    @NotEmpty
    private List<PassengerRequest> passengers;
}

