package com.fravel.govinizacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void validaCpfTest(){
        Usuario usuario = new Usuario();
        usuario.setCpf("13880494908");
        usuario.setNome("Vinicius de Oliveira Craveiro");
        usuario.setClassificacao(Classicacao.ADMINISTRADOR);
        usuario.setStatus("ATIVO");
        assertTrue(usuario.validaCpf(usuario.getCpf()));
    }

    @Test
    void validaCpf12DigitosTest(){
        Usuario usuario = new Usuario();
        usuario.setCpf("138804949081");
        assertFalse(usuario.validaCpf(usuario.getCpf()));
    }

    @Test
    void validaLetraNoCPF(){
        Usuario usuario = new Usuario("Leonardo", "5487768O055", Classicacao.OPERADOR);
        assertFalse(usuario.validaCpf(usuario.getCpf()));
    }

}