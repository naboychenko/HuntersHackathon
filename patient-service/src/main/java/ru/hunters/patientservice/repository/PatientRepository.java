package ru.hunters.patientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hunters.patientservice.model.Patient;

import java.util.List;

@Repository
public interface PatientRepository extends CrudRepository<Patient, String> {
    List<Patient> findByOrganizationId(String organizationId);
    Patient findByOrganizationIdAndPatientId(String organizationId, String patientId);
}
