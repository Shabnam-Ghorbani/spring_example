package ir.maktab.service.impl;

import ir.maktab.dao.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceIml {
    private AppointmentRepository appointmentRepository;

    public AppointmentServiceIml(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
}
