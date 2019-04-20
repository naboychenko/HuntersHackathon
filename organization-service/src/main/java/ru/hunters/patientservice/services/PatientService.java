package ru.hunters.patientservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hunters.patientservice.config.ServiceConfig;
import ru.hunters.patientservice.model.Patient;
import ru.hunters.patientservice.repository.PatientRepository;

import java.util.List;
import java.util.UUID;

@Service
public class PatientService {

    private final PatientRepository patientRepository;
    private final ServiceConfig serviceConfig;

    @Autowired
    public PatientService(
            PatientRepository patientRepository,
            ServiceConfig serviceConfig) {
        this.patientRepository = patientRepository;
        this.serviceConfig = serviceConfig;
    }

    public List<Patient> getPatientsByName(String name) {
        return patientRepository.findAllByName(name);
    }

    public Patient getPatientByIdentifier(String identifier) {
        return patientRepository.findByIdentifier(identifier);
    }

    public void savePatient(Patient patient) {
        patient.setIdentifier(UUID.randomUUID().toString());
        patientRepository.save(patient);
    }

    public void updatePatient(String identifier, Patient patient) {
        patientRepository.save(patient);
    }

    public void deletePatient(String identifier) {
        Patient patient = patientRepository.findByIdentifier(identifier);
        patientRepository.delete(patient);
    }
}
