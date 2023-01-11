package ir.maktab.service.impl;

import ir.maktab.dao.PatientRepository;
import ir.maktab.modle.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl {
    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void register(Patient patient) {
        patientRepository.save(patient);
    }

    public Patient logIn(String username, String password) {
        Patient patient = patientRepository.findByUsername(username);
        if (patient.getPassword().equals(password))
            return patient;
        else
            throw new RuntimeException("the password is not correct");
    }
}
