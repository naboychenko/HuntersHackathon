package ru.hunters.patientservice.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.hunters.common.domain.Patient;
import ru.hunters.patientservice.services.PatientService;

import java.util.List;

@RestController
@RequestMapping("/v1/patients")
public class PatientServiceController {

    private final PatientService patientService;

    public PatientServiceController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getPatientsByName(@RequestParam String name) {
        return patientService.getPatientsByName(name);
    }

    @GetMapping("/{identifier}")
    public Patient getPatientByIdentifier(@PathVariable String identifier) {
        return patientService.getPatientByIdentifier(identifier);
    }

    @PostMapping
    public void savePatient(@RequestBody Patient patient) {
        patientService.savePatient(patient);
    }

    @PutMapping("/{identifier}")
    public void updatePatient(
            @PathVariable String identifier,
            @RequestBody Patient patient) {
        patientService.updatePatient(identifier, patient);
    }

    @DeleteMapping("/{identifier}")
    public void deletePatient(@PathVariable String identifier) {
        patientService.deletePatient(identifier);
    }

    @GetMapping("/byOrganization/{organizationId}")
    public List<Patient> getPatientsByOrganization(@PathVariable String organizationId) {
        return patientService.getPatientsByOrganization(organizationId);
    }
}
