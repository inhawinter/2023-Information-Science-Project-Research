package main;

public class GameDemo {
    public static void main(String[] args) {
        DiabloCharacter player1 = DiabloCharacter.NECROMANCER;
        //PokemonCharacter player1 = PokemonCharacter.PIKACHU;
        PokemonCharacter player2 = PokemonCharacter.PIKACHU;

        String attack = switch (player1) {
            case BARBARIAN -> "휠윈드 시전";
            case SORCERESS -> "파이어볼 발사";
            case DRUID -> "늑대인간 변신";
            case ROGUE -> "전류의 일격";
            case NECROMANCER -> "스켈레톤 소환";
            default -> "플레이가 가능한 캐릭터가 아닙니다";
        };
        System.out.println(attack);

    }
}
