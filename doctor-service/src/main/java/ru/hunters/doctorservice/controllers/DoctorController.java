package ru.hunters.doctorservice.controllers;

import ru.hunters.common.domain.Doctor;
import org.springframework.web.bind.annotation.*;
import ru.hunters.doctorservice.services.DoctorService;

import java.util.List;

@RestController
@RequestMapping("/v1/doctors/")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public List<Doctor> getAll() {
        return doctorService.getAll();
    }

    @GetMapping("/{doctorId}")
    public Doctor getDoctor(
            @PathVariable String doctorId) {
        return doctorService.getDoctor(doctorId);
    }

    @PostMapping
    public void saveDoctor(
            @RequestBody Doctor doctor) {
        doctorService.saveDoctor(doctor);
    }

    @PutMapping
    public void updateDoctor(
            @RequestBody Doctor doctor) {
        doctorService.updateDoctor(doctor);
    }

    @DeleteMapping("/{doctorId}")
    public void deleteDoctor(
            @PathVariable String doctorId) {
        doctorService.deleteDoctor(doctorId);
    }
}
