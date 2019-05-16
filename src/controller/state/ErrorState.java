package controller.state;

public class ErrorState {
    private static String errorMessage;
    public ErrorState() {
        setDefault();
    }

    public static String getErrorMessage() {
        return errorMessage;
    }

    public static void setErrorMessage(String errorMessage) {
        ErrorState.errorMessage = errorMessage;
        new Thread(){
            public void run(){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setDefault();
            }
        }.start();
    }

    public static void setDefault(){errorMessage = "";};
}
