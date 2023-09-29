package com.ikm.PGR.Contract;


import jakarta.persistence.CascadeType;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GrievianceRequest {

    private UUID id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @NotEmpty(message = "Address cannot be empty")
    private String address;

    private String phone;

    @NotEmpty(message = "Grievance cannot be empty")
    private String grievance;

    private LocalDate dateofsubmission;

}