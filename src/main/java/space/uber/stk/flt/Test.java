package space.uber.stk.flt;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {


        String s = "Grammatik1 := Grammatik" + '(' +  "N,T,P,S"  + ')' +
        "N = " + '{'+ "S,A,B" + '}' +
        "T = " + '{'+ "a,b" + '}' +
        "P = "+ '{' + 
        "S -> A, A -> B | EPSILON, B -> b"
        + '}' +
        "S = "
         + '{' + "S" + '}';

        s = s.replaceAll("\\s+","");

        System.out.println(s);
    }
}