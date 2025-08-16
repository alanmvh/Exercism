class CalculatorConundrum {
    private int total = 0;
    
    public String calculate(int operand1, int operand2, String operation) {
        if(operation == null){throw new IllegalArgumentException("Operation cannot be null");}
        switch(operation){
            case "+":
                this.total = operand1 + operand2;
                 break;
            case "/":
                try{
                    this.total = operand1 / operand2;
                }
                catch(ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                this.total = operand1 / operand2;
                break;
            case "*":
                this.total = operand1 * operand2;
                break;
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation " + "'"  + operation + "'" + " does not exist");
                
        }
        return Integer.toString(operand1) + " " + operation + " " + Integer.toString(operand2) + " =" + " " + Integer.toString(this.total);
    }
    
}
