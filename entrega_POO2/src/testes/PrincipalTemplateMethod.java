package testes;

import cadeia.Escudo;
import cadeia.HandlerEscudo;
import templatemethod.*;
import composite.Abismo;
import composite.Saida;
import contexto.Personagem;
import contexto.Personagem01;

public class PrincipalTemplateMethod {
    public static void main(String[] args) {
        //PERSONAGEM
        Personagem p1 = new Personagem01();
        // Inicio da Cadeia
        HandlerEscudo escudo1 = new Escudo(1);
        HandlerEscudo escudo2 = new Escudo(2);
        // Fim da Cadeia
        // Encadear Objetos da cadeia
        escudo1.setSucessor(escudo2);
        escudo2.setSucessor(null);

        System.out.println("Personagem Criado!");
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");

        System.out.print("Estado do Personagem: ");
        System.out.println(p1.getEstado().getClass());
        System.out.print("Vida: ");
        System.out.println(p1.getVida()+"\n");
        
        // Para não executar muitas vezes,
        // decidimos misturar salas randomicas e interativas!
        TemplateLabirinto randomico = new SalaInterativa(
                new SalaRandomica(
                        new SalaRandomica(new Abismo(), 
                                new SalaInterativa(
                                        new Abismo(), new Saida(), 15),
                            30),
                        new Saida(), 20),
                new Saida(), 10);
        randomico.passar_sala(p1, escudo1);
    }
}
