package copo;

public class main {
    public static void Copo(String[] args){
        Copo c1 = new Copo();
        c1.marca = "probiótica";
        c1.qtdAgua = 575.4f;
        c1.temAgua = true;
        c1.cor = "transparente";
        c1.ml = 700;

        c1.encherCopo();
        c1.beberAgua();
        c1.vazio();
        c1.beberAgua();
        
    }
}
