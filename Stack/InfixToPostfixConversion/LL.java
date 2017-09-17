
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author k163641
 */
public class LL {
    static int checkPrecedence(Character op)
    {
        if(op=='*' || op=='/') return 3;
        else if(op=='+'||op=='-')return 2;
        return 1;
    }
     static String convert(String exp)
     {
         String output = " ";
         Character last = null;
         Stack<Character> stack = new Stack();
         for(int i=0;i<exp.length(); i++)
         {
             if(exp.charAt(i)=='(')
             {
                 stack.push('(');
             }
             else if(Character.isDigit(exp.charAt(i)))
             {
                 if(last==null)
                 output+= exp.charAt(i);
                 else
                 {
                     output+=" " + exp.charAt(i);
                 }
                 last = exp.charAt(i);
             }
             else if(exp.charAt(i)==')')
             {
                 while(stack.peek()!='(')
                 {
                     output += stack.pop();
                 }
                 stack.pop();
             }
             else
             {
                 while(!stack.isEmpty() && stack.peek()!='(' && checkPrecedence(stack.peek())>= checkPrecedence(exp.charAt(i)))
                 {
                     output+= " " + stack.pop();
                 }
                 stack.push(exp.charAt(i));
                 last = exp.charAt(i);
             }
             
                 
         }
         while(!stack.isEmpty())
         {
             if(stack.peek()!='(')
             {
                 output+=" " + stack.pop();
             }
         }
         return output;
     }
     
     static int evaluate(String postFix)
     {
         Stack op = new Stack();
     }
    public static void main(String[] args)
    {
       
        
        Stack s = new Stack<>();
        String exp = "2+3";
        System.out.println(convert(exp));
        
       // A+B(C+D)  -> ABCD+*+
        
    }
    
    
}
