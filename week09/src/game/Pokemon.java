package game;

public class Pokemon {
    private int level;
    private int hp;
    private String name;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(this.name + " does a wide area attack");
    }
}