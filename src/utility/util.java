package utility;

import java.util.Random;

import controller.GameControl;
import model.Position;
import model.tile.Tiles;

public class util {
    public static boolean findEle(Tiles[] arr, int targetValue) {
        if (arr[targetValue] != null){
            return true;}
        else
            return false;
    }

    /**
     * @param lo Lower bound
     * @param hi Upper bound
     * @return a random number range from lo to hi
     * @Precondition Upper bound must greater than lower bound
     */
    public static int randInt(int lo, int hi) {
        //precondition
        assert lo < hi : ("invaild arguments: Upper bound must greater than lower bound");

        Random random = new Random();

        int s = random.nextInt(hi) % (hi - lo + 1) + lo;

        //uncomment to break postcondition
        //s += 10000;

        //postcondition
        assert lo <= s && s <= hi : ("outcome should be greater than lower bound and less than upper bound");

        return s;
    }

    public static Position randPos() {
        return new Position(randInt(1, GameControl.gameSize - 1), randInt(1, GameControl.gameSize - 1));
    }

}
