package aula005;

public class uef {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private double peso;
    private String categoria;
    private int vitorias;    
    private int derrotas;
    private int empates;

    public uef(String name, 
               String nacionali, 
               int age, 
               float altu, 
               double pes, 
               String cat, 
               int win, 
               int lose, 
               int empat
    ){
        this.nome = name;
        this.nacionalidade = nacionali;
        this.idade = age;
        this.altura = altu;
        this.peso = pes;
        this.categoria = cat;
        this.vitorias = win;
        this.derrotas = lose;
        this.empates = empat;
    }

    public void apresentar(){
        System.out.printf("Lutador: ", this.getNome());
        System.out.printf("Oriem: ", getNacionalidade());
        System.out.println(getIdade());
        System.out.println(getAltura());
        System.out.printf("Pesando: ", getPeso(), "KG");
        System.out.printf("Ganhou: ", getVitorias());
        System.out.printf("Perdeu: ", getDerrotas());
        System.out.printf("Empatou", getEmpates());        
    }

    public void status(){

    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setCategoria(String cat, double pe){
        double peso = pe;
        this.categoria = cat;

        if(peso < 52.2f){
            System.out.println("Peso invalido");
        }else if( peso <= 70.3d){
            System.out.println("Peso leve");
        }else if( peso <= 83.9d){
            System.out.println("Peso Médio");
        }else if(peso <= 120.2d){
            System.out.println("Peso Pesado");
        }else{
            System.out.println("Invalido");
        }

    }

    public void setNome(String name) {
        this.nome = name;
    }

    public void setNacionalidade(String nacionali) {
        this.nacionalidade = nacionali;
    }

    public void setIdade(int age) {
        this.idade = age;
    }

    public void setAltura(float altu) {
        this.altura = altu;
    }

    public void setPeso(double pes) {
        this.peso = pes;
    }

    public void setVitorias(int win) {
        this.vitorias = win;
    }

    public void setDerrotas(int lose) {
        this.derrotas = lose;
    }

    public void setEmpates(int empat) {
        this.empates = empat;
    }

}
