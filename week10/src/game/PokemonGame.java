package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard1 = new Charizard(36, 80);
        Pikachu pikachu1 = new Pikachu(14, 165);
        JetPack ISHSjetPack = new JetPack();

        pikachu1.setFlyable(ISHSjetPack);
        charizard1.setFlyable(new Wings());
        charizard1.performFly();
        pikachu1.performFly();
    }
}
