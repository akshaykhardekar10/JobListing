package com.telusko.joblisting.Services;

import com.telusko.joblisting.Collections.SignUp;
import com.telusko.joblisting.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SignUpService {

    @Autowired
    private SignUpRepository SignUpRepository;

    public SignUp signUp(String username, String email, String password) {
        SignUp signUp = new SignUp(username, email, password, LocalDateTime.now(), LocalDateTime.now());
        return SignUpRepository.save(signUp);
    }
}