package Output.TooManyAttemptsMsg;
/*
    Account 2 class for Too Many Attempts Message
 */
public class TooManyAttemptsMsg2 extends TooManyAttemptsMsg{
    // display too many attempts message
    @Override
    public void tooManyAttemptsMsg(){
        System.out.println("Account 2: You have made too many incorrect attempts. Your Account will now be suspended.");
    }
}
