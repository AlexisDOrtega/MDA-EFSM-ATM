package Data;
/*
    this class serves as the Data Store for Account 1.
 */
public class DataAccount1 extends Data {
    public int balance;
    public int pin;
    public int id;
    static final int penaltyAmount = 20;

    //temp values

    public int temp_p;
    public int temp_y;
    public int temp_a;
    public int temp_d;
    public int temp_w;
    /*
    Setters & Getters
     */

    public int getTemp_p() {
        return temp_p;
    }
    public void setTemp_p(int temp_p) {
        this.temp_p = temp_p;
    }
    public int getPin() {
        this.pin = getTemp_p();
        return this.pin;
    }
    public void setPin() {
        this.pin = getTemp_p();
    }
    public int getTemp_a() {
        return temp_a;
    }
    public void setTemp_a(int temp_a) {
        this.temp_a = temp_a;
    }
    public int getTemp_d() {
        return temp_d;
    }
    public void setTemp_d(int temp_d) {
        this.temp_d = temp_d;
    }
    public int getId() {
        this.id = getTemp_y();
        return this.id;
    }
    public void setId() {
        this.id = getTemp_y();
    }
    public int getTemp_y() {
        return temp_y;
    }
    public void setTemp_y(int temp_y) {
        this.temp_y = temp_y;
    }
    public int  getTemp_w() {
        return temp_w;
    }
    public void setTemp_w(int temp_w) {
        this.temp_w = temp_w;
    }

    public int getBalance() {
        this.balance = getTemp_a();
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
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
