package com.example.kolo_fortuny.password;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;

@Controller
public class PasswordController {

    private Random rand = SecureRandom.getInstanceStrong();

    public PasswordController() throws NoSuchAlgorithmException {
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/password")
    @ResponseBody
    public Password getPassword() {
//  Przerób swoją implementację z poprzedniego zadania tak, aby hasło było zapisane
//  i stałe w czasie pojedynczego uruchomienia aplikacji.
//  Na front end powinno być zwracane w postaci:
//        ??? ?? ????
//        dla
//        Ala ma kota
//
//  Zapisz również postać "pytajnikową" w currentGuess
        return null;
    }
}
