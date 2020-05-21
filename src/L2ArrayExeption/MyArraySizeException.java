package L2ArrayExeption;

public class MyArraySizeException extends Exception{
    // исключение если несоответствует размер массива
    private int numberEx; // параметр исключения

    public int getNumberEx() {
        return numberEx;
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public MyArraySizeException(String message, int numberEx) {
        super(message);
        this.numberEx = numberEx;
    }
}
