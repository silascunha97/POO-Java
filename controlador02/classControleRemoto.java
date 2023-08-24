package controlador02;

public class classControleRemoto implements controlar {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public classControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {  // Use 'isLigado' instead of 'getLigado' for boolean properties
        return ligado;
    }

    public boolean isTocando() {  // Use 'isTocando' instead of 'getTocando' for boolean properties
        return tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);  // Corrected the order, set 'ligado' to true
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + isLigado());  // Use 'println' instead of 'print'
        System.out.println("Está Tocando? " + isTocando());
        System.out.println("Volume " + getVolume());
        for (int i = 0; i <= getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println();  // Print a newline after the volume bar
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado() && getVolume() > 0) {
            setVolume(getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);  // Assuming default volume is 50
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }

    @Override
    public void play() {
        if (isLigado() && (!this.isTocando())) {
            setTocando(true);
        }
    }
}
