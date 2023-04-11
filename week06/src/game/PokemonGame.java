package game;

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon squirtle = new Pokemon("꼬부기");
        Pokemon pikachu = new Pokemon("피카츄", 5, 100);
        Pokemon charizard = new Pokemon("리자몽", 36, 800);
        Pokemon bulbasaur = new Pokemon();

        bulbasaur.setName("이상해");
        System.out.println(squirtle.getLevel());
        System.out.println(squirtle.getHp());
        System.out.println(squirtle.getName());
        squirtle.setName("어니부기");
        System.out.println(squirtle.getName());
//        pikachu.setName("피카츄");
//        charizard.setName("리자몽");
        System.out.println(pikachu.getName());
//        pikachu.setLevel(5);
//        charizard.setLevel(36);

        charizard.evolve();
        pikachu.evolve();
        charizard.attack(pikachu);

        System.out.println(pikachu.getLevel());
    }
}
