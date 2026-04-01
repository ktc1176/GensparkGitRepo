public class Calculator {
    int num1;
    int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator(){
        this.num1 = 0;
        this.num2 = 0;
    }

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num1 - num2;
    }
}
