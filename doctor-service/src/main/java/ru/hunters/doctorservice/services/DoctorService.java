package ru.hunters.doctorservice.services;

import ru.hunters.common.domain.Doctor;
import java.util.List;

public interface DoctorService
{
    List<Doctor> getAll();

    Doctor getDoctor(String doctorId);

    void saveDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(String doctorId);
}
