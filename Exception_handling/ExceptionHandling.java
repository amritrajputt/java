package Exception_handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // int c = a/b;
            // divide(a, b);
            String name = "amrit";
            if(name.equals("amrit")){
                throw new MyException("name is amrit");
            }
        } 
        catch (MyException e) {
            System.out.println(e.getMessage()); // return in predefined message
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // return in predefined message
        }

        /*
         * multiple catch is also allowed but in this case you can't put exception at
         * top because it includes all
         * type of exception so below 2nd catch never became executed so put specific
         * exception on top then exception(main) below.
         */

        catch (Exception e) {
            System.out.println("normal exception"); // return in predefined message
        }
    }

    static int divide(int a, int b) throws ArithmeticException { // we have to define that it may throw an arthematic
                                                                 // exception. throws use to say it may throw an
                                                                 // exception
        if (b == 0) {
            throw new ArithmeticException("divide by 0 not allowed"); // here we're passing custom msg
        } else {
            return a / b;
        }
    }
}
