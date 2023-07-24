package fighter_game;

public class Ken extends Fighter {
    public Ken() {
        this.setJumpBehavior(new ShortJump());
        this.setRollBehavior(new LightningRoll());
        this.setKickStrategy(new QuickKick());
        this.setPunchStrategy(new StrongPunch());
    }
    @Override
    public void display() {
        System.out.println("I am Ken");
    }
}
