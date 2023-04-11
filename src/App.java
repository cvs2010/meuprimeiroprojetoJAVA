public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        // Instanciando uma classe (criando um objeto)
        Carro ix35 = new Carro();
        ix35.ligar();
        ix35.freiodemao = false;
        ix35.trocarmarcha();
        ix35.acelerar(30);
        ix35.trocarmarcha();
        ix35.acelerar(50);
        ix35.trocarmarcha();
        ix35.acelerar(110);
        ix35.desligar();
    }
}
