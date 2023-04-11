package game;

public class Pokemon {
    // fields
    String name;
    int level;
    int hp;

    // methods
    void evolve(){
        level = level + 1;
        hp = hp + 10;
        //System.out.println("포켓몬스터가 " + level + "레벨로 성장 합니다");
        System.out.println(name+ "가(이) " + level + "레벨로 성장 합니다");
    }

    void attack(){
        System.out.println("기본 공격을 시전 합니다");
    }
}
