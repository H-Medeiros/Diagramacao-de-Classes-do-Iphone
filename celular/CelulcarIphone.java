package celular;

import funcionalidades.aparelhoTelefonico.Celular;
import funcionalidades.navegadorNaInternete.Navegador;
import funcionalidades.reprodutorDeMusica.ReprodutorDeMusica;

public class CelulcarIphone implements Celular, Navegador, ReprodutorDeMusica {
    public void ligar(){
        System.out.println("Ligando Via Celular");
    }
    public void navegar() {
        System.out.println("Navegando via Celular");
    }
    public void reproduzirMusica() {
        System.out.println("Reproduzindo Muisica via Celular");
    }
}
