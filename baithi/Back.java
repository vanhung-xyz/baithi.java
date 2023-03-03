package baithi;


public class Back {
    private double balance;
    public double rate;
    public Back(double balance, double rate){
        this.balance = balance;
        this.rate = rate;
    }
    public double calculatelnterest(){
        return this.balance*(this.rate/1200);
    }
}



