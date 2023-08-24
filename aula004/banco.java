package aula004;

public class banco {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public banco(String dono, int numConta, String tipo) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = (tipo.equalsIgnoreCase("CC")) ? 50 : (tipo.equalsIgnoreCase("PP")) ? 150 : 0;
        this.status = true;
    }

    public void fecharConta() {
        if (saldo > 0) {
            System.out.println("Conta fechada com sucesso!!");
        } else if (saldo < 0) {
            System.out.println("Você está no débito");
        } else {
            status = false;
            System.out.println("Não foi possível fechar a conta!");
        }
    }

    public void depositar(float valor) {
        if (status) {
            saldo += valor;
        } else {
            System.out.println("Não é possível depositar em uma conta fechada.");
        }
    }

    public void sacar(float valor) {
        if (status) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void pagarMensal() {
        float mensalidade = 12.0f;

        if (status) {
            if (tipo.equalsIgnoreCase("conta poupança")) {
                if (saldo >= mensalidade) {
                    saldo -= mensalidade;
                } else {
                    System.out.println("Saldo insuficiente para pagar a mensalidade.");
                }
            }
        } else {
            System.out.println("Impossível pagar mensalidade em uma conta fechada.");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
}
