package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon pokemon = new Pikachu(1, 35);  // upcast
        Pikachu pikachu1 = new Pikachu(14, 165);

        System.out.println(pokemon);
        System.out.println(pikachu1);

        pikachu1.electricInfo();
        //pokemon.electricInfo();  // can not use child's method
    }
}
