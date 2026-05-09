package org.example;

public class ContaBuilder {

    private Conta conta;

    public ContaBuilder() {
        conta = new Conta();
    }

    public Conta build() {
        if (conta.getNumeroConta() == 0) {
            throw new IllegalArgumentException("Número da conta inválido");
        }
        if (conta.getTitular().equals("")) {
            throw new IllegalArgumentException("Titular inválido");
        }
        return conta;
    }

    public ContaBuilder setNumeroConta(int numeroConta) {
        conta.setNumeroConta(numeroConta);
        return this;
    }

    public ContaBuilder setTitular(String titular) {
        conta.setTitular(titular);
        return this;
    }

    public ContaBuilder setAgencia(String agencia) {
        conta.setAgencia(agencia);
        return this;
    }

    public ContaBuilder setBanco(String banco) {
        conta.setBanco(banco);
        return this;
    }

    public ContaBuilder setSaldo(double saldo) {
        conta.setSaldo(saldo);
        return this;
    }

    public ContaBuilder setTipoConta(String tipoConta) {
        conta.setTipoConta(tipoConta);
        return this;
    }

    public ContaBuilder setCpf(String cpf) {
        conta.setCpf(cpf);
        return this;
    }

    public ContaBuilder setEmail(String email) {
        conta.setEmail(email);
        return this;
    }

    public ContaBuilder setCelular(String celular) {
        conta.setCelular(celular);
        return this;
    }

    public ContaBuilder setLogradouro(String logradouro) {
        conta.setLogradouro(logradouro);
        return this;
    }

    public ContaBuilder setNumeroEndereco(int numeroEndereco) {
        conta.setNumeroEndereco(numeroEndereco);
        return this;
    }

    public ContaBuilder setBairro(String bairro) {
        conta.setBairro(bairro);
        return this;
    }

    public ContaBuilder setCidade(String cidade) {
        conta.setCidade(cidade);
        return this;
    }

    public ContaBuilder setUf(String uf) {
        conta.setUf(uf);
        return this;
    }
}
