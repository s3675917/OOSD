import controller.SetupController;
import view.SetupView;
public class main{
public static void main(String[]args)throws Exception
        {
        SetupView setupView=new SetupView();
        SetupController controller=new SetupController(setupView);
        controller.start();
        }
}