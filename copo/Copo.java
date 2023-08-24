package copo;

public class Copo {
    String marca;
    int ml;
    float qtdAgua;
    String cor;
    boolean temAgua;

    void status(){
        System.out.println("Marca " + this.marca);
        System.out.println("quantidade de Agua " + qtdAgua); 
        System.out.println("Cor do copo " + cor);
        System.out.println("quantidade de liquido por ML " + ml);
    }

    void cheio(){
        this.temAgua = true;
    }

    void vazio(){
        this.temAgua = false;
    }

    void beberAgua(){
         if (this.ml >= 300 && temAgua == true ){
            System.out.println("voce pode beber agua");
           } else if(this.ml <= 700 && temAgua == true ){
             System.out.println("voce pode beber agua");
           } else if(this.ml <= 800 && temAgua == true ){
             System.out.println("voce pode beber agua");
           }else{
                System.out.println("voce tem que encher o copo primeiro");
           }
    }

    void encherCopo(){
        if (this.ml >= 300 && temAgua == true ){
            System.out.println("Copo está cheio");
           } else if(this.ml <= 700 && temAgua == true ){
             System.out.println("Copo está muito cheio");
           } else if(this.ml <= 800 && temAgua == true ){
             System.out.println("não cabe mais agua");
           }else{
                System.out.println("Copo está completamente vazio");
           }
    }
}
