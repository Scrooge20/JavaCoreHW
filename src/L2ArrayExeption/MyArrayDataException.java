package L2ArrayExeption;

public class MyArrayDataException extends Exception{
    // исключение, при неудачном преобразовании
    private int numberEx;

    public MyArrayDataException(String s) {
        System.out.println(s);
    }

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
    public MyArrayDataException(String message, int numberEx) {
        super(message);
        this.numberEx = numberEx;
    }
}
