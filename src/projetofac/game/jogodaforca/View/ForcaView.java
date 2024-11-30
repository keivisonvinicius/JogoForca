package projetofac.game.jogodaforca.View;

import java.util.Scanner;

public class ForcaView {
    private Scanner scanner;

    public ForcaView() {
        this.scanner = new Scanner(System.in);
    }

    public void exibirStatus(String palavraAtual, int tentativasRestantes) {
        System.out.println("Palavra: " + palavraAtual);
        System.out.println("Tentativas restantes: " + tentativasRestantes);
    }

    public char obterLetra() {
        char letra;
        while(true){
            System.out.println("Digite uma letra: ");
            String entrada = scanner.nextLine().trim();

            if(entrada.length() == 1 && Character.isLetter(entrada.charAt(0))){
                letra = entrada.charAt(0);
                break;
            }else{
                System.out.println("Entrada inválida! Digite apenas uma letra.");
            }
        }
        return letra;
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
