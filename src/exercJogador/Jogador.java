package exercJogador;

import java.util.Calendar;

public class Jogador {
    private String nome;
    private String posicao;
    private String dataNascimento;

    public Jogador(String nome, String posicao, String dataNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String imprimirDados() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao=" + posicao +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    public int calcularIdade() {
        Calendar calendar= Calendar.getInstance();
        int idade= Integer.parseInt(dataNascimento.substring(dataNascimento.length()-4));
        return calendar.get(Calendar.YEAR)-idade;
    }

    public int aposentar() {
        int idade = calcularIdade();

        switch (this.posicao) {
            case "Defesa":
                if(idade < 40) {
                    return 40 - idade;
                }
                return 0;

            case "Meio-Campo":
                if(idade < 38) {
                    return 38 - idade;
                }
                return 0;

            default:
                if(idade < 35) {
                    return 35 - idade;
                }
                return 0;
        }

    }


}
