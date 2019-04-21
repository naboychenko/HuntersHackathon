package ru.hunters.common.feign;

import ru.hunters.common.domain.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "patientservice", path ="/v1/patients")
public interface PatientRemoteService {

    @GetMapping("/{identifier}")
    Patient getPatientByIdentifier(@PathVariable String identifier);

    @GetMapping("/{organizationId}")
    List<Patient> getPatientsByOrganization(@PathVariable String organizationId);
}
