package Output.IncorrectUnlockMsg;
/*
    This class does nothing since Account 2 does not have a lock/unlock mechanism.
 */

public class IncorrectUnlockMsg2 extends IncorrectUnlockMsg {
    @Override
    public void incorrectUnlockMsg() {
        System.out.println("Account 2: Should never unlock or lock");
    }
}
