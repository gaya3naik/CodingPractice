import java.util.Stack;

/**
 * Created by gnaik on 13/04/17.
 */
public class BalancedParanthesis {

    private boolean hasBalancedParanthensies(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i =0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c== '{' || c == '('){
                stack.push(c);
            } else if(c == ']'){
               if(stack.empty() || stack.pop() != '['){
                   return false;
               }
            } else if(c == '}'){
                if(stack.empty() || stack.pop() != '{'){
                    return false;
                }
            } else if(c == ')'){
                if(stack.empty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String args[]){
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        System.out.println(balancedParanthesis.hasBalancedParanthensies("{(A,B)}"));
        System.out.println(balancedParanthesis.hasBalancedParanthensies("{(X},Y)"));
        System.out.println(balancedParanthesis.hasBalancedParanthensies("{)(P,Q,R}"));
    }
}
