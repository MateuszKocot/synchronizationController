package mateuszkocot_guard.synchronizationController.controller;

import mateuszkocot_guard.synchronizationController.model.VerificationResult; // <-- Nowy import
import mateuszkocot_guard.synchronizationController.service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List; // <-- Nowy import

@RestController
@RequestMapping("/api")
public class VerificationController {

    private final VerificationService verificationService;

    @Autowired
    public VerificationController(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    @GetMapping("/uruchom-weryfikacje")
    public List<VerificationResult> triggerVerification() {
        return verificationService.runVerification();
    }
}