package application;


public class Model {
    public double calculate (long one, long two, String operator){
        switch (operator){
            case "+":
                return one+two;
            case "-":
                return one-two;
            case "*":
                return one*two;
            case "^":
                return Math.pow(one,two);
            case "/":
                if (two==0)
                    return 0;
                return one/two;
            default:
                return 0;
        }
    }
}
