package ru.hunters.patientservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hunters.common.domain.EpisodeOfCare;
import ru.hunters.common.domain.Patient;
import ru.hunters.patientservice.config.ServiceConfig;
import ru.hunters.patientservice.repository.EocRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EocService {

    private final EocRepository eocRepository;
    private final ServiceConfig serviceConfig;

    @Autowired
    public EocService(
            EocRepository eocRepository,
            ServiceConfig serviceConfig) {
        this.eocRepository = eocRepository;
        this.serviceConfig = serviceConfig;
    }

    public List<Patient> getPatientsByOrganization(String organizationId) {
        return eocRepository.findAllByOrganizationId(organizationId).stream().map(EpisodeOfCare::getPatient)
                .distinct().collect(Collectors.toList());
    }
}
