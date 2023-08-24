package aula003;

public class caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public caneta(String m, float f, String setcor, float p) {
        this.modelo = m;
        this.cor = setcor;
        this.ponta = p;
        this.tampar();

    }

    public caneta(String m, float f, String c, boolean b) {
    }

    private boolean tampar(){
        return this.tampada;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void getModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void getCor(String c){
        this.cor = c;
    }

    public String setCor(String setcor){
        return this.cor = setcor;
    }
}
