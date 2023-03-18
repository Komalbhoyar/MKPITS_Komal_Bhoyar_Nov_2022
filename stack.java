public class stack {
    int []array;588
    int topofStack;
    stack(int size){
        array=new int[size];
        topofStack=-1;
        System.out.println("Stack created with size="+size);

    }

        public boolean isEmpty() {
            if (topofStack == -1) {
                return true;
            } else {
                return false;


            }
        }
        public boolean isfull() {
            if (topofStack == array.length - 1) {
                return true;
            } else {
                return false;

            }
        }
        public void push(int value) {
            if (isfull()) {
                System.out.println("stack is full");
                return;
            } else {
                array[topofStack + 1] = value;
                topofStack++;
                System.out.println("the value is successfully inserted");

            }
        }
        public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else {
            int topstack=array[topofStack];
            topofStack--;
            return topstack;
        }
        }
    public static void main(String[] args){
        stack stck=new stack(2);
         boolean check=stck.isEmpty();
        System.out.println(check);
        System.out.println(stck.pop());
        stck.push(2);
        stck.push(3);
        stck.push(3);
    }

}
