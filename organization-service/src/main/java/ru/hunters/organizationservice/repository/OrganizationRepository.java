package ru.hunters.organizationservice.repository;

import ru.hunters.common.domain.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
    Organization findByIdentifier(String identifier);
}
