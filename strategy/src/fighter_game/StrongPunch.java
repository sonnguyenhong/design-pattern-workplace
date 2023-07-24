package fighter_game;

public class StrongPunch implements PunchStrategy {
    @Override
    public void punch() {
        System.out.println("Making a strong punch");
    }
}
