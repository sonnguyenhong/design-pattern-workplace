package fighter_game;

import java.security.PublicKey;

public abstract class Fighter {
    private RollBehavior rollBehavior;
    private JumpBehavior jumpBehavior;
    private PunchStrategy punchStrategy;
    private KickStrategy kickStrategy;
    public abstract void display();
    public void performRoll() {
        rollBehavior.roll();
    }
    public void performJump() {
        jumpBehavior.jump();
    }
    public void performPunch() {
        punchStrategy.punch();
    }
    public void performKick() {
        kickStrategy.kick();
    }

    public RollBehavior getRollBehavior() {
        return rollBehavior;
    }

    public void setRollBehavior(RollBehavior rollBehavior) {
        this.rollBehavior = rollBehavior;
    }

    public JumpBehavior getJumpBehavior() {
        return jumpBehavior;
    }

    public void setJumpBehavior(JumpBehavior jumpBehavior) {
        this.jumpBehavior = jumpBehavior;
    }

    public PunchStrategy getPunchStrategy() {
        return punchStrategy;
    }

    public void setPunchStrategy(PunchStrategy punchStrategy) {
        this.punchStrategy = punchStrategy;
    }

    public KickStrategy getKickStrategy() {
        return kickStrategy;
    }

    public void setKickStrategy(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }
}
