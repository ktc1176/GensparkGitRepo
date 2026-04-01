public class Main {
    public void main(String[] args){
        //create new calculator class
        Calculator calculator = new Calculator();

        //set input numbers
        calculator.setNum1(10);
        calculator.setNum2(20);

        //output results to console
        System.out.println("Sum: " + calculator.add());
        System.out.println("Difference: " + calculator.subtract());
    }
}
