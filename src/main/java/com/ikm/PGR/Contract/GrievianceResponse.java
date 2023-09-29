package com.ikm.PGR.Contract;

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
public class GrievianceResponse {

    private UUID id;

//    private String name;
//
//    private String address;
//
//    private String phone;
//
//    private String grievance;
//
//    private LocalDate dateofsubmission;
}
