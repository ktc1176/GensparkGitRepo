public class Main {
    public void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("Sum: " + calculator.add());
        System.out.println("Difference: " + calculator.subtract());
    }
}
