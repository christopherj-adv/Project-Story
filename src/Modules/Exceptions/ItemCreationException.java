package Modules.Exceptions;

public class ItemCreationException extends Exception
{
    String message;

    public ItemCreationException(String message)
    {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
