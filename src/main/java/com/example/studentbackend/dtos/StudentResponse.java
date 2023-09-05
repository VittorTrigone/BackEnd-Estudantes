package com.example.studentbackend.dtos;

public record StudentResponse(
    long id,
    String nome,
    String email,
    String cpf,
    String endereco

) {
}
