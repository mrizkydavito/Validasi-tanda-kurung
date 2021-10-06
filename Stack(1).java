public class Stack<T>{
    public T[] data;
    public int top = 0;

    public Stack(int a){
        data = (T[]) new Object [a];
    }
    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull (){
        return top == data.length;
    }
    public void push(T value){
        if ( !isFull()){
            data [ top ] = value;
            top = top + 1;
        }else{
            System.out.println("Stack Sudah Penuh !");
        }
    }

    public T pop (){
    if ( !isEmpty ()){
        top = top - 1;
        T b = data[top];
        return b;
    }else{
        return null;
    }
    }

    public T peek (){
        if ( !isEmpty ()){
            return data[top - 1];
        }else{
            return null;
        }
        }
    }