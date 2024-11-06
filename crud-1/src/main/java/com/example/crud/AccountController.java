package com.example.crud;

import com.example.crud.Account;
import com.example.crud.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students/add")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody Account account) {
        // Check for missing fields
        // if (account.getEngName() == null || account.getEmail() == null ||
        // account.getEmail() == null) {
        // return ResponseEntity.badRequest().body("Invalid input data");
        // }

        try {
            Account savedUser = accountRepository.save(account);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error saving user: " + e.getMessage());
        }
    }
}