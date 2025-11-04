package com.exatividade.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/")

public class ExController {

    @GetMapping("/api")
    public String home(){
        return "Olá, aplicação Spring!";
    }

    /**
     * @param numUm
     * @return
     */
    @GetMapping("/api/teste/{numUm}")
    public String teste(@PathVariable int numUm) {
       
        int resultadoSoma = numUm + 10;
        
        String parOuImpar;
        
        if (resultadoSoma % 2 == 0) {
            parOuImpar = "Par";
        } else {
            parOuImpar = "Ímpar";
        }
        
        // 3. Retorna a soma e o status Par/Ímpar
        return "O resultado da soma é: " + resultadoSoma + ". É um número " + parOuImpar + ".";
    }

}
