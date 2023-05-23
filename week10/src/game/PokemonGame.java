package game;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard1 = new Charizard(36, 80);
        Pikachu pikachu1 = new Pikachu(14, 165);
        Wings wings = new Wings();
        JetPack jetPack = new JetPack();

        pikachu1.setFlyable(jetPack);
        charizard1.setFlyable(wings);
        charizard1.performFly();
        pikachu1.performFly();
    }
}
