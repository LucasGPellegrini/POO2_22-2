package composite;

//Leaf
public class Abismo implements Labirinto{

    @Override
    public int passar_sala() {
        System.out.println("\tFIM DE JOGO!!!\no Personagem CAIU no ABISMO!");
        return 999;
    }
}
