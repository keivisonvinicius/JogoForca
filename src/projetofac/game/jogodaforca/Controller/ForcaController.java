package projetofac.game.jogodaforca.Controller;

import projetofac.game.jogodaforca.Model.Forca;
import projetofac.game.jogodaforca.View.ForcaView;

public class ForcaController {
    private Forca modelo;
    private ForcaView visao;

    public ForcaController(Forca modelo, ForcaView visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void iniciarJogo() {
        visao.exibirMensagem("Bem-vindo ao Jogo da Forca!");

        while (!modelo.isJogoFinalizado()) {
            visao.exibirStatus(modelo.getPalavraAtual(), modelo.getTentativasRestantes());
            char letra = visao.obterLetra();

            boolean acertou = modelo.tentarLetra(letra);
            if (acertou) {
                visao.exibirMensagem("Você acertou!");
            } else {
                visao.exibirMensagem("Você errou!");
            }
        }

        if (modelo.isVitoria()) {
            visao.exibirMensagem("Parabéns! Você ganhou!");
        } else {
            visao.exibirMensagem("Game Over! A palavra era: " + modelo.getPalavraSecreta());
        }
    }
}

