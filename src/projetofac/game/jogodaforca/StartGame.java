package projetofac.game.jogodaforca;

import projetofac.game.jogodaforca.Controller.ForcaController;
import projetofac.game.jogodaforca.Model.Forca;
import projetofac.game.jogodaforca.View.ForcaView;

public class StartGame {
    public static void main(String[] args) {
        Forca modelo = new Forca("programacao", 6);
        ForcaView visao = new ForcaView();
        ForcaController controlador = new ForcaController(modelo, visao);

        controlador.iniciarJogo();
    }
}