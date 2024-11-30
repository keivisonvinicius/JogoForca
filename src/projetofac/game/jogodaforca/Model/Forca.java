package projetofac.game.jogodaforca.Model;

public class Forca {
    private String palavraSecreta;
    private StringBuilder palavraAtual;
    private int tentativasRestantes;
    private boolean jogoFinalizado;
    private String letrasTentadas;

    public Forca(String palavraSecreta, int tentativas) {
        this.palavraSecreta = palavraSecreta.toLowerCase();
        this.palavraAtual = new StringBuilder("_".repeat(palavraSecreta.length()));
        this.tentativasRestantes = tentativas;
        this.jogoFinalizado = false;
        this.letrasTentadas = "";
    }

    public boolean tentarLetra(char letra) {
        letra = Character.toLowerCase(letra);
        boolean acertou = false;

        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                palavraAtual.setCharAt(i, letra);
                acertou = true;
            }
        }

        if (!acertou) {
            tentativasRestantes--;
        }

        if (tentativasRestantes <= 0 || palavraAtual.toString().equals(palavraSecreta)) {
            jogoFinalizado = true;
        }

        return acertou;
    }

    public String getPalavraAtual() {
        return palavraAtual.toString();
    }

    public int getTentativasRestantes() {
        return tentativasRestantes;
    }

    public boolean isJogoFinalizado() {
        return jogoFinalizado;
    }

    public boolean isVitoria() {
        return palavraAtual.toString().equals(palavraSecreta);
    }
    public String getPalavraSecreta() {
        return palavraSecreta;
    }

}

