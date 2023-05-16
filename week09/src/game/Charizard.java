package game;

public class Charizard extends Pokemon{
    public Charizard() {

    }
    public Charizard(int level, int hp) {
        super();
        //this.hp = hp;  // private access
        //this.level = level;
        this.setHp(hp);  // access by setter method
        this.setLevel(level);
    }
}
