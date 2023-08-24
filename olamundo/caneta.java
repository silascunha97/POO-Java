package olamundo;

class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta" + this.cor);
    }

    void rabiscar() {
        if (tampada) {
            System.out.println("Não é possível rabiscar, a caneta está tampada.");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        tampada = true;
    }

    void destampar() {
        tampada = false;
    }
}
