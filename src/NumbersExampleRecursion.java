public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers:1 2 3 4 5
        print(1);
    }

    //-------> very important------>call itself
    static void print(int n){
        //define base condition to stop the fuction making new calls.
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        // if you are calling a function again and again, you can treat it as a seperate call in the stack
        //this is tail reccusion since it is last function call.
        print(n+1);
    }
}
