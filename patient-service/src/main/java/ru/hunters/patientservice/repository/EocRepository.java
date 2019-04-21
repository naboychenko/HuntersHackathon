package ru.hunters.patientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hunters.common.domain.EpisodeOfCare;

import java.util.List;

@Repository
public interface EocRepository extends CrudRepository<EpisodeOfCare, String> {
    List<EpisodeOfCare> findAllByOrganizationId(String organizationId);
}
