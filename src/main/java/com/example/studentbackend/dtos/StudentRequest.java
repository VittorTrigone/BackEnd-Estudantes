package com.example.studentbackend.dtos;


import jakarta.validation.constraints.NotBlank;

public record StudentRequest(
    @NotBlank(message = "O Nome é obrigatório!")
    String nome, 
    @NotBlank(message = "O Email é obrigatório!")
    String email, 
    @NotBlank(message = "O CPF é obrigatório!")
    String cpf, 
    @NotBlank(message = "O endereço é obrigatório!")
    String endereco

) {
    
}
