package com.login.loginv1.Services;

import com.login.loginv1.domain.User;
import com.login.loginv1.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public User saveUserWithHashedPassword(User user) {
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setHashedPassword(hashedPassword);
        return userRepository.save(user);
    }
}
