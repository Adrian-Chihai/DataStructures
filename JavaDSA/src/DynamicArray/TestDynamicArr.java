package DynamicArray;

public class TestDynamicArr {
    private int size;
    private int capacity = 10;
    private Object[] array;

    public int getCapacity() {
        return capacity;
    }

    public TestDynamicArr(){
        this.array = new Object[capacity];
    }

    public TestDynamicArr(int capacity){
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }

        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){

    }

    public void delete(Object data){

    }

    public void search(Object data){

    }

    public void grow(){

    }

    public void shrink(){

    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        String arr;

        for (int i = 0; i < size; i++){
            stringBuilder.append(array[i] + ", ");
        }

        if (stringBuilder.length() > 0){
            arr = "[" + stringBuilder.substring(0, stringBuilder.length() - 2) + "]";
        } else {
            arr = "[]";
        }

        return arr;
    }
}
