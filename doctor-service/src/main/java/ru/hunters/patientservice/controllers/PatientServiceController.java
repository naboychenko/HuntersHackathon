package ru.hunters.patientservice.controllers;

import org.springframework.web.bind.annotation.*;
import ru.hunters.patientservice.model.Patient;
import ru.hunters.patientservice.services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/v1/organizations/{organizationId}/patients")
public class PatientServiceController {

    private final PatientService patientService;

    public PatientServiceController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getOrganizationPatients(@PathVariable String organizationId) {
        return patientService.getPatientsByOrganization(organizationId);
    }

    @GetMapping("/{patientId}")
    public Patient getOrganizationPatient(
            @PathVariable String organizationId,
            @PathVariable String patientId) {
        return patientService.getPatientByOrganizationIdAndPatientId(organizationId, patientId);
    }

    @PostMapping
    public void savePatient(
            @PathVariable String organizationId,
            @RequestBody Patient patient) {
        patientService.savePatient(organizationId, patient);
    }

    @PutMapping("/{patientId}")
    public void updatePatient(
            @PathVariable String organizationId,
            @PathVariable String patientId,
            @RequestBody Patient patient) {
        patientService.updatePatient(organizationId, patientId, patient);
    }

    @DeleteMapping("/{patientId")
    public void deletePatient(
            @PathVariable String organizationId,
            @PathVariable String patientId) {
        patientService.deletePatient(organizationId, patientId);
    }
}
