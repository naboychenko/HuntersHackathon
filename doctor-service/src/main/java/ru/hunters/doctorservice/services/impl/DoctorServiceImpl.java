package ru.hunters.doctorservice.services.impl;

import ru.hunters.common.domain.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hunters.doctorservice.config.ServiceConfig;
import ru.hunters.doctorservice.repository.DoctorRepository;

import java.util.List;
import ru.hunters.doctorservice.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final ServiceConfig serviceConfig;

    @Autowired
    public DoctorServiceImpl(
            DoctorRepository doctorRepository,
            ServiceConfig serviceConfig) {
        this.doctorRepository = doctorRepository;
        this.serviceConfig = serviceConfig;
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctor(String id) {
        return doctorRepository.findByIdentifier(id);
    }

    @Override
    public void saveDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public void deleteDoctor(String id) {
        Doctor doctor = doctorRepository.findById(id).get();
        doctorRepository.delete(doctor);
    }
}
