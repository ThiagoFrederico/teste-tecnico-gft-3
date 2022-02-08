package exercVeiculos;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public float getKm() {
        return km;
    }
    public void setKm(float km) {
        this.km = km;
    }
    public boolean isLigado() {
        return isLigado;
    }
    public void setLigado(boolean isLigado) {
        this.isLigado = isLigado;
    }
    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }
    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        this.velocidade += 20;
    }

    public void abastecer(int combustivel) {
        if (combustivel > 60) {
            System.out.println("O limite de combustível é 60 litros.");
            return;
        }
        this.litrosCombustivel = combustivel;
    }

    public void frear() {
        if (velocidade == 0) {
            return;
        }
        this.velocidade -= 20.0;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        if (isLigado) {
            System.out.println("Veículo ligado!");
        } else {
            this.isLigado = true;
        }
    }

    public void desligar() {
        if (isLigado == true && velocidade == 0){
            this.isLigado = false;
        } else if (isLigado == false && velocidade > 0) {
            this.isLigado = true;
        }
    }
}
