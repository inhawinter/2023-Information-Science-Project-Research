import game.Charizard;
import game.Pikachu;
import game.Squirtle;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Pikachu pikachu = new Pikachu(14, 165);
        Squirtle squirtle = new Squirtle();

        //pikachu.hp = 99;  // can not access protected variable (different package & PokemonGame is not a child class)
        pikachu.setHp(99);

        squirtle.attack();  // execute override method
        pikachu.attack();  // execute super(base) class method
        charizard.attack();  // execute super(base) class method and override method

        System.out.println(pikachu.getName());
        System.out.println(pikachu.getHp());
        //System.out.println(pikachu.hp);  // can not access protected variable (different package & PokemonGame is not a child class)

        System.out.println(charizard.getName());
        charizard.setName("리자몽");
        System.out.println(charizard.getName());

        squirtle.setHp(100);
        System.out.println(squirtle.getHp());
        System.out.println(squirtle.getLevel());
    }
}
