package com.module.mailservice;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail() {
        System.out.println("Email service working!!!");
    }
}
