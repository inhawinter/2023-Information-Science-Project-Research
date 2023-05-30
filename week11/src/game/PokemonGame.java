package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon charizard1 = new Charizard(36, 80);  // upcast
        Pokemon pikachu1 = new Pikachu(14, 165);  // upcast
        JetPack ISHSjetPack = new JetPack();

        pikachu1.setFlyable(ISHSjetPack);
        charizard1.setFlyable(new Wings());
        charizard1.performFly();
        pikachu1.performFly();
    }
}
