package com.companys;

public class Conta {
        private double saldo;
        private int numero;
        private int senha;

        public Conta(){
            saldo = 0;
        }

        public Conta(int numero, int senha){
            this.numero = numero;
            this.senha = senha;
        }

        public Conta(double saldoInicial){
            saldo = saldoInicial;
        }

        public void depositar(double valor){
            double novoSaldo = saldo + valor;
            saldo = novoSaldo;
        }

        public void sacar(double valor){
            double novoSaldo = saldo - valor;
            saldo = novoSaldo;
        }

        public double getSaldo( ){
            return saldo;
        }

        public int getNumero() {
            return numero;
        }

        public int getSenha() {
            return senha;
        }
}

