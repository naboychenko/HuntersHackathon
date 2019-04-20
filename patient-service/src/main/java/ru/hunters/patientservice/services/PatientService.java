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

    public List<Patient> getPatientsByOrganization(String organizationId) {
        return patientRepository.findByOrganizationId(organizationId);
    }

    public Patient getPatientByOrganizationIdAndPatientId(String organizationId, String patientId) {
        Patient patient = patientRepository.findByOrganizationIdAndPatientId(organizationId, patientId);
        patient.setComment(serviceConfig.getExampleProperty());
        return patient;
    }

    public void savePatient(String organizationId, Patient patient) {
        patient.setPatientId(UUID.randomUUID().toString());
        patient.setOrganizationId(organizationId);
        patientRepository.save(patient);
    }

    public void updatePatient(String organizationId, String patientId, Patient patient) {
        Patient patientToUpdate = patientRepository.findByOrganizationIdAndPatientId(organizationId, patientId);
        patient.setPatientId(patientToUpdate.getPatientId());
        patient.setOrganizationId(patientToUpdate.getOrganizationId());
        patientRepository.save(patient);
    }

    public void deletePatient(String organizationId, String patientId) {
        Patient patient = patientRepository.findByOrganizationIdAndPatientId(organizationId, patientId);
        patientRepository.delete(patient);
    }
}
