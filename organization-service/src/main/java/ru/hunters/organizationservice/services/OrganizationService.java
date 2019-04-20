package ru.hunters.organizationservice.services;

import ru.hunters.common.domain.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hunters.organizationservice.config.ServiceConfig;
import ru.hunters.organizationservice.repository.OrganizationRepository;

import java.util.UUID;

@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final ServiceConfig serviceConfig;

    @Autowired
    public OrganizationService(
            OrganizationRepository organizationRepository,
            ServiceConfig serviceConfig) {
        this.organizationRepository = organizationRepository;
        this.serviceConfig = serviceConfig;
    }

    public Iterable<Organization> getOrganizations() {
        return organizationRepository.findAll();
    }

    public Organization getOrganizationByIdentifier(String identifier) {
        return organizationRepository.findByIdentifier(identifier);
    }

    public void saveOrganization(Organization organization) {
        organization.setIdentifier(UUID.randomUUID().toString());
        organizationRepository.save(organization);
    }

    public void updateOrganization(String identifier, Organization organization) {
        organizationRepository.save(organization);
    }

    public void deleteOrganization(String identifier) {
        Organization organization = organizationRepository.findByIdentifier(identifier);
        organizationRepository.delete(organization);
    }
}
