package fighter_game;

public class FighterGame {
    public static void main(String[] args) {
        Fighter fighter = new Ken();
        fighter.display();
        fighter.performJump();
        fighter.performKick();
        fighter.performRoll();
        fighter.performPunch();
    }
}
