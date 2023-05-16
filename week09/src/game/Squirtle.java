package game;

public class Squirtle extends Pokemon {
    public Squirtle() {

    }

    public Squirtle(int level, int hp) {
        super();
        //this.hp = hp;  // private access
        //this.level = level;
        this.setHp(hp);  // access by setter method
        this.setLevel(level);
    }
}
