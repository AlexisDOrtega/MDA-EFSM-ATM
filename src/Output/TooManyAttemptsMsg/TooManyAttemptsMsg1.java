package Output.TooManyAttemptsMsg;
/*
    Account 1 class for Too Many Attempts Message
 */
public class TooManyAttemptsMsg1 extends TooManyAttemptsMsg{
    // display too many attempts message
    @Override
    public void tooManyAttemptsMsg(){
        System.out.println("Account 1: You have made too many incorrect attempts. You will now be locked out of your account.");
    }
}
