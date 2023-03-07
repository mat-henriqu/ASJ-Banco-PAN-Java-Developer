package sistema.smart.tv;

public class smartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 1;

    public void aumentarVolume() {
        volume++;
        System.out.println("Novo volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Novo volume: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Novo canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Novo canal: " + canal);
    }

    public void ligar() {
        ligada = true;
        System.out.println("A Tv esta ligada: " + ligada);
    }

    public void desligar() {
        ligada = false;
        System.out.println("A Tv esta ligada: " + ligada);
    }

    public void novoCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Novo canal: " + canal);
    }
}
