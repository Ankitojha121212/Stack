import java.util.Scanner;
class stack
{
    Scanner scan=new Scanner(System.in);
    int top=-1;
    int[] arr=new int[10];// creating the array
    int size=arr.length;//using length for accesing the size of array

    public void push(int data)
        {
            //chcking whether the stack is full or not;
            if(top==size-1){
                System.out.println("Stack is full");
            }
            else{
                //firstly increment the value of top;
            top++;
            arr[top]=data;//it receive data and put into the array of stack
            System.out.println("arr     "+ arr[top]);//just for showing the data
            }

    }
}
class Main
{
    public static void main(String[] args) {
        //object creation
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(9);
        st.push(10);
        st.push(11);//these are stack overflow statement
        st.push(12);//these are stack overflow statement
    }
}