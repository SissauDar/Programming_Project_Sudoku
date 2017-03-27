package calculatorPackage;


public class calculator {

    private int total = 0;

    public void add(int number) {
        if (number > 0) {
            total += number;
        }
    }
    
    public int getTotal(){
        return total;
    }
}
