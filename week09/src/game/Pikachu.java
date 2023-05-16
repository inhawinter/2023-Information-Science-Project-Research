package game;

public class Pikachu extends Pokemon {
    public Pikachu() {
    }

    public Pikachu(int level, int hp) {
        super();
        //this.hp = hp;  // private access
        //this.level = level;
        this.setHp(hp);  // access by setter method
        this.setLevel(level);
    }
}
