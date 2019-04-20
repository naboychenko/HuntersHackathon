package ru.hunters.patientservice.controllers;

import ru.hunters.common.domain.Patient;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping("/{identifier")
    public void deletePatient(@PathVariable String identifier) {
        patientService.deletePatient(identifier);
    }
}
