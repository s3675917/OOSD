package controller;

import java.util.Observable;

import static java.lang.Thread.sleep;

public class DrawingControl extends Observable {
    private Boolean isDrawing = true;

    public Boolean getDrawing() {
        return isDrawing;
    }

    public void setDrawing(Boolean drawing) {
        isDrawing = drawing;
    }

    public DrawingControl() {
    }

    public void drawMoving() {
        try {
            draw();
            isDrawing = true;
            sleep(1300);
            stopDrawing();
            isDrawing = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void drawSuddenlyChange() {
        try {
            draw();
            isDrawing = true;
            sleep(200);
            stopDrawing();
            isDrawing = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw() {
        setChanged();
        notifyObservers("draw");
    }

    public void stopDrawing() {
        setChanged();
        notifyObservers("stop");
    }

}
 