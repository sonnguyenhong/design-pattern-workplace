package fighter_game;

public class SlowKick implements KickStrategy {

    @Override
    public void kick() {
        System.out.println("Perform slow kick");
    }
}
