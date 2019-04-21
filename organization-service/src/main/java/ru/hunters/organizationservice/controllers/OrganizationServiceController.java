package ru.hunters.organizationservice.controllers;

import ru.hunters.common.domain.Organization;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hunters.common.domain.Patient;
import ru.hunters.organizationservice.services.OrganizationService;

import java.util.List;

@RestController
@RequestMapping("/v1/organizations")
public class OrganizationServiceController {

    private final OrganizationService organizationService;

    public OrganizationServiceController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping
    public Iterable<Organization> getOrganizations() {
        return organizationService.getOrganizations();
    }

    @GetMapping("/{identifier}")
    public Organization getOrganization(
            @PathVariable String identifier) {
        return organizationService.getOrganizationByIdentifier(identifier);
    }

    @PostMapping
    public void saveOrganization(
            @RequestBody Organization organization) {
        organizationService.saveOrganization(organization);
    }

    @PutMapping("/{identifier}")
    public void updatePatient(
            @PathVariable String identifier,
            @RequestBody Organization organization) {
        organizationService.updateOrganization(identifier, organization);
    }

    @DeleteMapping("/{identifier}")
    public void deletePatient(
            @PathVariable String identifier) {
        organizationService.deleteOrganization(identifier);
    }

    @GetMapping("/{organizationId}/patients")
    public List<Patient> getAllPatients(
            @PathVariable String organizationId) {
        return organizationService.getAllPatients(organizationId);
    }
}
