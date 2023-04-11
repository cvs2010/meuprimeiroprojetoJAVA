import javax.swing.JOptionPane;

//Classe Carro
public class Carro {
    // Atributos da classe Carro
    public String marca;
    public int ano;
    private int marcha = 0;
    public boolean ligado;
    public int velocidade;
    public boolean freiodemao = true;

    public void ligar() {
        if (this.ligado == false) {
            this.ligado = true;
            JOptionPane.showMessageDialog(null, "Carro Ligado!");
        } else {
            System.out.println("O Carro já está Ligado!");
        }
    }

    public void desligar() {
        if (this.ligado == true) {
            this.ligado = false;
            JOptionPane.showMessageDialog(null, "Carro Desligado!");
        } else {
            System.out.println("O Carro não está ligado!");
        }
    }

    public void acelerar(int velocidade) {
        if (this.ligado == true) {
            if (freiodemao == false) {
                if (this.marcha == 0) {
                    JOptionPane.showMessageDialog(null, "Carro está em Ponto Morto!");
                } else if (this.marcha == 1) {
                    if (velocidade <= 30) {
                        this.velocidade = velocidade;
                        System.out.println("Acelerando para " + this.velocidade + " km/h");
                    } else {
                        System.out.println("1ª Marcha não pode acelerar mais que 30km/h");
                    }
                } else if (this.marcha == 2) {
                    if (velocidade <= 60) {
                        this.velocidade = velocidade;
                        System.out.println("Acelerando para " + this.velocidade + " km/h");
                    } else {
                        System.out.println("2ª Marcha não pode acelerar mais que 60km/h");
                    }
                } else if (this.marcha == 3) {
                    if (velocidade <= 100) {
                        this.velocidade = velocidade;
                        System.out.println("Acelerando para " + this.velocidade + " km/h");
                    } else {
                        System.out.println("3ª Marcha não pode acelerar mais que 100km/h");
                    }
                } else {
                    System.out.println("O freio de mão não está liberado!");
                }

            }
        }
    }

    public void trocarmarcha() {
        this.marcha = marcha + 1;
        System.out.println("Marcha Trocada!");
    }
}