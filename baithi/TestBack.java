package baithi;

public class TestBack  {
    public static void main(String[] args) {
        Back back = new Back(1000,10);
        double interest = back.calculatelnterest();
        System.out.println("The interest for a balance of $1000 and a rate of 10% is $" + interest);
    }
}

