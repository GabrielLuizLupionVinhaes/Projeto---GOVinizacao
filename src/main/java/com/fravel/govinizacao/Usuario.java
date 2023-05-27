package com.fravel.govinizacao;

public class Usuario {
    private String nome;
    private String cpf;
    private Classicacao classificacao; //talvez fazer um enum;
    private String status = "ATIVO"; //talvez fazer um enum;


    public Usuario() {}

    public Usuario(String nome, String cpf, Classicacao classificacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.classificacao = classificacao;
    }

    public Usuario(Usuario usuario){
        this.nome = usuario.getNome();
        this.classificacao = usuario.getClassificacao();
        this.cpf = usuario.getCpf();
        this.status = usuario.getStatus();
    }

    protected boolean validaCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }

        boolean todosDigitosIguais = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosDigitosIguais = false;
                break;
            }
        }

        if (todosDigitosIguais) {
            return false;
        }

        int digito1 = calcularDigitoVerificador(cpf.substring(0, 9), 10);
        if (digito1 != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        int digito2 = calcularDigitoVerificador(cpf.substring(0, 10), 11);
        if (digito2 != Character.getNumericValue(cpf.charAt(10))) {
            return false;
        }

        return true;
    }

    private static int calcularDigitoVerificador(String cpfParcial, int pesoInicial) {
        int soma = 0;
        for (int i = 0; i < cpfParcial.length(); i++) {
            int digito = Character.getNumericValue(cpfParcial.charAt(i));
            soma += digito * (pesoInicial - i);
        }

        int resto = soma % 11;
        if (resto < 2) {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Classicacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classicacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
