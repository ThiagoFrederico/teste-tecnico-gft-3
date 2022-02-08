package exercVeiculos;

public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo();

        System.out.println("Velocidade aumentada em: ");
        veiculo.acelerar();
        veiculo.acelerar();
        System.out.println(veiculo.getVelocidade());

        System.out.println("Combustível: ");
        veiculo.abastecer(50);
        System.out.println(veiculo.getLitrosCombustivel());
        veiculo.abastecer(61);
        System.out.println("Combustível atual: ");
        System.out.println(veiculo.getLitrosCombustivel());

        System.out.println("Velocidade diminuida em: ");
        veiculo.frear();
        System.out.println(veiculo.getVelocidade());

        System.out.println("Cor do veículo: ");
        veiculo.pintar("Azul");
        System.out.println(veiculo.getCor());

        System.out.println("Velocidade atual: ");
        System.out.println(veiculo.getVelocidade());

        System.out.println("O veículo está ligado?");
        veiculo.ligar();
        System.out.println(veiculo.isLigado());

        veiculo.frear();
        System.out.println("Velocidade atual: ");
        veiculo.getVelocidade();

        System.out.println("O veículo está ligado?");
        veiculo.desligar();
        System.out.println(veiculo.isLigado());

    }
}