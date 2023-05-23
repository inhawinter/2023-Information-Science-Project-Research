package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pokemon = new Pikachu(1, 35);  // upcast
        Pikachu pikachu1 = new Pikachu(14, 165);

        System.out.println(pokemon);
        System.out.println(pikachu1);

        pikachu1.electricInfo();

        Pikachu pikachu2 = (Pikachu) pokemon;  // downcast

        //pokemon.electricInfo();  // can not access child's method
        pikachu2.electricInfo();  // accessible
        System.out.println(pokemon.getHp());
        System.out.println(pikachu2.getHp());

        System.out.println(pikachu2);  // same address (pokemon)
    }
}
