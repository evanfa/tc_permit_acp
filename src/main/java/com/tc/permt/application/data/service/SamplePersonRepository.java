package com.tc.permt.application.data.service;

import com.tc.permt.application.data.entity.SamplePerson;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}