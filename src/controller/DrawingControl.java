package controller;
import java.util.Observable;

public class DrawingControl extends Observable {
    public DrawingControl() {
    }

    public void draw() {
        setChanged();
        notifyObservers();
    }

}
 