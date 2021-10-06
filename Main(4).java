import java.util.Scanner;

public class Main {

  
  public static void main(String[] args) {
    Stack<String> stack = new Stack<> (25);
    String input = "f(x)=(2x-y)-(3+(2x-x)+20)";
    Scanner scan = new Scanner (input);

    scan.useDelimiter("");

    for (int i = 0; i < input.length(); i++){
      String bentuk = scan.next();
      if (bentuk.equals("(")){
        stack.push("(");
      } else if (bentuk.equals (")")){
        stack.pop();
      }
    }
    if(stack.isEmpty()){
      System.out.println("valid");
    }else{
      System.out.println("tidak valid");
    }
  }
}