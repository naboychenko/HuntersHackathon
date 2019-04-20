package ru.hunters.doctorservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.hunters.doctorservice.model.Doctor;

import java.util.List;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, String> {
    List<Doctor> findAllByName(String name);

    List<Doctor> findAll();
}
