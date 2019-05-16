package model.player;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import controller.TileManager;
import controller.state.ErrorState;
import model.DIR;
import model.Position;
import model.item.Item;
import model.spell.PlayerVisitor;
import utility.util;
import view.utils.Animation;
import view.utils.Sprite;

/*
 *
 * FOV is the number of the block this player can see
 * facingDir is which side this player is facing now
 * start is the time when player starts moving in the view
 * */
public abstract class Player {

    protected Position pos;
    protected String name;
    protected ArrayList<Item> inventory = null;
    protected int FOV;
    protected Enum<PlayerStat> status;
    protected DIR facingDir;
    protected int stamina;
    private Sprite sprite;
    private Sprite sprite1;
    private long start;
    private boolean walking;
    private int wh = 32;

    private Animation animation;

    public Player(Position pos, String name) {
        this.pos = pos;
        this.name = name;
        this.FOV = 5;
        this.status = PlayerStat.normal;
        facingDir = DIR.down;
        sprite = new Sprite("res/entity/references/player_referrence.png", wh, wh);
        sprite1 = new Sprite("res/entity/references/arr.png", 32, 32);
        stamina = 3;

        /*
         * offX and offY are player animation movement beats
         *
         * */
        walking = false;
        animation = new Animation(0, 0);

    }

    public Position checkMove(DIR dir) {
        int x = this.pos.getX();
        int y = this.pos.getY();
        animation.setOldPos(pos);
        switch (dir) {
            case up:
                y--;
                animation.setDirection(3);
                break;
            case down:
                y++;
                animation.setDirection(0);
                break;
            case left:
                x--;
                animation.setDirection(1);
                break;
            case right:
                x++;
                animation.setDirection(2);
                break;
        }
        Position pos = new Position(x, y);
        return pos;
    }

    public void move(DIR dir) throws Exception {
        Position nextPos = checkMove(dir);
        if (!TileManager.wallAhead(nextPos)) {
            setPos(nextPos);
            walking = true;
            start = System.currentTimeMillis();
        } else {
            ErrorState.setErrorMessage("wall ahead");
            throw new Exception();
        }
    }

    public void setFacing(DIR dir) {
        int direction = 0;
        if (dir != null) {
            switch (dir) {
                case down:
                    direction = 0;
                    break;
                case up:
                    direction = 3;
                    break;
                case left:
                    direction = 1;
                    break;
                case right:
                    direction = 2;
                    break;
            }
            animation.setDirection(direction);
            facingDir = dir;
        }
    }

    public DIR getFacing() {
        return this.facingDir;
    }


    public Position getNextXPosition(int X) {
        int x = this.getPos().getX();
        int y = this.getPos().getY();
        DIR dir = this.getFacing();
        Position targetPositions = null;
        switch (dir) {
            case up:
                targetPositions = new Position(x, y - X);
                break;
            case down:
                targetPositions = new Position(x, y + X);
                break;
            case left:
                targetPositions = new Position(x - X, y);
                break;
            case right:
                targetPositions = new Position(x + X, y);
                break;
        }
        return targetPositions;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void deductStamina(int requiredStamina) {
        this.stamina = this.stamina - stamina;
    }

    public boolean checkStamina(int requiredStamina) {
        if (this.getStamina() < requiredStamina) {
            ErrorState.setErrorMessage("cant cast spell due to low stamina");
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFOV() {
        return FOV;
    }

    /**
     * Set the player's field of view
     *
     * @param FOV field of view
     * @Precondition FOV must greater than 0
     */
    public void setFOV(int FOV) {
        assert FOV > 0 : ("FOV must greater than 0");
        this.FOV = FOV;
    }

    public Enum<PlayerStat> getStatus() {
        return status;
    }

    public void setStatus(Enum<PlayerStat> status) {
        this.status = status;
    }

    public void render(Graphics g) {
    }

    public long getStart() {
        return start;
    }

    public void setWalking(boolean walking) {
        this.walking = walking;
    }

    public boolean isWalking() {
        return walking;
    }

    public BufferedImage getSpriteImage() {
        return sprite.getSprite(animation.getNum(), animation.getDirection(), wh, wh);
    }

    public void AnimationAddNum() {
        animation.addNum();
    }

    public BufferedImage getStandingImage() {
        if (this.status == PlayerStat.arrested) {
            return sprite.getSprite(7, 0, wh, wh);
        } else
            return sprite.getSprite(0, animation.getDirection(), wh, wh);
    }

    public BufferedImage getNextStandingImage() {

        return sprite1.getSprite(0, 0);
    }

    public int getWh() {
        return wh;
    }

    public abstract void accpet(PlayerVisitor sVisitor);


    public Position getOldPos() {
        return animation.getOldPos();
    }
}
