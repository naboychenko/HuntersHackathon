package ru.hunters.common.feign;

import ru.hunters.common.domain.Doctor;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "patient-service", path ="/patients")
public interface PatientRemoteService {

    @GetMapping
    List<Doctor> getAll();

    @GetMapping("/{doctorId}")
    Doctor getDoctor(@PathVariable String doctorId);

    @PostMapping
    void saveDoctor(@RequestBody Doctor doctor);

    @PutMapping
    void updateDoctor(@RequestBody Doctor doctor);

    @DeleteMapping("/{doctorId")
    void deleteDoctor(@PathVariable String doctorId);
}
