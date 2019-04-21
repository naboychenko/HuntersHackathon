package ru.hunters.patientservice.repository;

import ru.hunters.common.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends CrudRepository<Patient, String> {
    Patient findByIdentifier(String identifier);
    List<Patient> findAll();
}
