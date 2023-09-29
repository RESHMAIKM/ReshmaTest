package com.ikm.PGR.Controller;

import com.ikm.PGR.Contract.GrievianceRequest;
import com.ikm.PGR.Contract.GrievianceResponse;
import com.ikm.PGR.Contract.Response;
import com.ikm.PGR.Model.Grieviance;
import com.ikm.PGR.Service.GrievianceService;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Validated
@RestController
@RequestMapping("/citizen")
@RequiredArgsConstructor
public class GrievianceController {

    private final GrievianceService grievianceService;

    @SneakyThrows
    @Operation(summary = "Create Grievance")
    @PostMapping(value = {"/save-grievance"})
    public ResponseEntity<Response> saveEmployee(@Valid @RequestBody GrievianceRequest request){
        Grieviance grieviance = grievianceService.saveGrievance(request);
        GrievianceResponse grievianceResponse =
                GrievianceResponse.builder()
                        .id(
                                grieviance.getId())
                        .build();
        return new ResponseEntity<>(
                Response.builder()
                        .payload(grievianceResponse)
                        .message("Successfully saved")
                        .build(),
                HttpStatus.OK);
    }


}
