/**
 * Created by gnaik on 13/04/17.
 */

//Implement two stacks in an array
// This approach uses the extreme ends of the array for two stacks.
public class TwoStacksImplementedUsingSingleArray {

    int size = 100000; // Can be given any maximum size Array of this size will be used to implement two stacks

    int array[];
    int position1, position2;

    TwoStacksImplementedUsingSingleArray(){
        array = new int[size];
        position1 = -1;
        position2 = size-1;
    }

    private void pushIntoStack1(int num){
        if(position1 < position2-1){
            position1++;
            array[position1]= num;
        } else {
            System.out.println("Stack 1 Overflow");
            System.exit(1);
        }
    }

    private void pushIntoStack2(int num){
        if(position1 < position2-1){
            position2--;
            array[position1]= num;
        } else {
            System.out.println("Stack 2 Overflow");
            System.exit(1);
        }
    }

    private int popFromStack1(){
        if(position1 >=0){
            int num = array[position1];
            position1--;
            return num;
        } else {
            System.out.println("Stack 1 Overflow");
            System.exit(1);
        }
        return 0;
    }

    private int popFromStack2(){
        if(position2 < size){
            int num = array[position2];
            position2++;
            return num;
        } else {
            System.out.println("Stack 2 Overflow");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String args[]){
        TwoStacksImplementedUsingSingleArray twoStacksImplementedUsingSingleArray = new TwoStacksImplementedUsingSingleArray();
        twoStacksImplementedUsingSingleArray.pushIntoStack1(1);
        twoStacksImplementedUsingSingleArray.pushIntoStack1(3);
        twoStacksImplementedUsingSingleArray.pushIntoStack1(5);
        twoStacksImplementedUsingSingleArray.pushIntoStack2(9);
        twoStacksImplementedUsingSingleArray.pushIntoStack1(6);
        twoStacksImplementedUsingSingleArray.popFromStack1();
        twoStacksImplementedUsingSingleArray.popFromStack2();
        twoStacksImplementedUsingSingleArray.popFromStack1();
        twoStacksImplementedUsingSingleArray.popFromStack2();
    }

}
