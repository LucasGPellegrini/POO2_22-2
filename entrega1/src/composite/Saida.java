package composite;

//Leaf
public class Saida implements Labirinto{

    @Override
    public int passar_sala() {
        System.out.println("\tParabens!!!\no Personagem SAIU do Labirinto!");
        return 0;
    }
}
