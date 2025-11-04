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

    //  soma +10 e verifica Par/Ímpar
    @GetMapping("/api/teste/{numUm}")
    public String teste(@PathVariable int numUm) {
        
        int resultadoSoma = numUm + 10;
        
        String parOuImpar;
        
        if (resultadoSoma % 2 == 0) {
            parOuImpar = "Par";
        } else {
            parOuImpar = "Ímpar";
        }
        
        return "O resultado da soma (com 10) é: " + resultadoSoma + ". É um número " + parOuImpar + ".";
    }

    //api/soma/5/3
     
    @GetMapping("/api/soma/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 + num2;
        return "A soma de " + num1 + " + " + num2 + " é: " + resultado + ".";
    }

    //api/subtracao/10/4
    @GetMapping("/api/subtracao/{num1}/{num2}")
    public String subtrair(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 - num2;
        return "A subtração de " + num1 + " - " + num2 + " é: " + resultado + ".";
    }

    // api/verificanumeroparouimpar/7
     
    @GetMapping("/api/verificanumeroparouimpar/{numero}")
    public String verificaParOuImpar(@PathVariable int numero) {
        String status = (numero % 2 == 0) ? "Par" : "Ímpar";
        return "O número " + numero + " é " + status + ".";
    }
}