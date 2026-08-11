package Data;
/*
    this class serves as the Data Store for Account 2.
 */

public class DataAccount2 extends Data {

    public int pin;
    public float balance;
    public int id;

    //Temp values.
    public float temp_a;
    public int temp_y;
    public int temp_p;
    public float temp_d;
    public float temp_w;

    static final float penaltyAmount = 15;
    /*
    Setters & Getters
     */

    public void setTemp_y(int temp_y) {
        this.temp_y = temp_y;
    }
    public float getTemp_a() {
        return temp_a;
    }
    public void setTemp_a(float temp_a) {
        this.temp_a = temp_a;
    }
    public int getTemp_p() {
        return temp_p;
    }
    public void setTemp_p(int temp_p) {
        this.temp_p = temp_p;
    }
    public float getBalance() {
        this.balance = getTemp_a();
        return this.balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    public int getPin() {
        this.pin = getTemp_p();
        return this.pin;
    }
    public void setPin() {
        this.pin = getTemp_p();
    }
    public float getTemp_d() {
        return temp_d;
    }
    public void setTemp_d(float temp_d) {
        this.temp_d = temp_d;
    }
    public float getTemp_w() {
        return temp_w;
    }
    public void setTemp_w(float temp_w) {
        this.temp_w = temp_w;
    }
    public int getId() {
        this.id = getTemp_y();
        return this.id;
    }

    private int getTemp_y() {
        return temp_y;
    }

    public void setId() {
        this.id = getTemp_y();
    }
    /*
        perform the withdraw, deposit, and penalty for Account1
         */
    public void withdraw() {
        this.balance = this.temp_a -this.temp_w;
        this.temp_a = this.balance;
    }

    public void deposit(){
        this.balance = this.temp_a + this.temp_d;
        this.temp_a = this.balance;
    }
    public void applyPenalty(){
        this.balance = temp_a - penaltyAmount;
        this.temp_a = this.balance;
    }
}
