package Output.IncorrectLockMsg;
/*
    This class does nothing for Account 2 since there is no lock in the design for it.
 */
public class IncorrectLockMsg2 extends IncorrectLockMsg{

    @Override
    public void incorrectLockMsg() {
        System.out.println("Account 2: should never lock");
    }
}
