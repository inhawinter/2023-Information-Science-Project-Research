package game;

public class Charizard extends Pokemon{
    public Charizard() {
        this.setHp(78);  // access by setter method
        this.setLevel(36);
        this.setName("charizard");
    }
    public Charizard(int level, int hp) {
        super();
        //this.hp = hp;  // private access
        //this.level = level;
        this.setHp(hp);  // access by setter method
        this.setLevel(level);
        this.setName("charizard");
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(this.getName() + " does a wide area Flamethrower attack");
    }
}
