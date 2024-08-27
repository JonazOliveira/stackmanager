public class Stack {
    // Stack properties
    private final int length;
    private final int[] stack;
    
    private int storage = 0;

    // Stack of constructors
    public Stack() {
        this(10);
    }
    public Stack(int length) {
        this.length = length;
        stack = new int[length];
    }

    // Getters of stack
    public int[] getStack(){
        return this.stack;
    }
    public void getPrintedStack(){
        for(int i = (this.length-1); i >=0 ; i--) {
            System.out.println(this.stack[i]);
        }
    }
    public int getLength(){
        return this.length;
    }

    // Add of value in stack
    public void push(int value) {
        if(this.storage < this.length){
            this.stack[this.storage] = value;
            this.storage++;
        } else {
            System.out.println("Stack is full!");
        }
    }

    // Remove of value stack
    public void pop(){
        if(this.storage != 0){
            this.storage--;
            this.stack[this.storage] = 0;
        } else {
            System.out.println("Stack is empty!");
        }
    }
}
