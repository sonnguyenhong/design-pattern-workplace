package fighter_game;

public class Ryu extends Fighter {
    public Ryu() {
        this.setRollBehavior(new TonadoRoll());
        this.setJumpBehavior(new LongJump());
        this.setKickStrategy(new SlowKick());
        this.setPunchStrategy(new PowerPunch());
    }
    @Override
    public void display() {
        System.out.println("I am Ryu");
    }
}
