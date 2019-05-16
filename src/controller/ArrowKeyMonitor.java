package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import controller.command.Command;
import controller.command.DownKeyCommand;
import controller.command.LeftKeyCommand;
import controller.command.QKeyCommand;
import controller.command.WKeyCommand;
import controller.command.EKeyCommand;
import controller.command.RKeyCommand;
import controller.command.RightKeyCommand;
import controller.command.UpKeyCommand;
import model.DIR;
import model.player.Player;
import model.player.PlayerStat;
import model.spell.BreakWallVisitor;
import model.spell.DisguseVisitor;
import model.spell.PickDoorVisitor;
import model.spell.PlaceTrapVisitor;
import model.spell.PlayerVisitor;
import view.SetupJFame;

public class ArrowKeyMonitor extends KeyAdapter {

    private Command upKeyCommand = new UpKeyCommand();
    private Command downKeyCommand = new DownKeyCommand();
    private Command leftKeyCommand = new LeftKeyCommand();
    private Command rightKeyCommand = new RightKeyCommand();
    private Command QKeyCommand = new QKeyCommand();
    private Command WKeyCommand = new WKeyCommand();
    private Command EKeyCommand = new EKeyCommand();
    private Command RKeyCommand = new RKeyCommand();
    private PlayerVisitor pickDoor = new PickDoorVisitor();
    private PlayerVisitor breakWall = new BreakWallVisitor();
    private PlayerVisitor disguse = new DisguseVisitor();
    private PlayerVisitor placeTrap = new PlaceTrapVisitor();
    private DrawingControl drawingControl;

    public ArrowKeyMonitor(SetupJFame setupJFame) {
        drawingControl = new DrawingControl();
        drawingControl.addObserver(setupJFame);
        drawingControl.drawSuddenlyChange();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int count = GameControl.playerCounter;
        Player currentPlayer = GameControl.players.get(count);
        // SkillVisitor sVisitor = GameControl.skills.get(count);


        if (currentPlayer.getStatus() == PlayerStat.normal || currentPlayer.getStatus() == PlayerStat.invincible) {

            // ==================cast spell==================
            int keyCode = e.getKeyCode();
            if (keyCode >= KeyEvent.VK_A && keyCode <= KeyEvent.VK_Z) {
                castSkill(currentPlayer, keyCode);
                drawingControl.drawMoving();
                return;
            }
            // ==============================================

            // ==================move==================
            movement(currentPlayer, e);
            // ========================================
        } else {
            GameControl.playerCounter++; // if the player is immobilized, next player
        }

    }

    private DIR getDir(KeyEvent e) {
        int key = e.getKeyCode();
        DIR dir = null;
        switch (key) {
            case KeyEvent.VK_UP:
                dir = DIR.up;
                break;
            case KeyEvent.VK_DOWN:
                dir = DIR.down;
                break;
            case KeyEvent.VK_LEFT:
                dir = DIR.left;
                break;
            case KeyEvent.VK_RIGHT:
                dir = DIR.right;
                break;
            default:
                break;
        }

        return dir;
    }

    private void castSkill(Player currentPlayer, int keyCode) {

        switch (keyCode) {
            case KeyEvent.VK_Q:
                QKeyCommand.execute(currentPlayer, breakWall);
                return;
            case KeyEvent.VK_W:
                WKeyCommand.execute(currentPlayer, placeTrap);
                return;
            case KeyEvent.VK_E:
                EKeyCommand.execute(currentPlayer, pickDoor);
                return;
            case KeyEvent.VK_R:
                RKeyCommand.execute(currentPlayer, disguse);
                return;
            default:
                return;
        }

    }

    private void movement(Player currentPlayer, KeyEvent e) {
        DIR dir = getDir(e);
        if (dir == currentPlayer.getFacing()) {
            switch (dir) {
                case up:
                    upKeyCommand.execute(currentPlayer);
                    break;
                case down:
                    downKeyCommand.execute(currentPlayer);
                    break;
                case left:
                    leftKeyCommand.execute(currentPlayer);
                    break;
                case right:
                    rightKeyCommand.execute(currentPlayer);
                    break;
                default:
                    return;
            }

            drawingControl.drawMoving();

        } else {
            currentPlayer.setFacing(dir);
            drawingControl.drawSuddenlyChange();
        }
    }
}
