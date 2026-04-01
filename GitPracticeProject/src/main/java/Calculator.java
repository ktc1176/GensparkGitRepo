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

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //add function
    public int add(){
        return num1 + num2;
    }

    //subtract function
    public int subtract(){
        return num1 - num2;
    }
}
