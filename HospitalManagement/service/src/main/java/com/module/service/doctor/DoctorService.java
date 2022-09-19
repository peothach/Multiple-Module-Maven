package com.module.service.doctor;

import com.module.dao.doctor.DoctorRepository;
import com.module.mailservice.EmailService;
import com.module.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.print.Doc;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;

    @Autowired
    private EmailService service;

    @PostConstruct
    public void initDoctor() {
        repository.saveAll(Stream.of(
                        new Doctor(101, "John", "Cardiac"),
                        new Doctor(102, "Peter", "Eye"))
                .collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors() {
        service.sendEmail();
        return repository.findAll();
    }
}
