package fighter_game;

public class PowerPunch implements PunchStrategy {
    @Override
    public void punch() {
        System.out.println("Making a power punch");
    }
}
