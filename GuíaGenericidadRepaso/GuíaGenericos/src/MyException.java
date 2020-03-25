public class MyException extends Exception{
    private String errorMessage;

    //CONSTRUCTOR
    public MyException(String errorMessage)
    {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage()
    {
        return this.errorMessage;
    }

}
