package KangRotom;

public class GameDemo {
    public static void main(String[] args) {
        DiabloCharacter player1 = DiabloCharacter.NECROMANCER;
        //PokemonCharacter player1 = PokemonCharacter.PIKACHU;
        PokemonCharacter player2 = PokemonCharacter.PIKACHU;

        switch (player1) {
            case BARBARIAN -> {
                System.out.println("휠윈드 시전");
                break;
            }
            case NECROMANCER -> {
                System.out.println("스켈레톤 소환");
                break;
            }
            case DRUID -> {
                System.out.println("늑대인간 변신");
                break;
            }
            case ROGUE -> {
                System.out.println("전류의 일격");
                break;
            }
            case SORCERESS -> {
                System.out.println("스켈레톤 소환");
                break;
            }
            default -> {
                System.out.println("플레이가 가능한 캐릭터가 아닙니다");
                break;
            }
        }
    }
}
