package com.ikm.PGR.Repository;

import com.ikm.PGR.Model.Grieviance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface GrievianceRepository extends JpaRepository<Grieviance, UUID> {
}
