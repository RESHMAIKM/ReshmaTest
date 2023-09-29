package com.ikm.PGR.Service;

import com.ikm.PGR.Contract.GrievianceRequest;
import com.ikm.PGR.Model.Grieviance;
import com.ikm.PGR.Repository.GrievianceRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GrievianceService {

    private final GrievianceRepository grievianceRepository;
    private  final ModelMapper modelMapper = new ModelMapper();

    public Grieviance saveGrievance(GrievianceRequest request) {
        Grieviance grieviance=modelMapper.map(request,Grieviance.class);
        return grievianceRepository.save(grieviance);

    }
}
