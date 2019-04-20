package ru.hunters.doctorservice.services;

import java.util.List;
import ru.hunters.doctorservice.model.Doctor;

public interface DoctorService
{
    List<Doctor> getAll();

    Doctor getDoctor(String doctorId);

    void saveDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    void deleteDoctor(String doctorId);
}
