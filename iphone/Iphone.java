package iphone;

import celular.CelulcarIphone;
import funcionalidades.aparelhoTelefonico.Celular;
import funcionalidades.navegadorNaInternete.Navegador;
import funcionalidades.reprodutorDeMusica.ReprodutorDeMusica;

public class Iphone {
    public static void main(String[] args){
        Celular iphone = new CelulcarIphone();
        Navegador navegador = (Navegador) iphone;
        ReprodutorDeMusica reprodutorDeMusica = (ReprodutorDeMusica) iphone;

        iphone.ligar();
        navegador.navegar();
        reprodutorDeMusica.reproduzirMusica();

    }
}
