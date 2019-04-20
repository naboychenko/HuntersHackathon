package ru.hunters.organizationservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hunters.organizationservice.model.Organization;

import java.util.List;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
    Organization findByIdentifier(String identifier);
}
