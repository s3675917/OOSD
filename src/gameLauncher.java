import controller.SetupController;
import view.SetupView;
/*The game has 6 pieces, three pieces for each player/user. One player is going to play as prisoners and the other player
is going to play as police officers. The officers have the pieces officer,dog,guard and prisoners have kingpin,.... . There is
a key in the middle of the board that is moving left and right. The goal of the game is for the players/users to move their assigned pieces
and get the key to escape the prison or to protect the prison*/
public class gameLauncher {
public static void main(String[]args)throws Exception
        {
        SetupView setupView=new SetupView();
        SetupController controller=new SetupController(setupView);
        controller.start();
        }
}