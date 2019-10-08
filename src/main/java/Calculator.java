public class Calculator {
    private int int1;
    private int int2;
    private double double1;
    private double double2;

    public Calculator(int int1, int int2, double double1, double double2){
        this.int1 = int1;
        this.int2 = int2;
        this.double1 = double1;
        this.double2 = double2;
    }

//    Add
    public int add(){ return this.int1 + this.int2; }

//    Subtract
    public int subtract(){ return this.int1 - this.int2; }

//    Multiply
    public int multiply(){ return this.int1 * this.int2; }

//    Divide
    public double divide(){ return this.double1 / this.double2; }

}
