package fighter_game;

public class ChunLi extends Fighter {
    public ChunLi() {
        this.setJumpBehavior(new LongJump());
        this.setRollBehavior(new LightningRoll());
        this.setPunchStrategy(new PowerPunch());
        this.setKickStrategy(new SlowKick());
    }
    @Override
    public void display() {
        System.out.println("I am ChunLi");
    }
}
