package ru.hunters.doctorservice.repository;

import ru.hunters.common.domain.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, String> {
    List<Doctor> findAllByName(String name);

    List<Doctor> findAll();

    Doctor findByIdentifier(String identifier);
}
