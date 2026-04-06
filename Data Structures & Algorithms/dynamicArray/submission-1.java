class DynamicArray {
    int []arr;
        int capacity; 
        int length;


    public DynamicArray(int capacity) {
       this.capacity = capacity;
       this.length = 0;
       this.arr = new int[this.capacity];

    }

    public int get(int i) {
        return arr[i];

    }
    //set the element at index i to n
    public void set(int i, int n) {
        arr[i] = n;

    }
    //push the element n to the end of the array
    public void pushback(int n) {
        if (length == capacity)
        {
            resize();
        }
        arr[length] = n;
        length++;

    }
    //Remove the last element in the array
    public int popback() {
        if(length > 0)
        {
            length--;
        }
        return arr[length];

    }
    //resize the array
    private void resize() {
        capacity = 2*capacity;
        int [] newArr = new int[capacity];

        // Copy elements to newArr
   for (int i = 0; i < length; i++) {
       newArr[i] = arr[i];
   }
   arr = newArr;

    }

    public int getSize() {
        return length;

    }

    public int getCapacity() {
        return capacity;
    }
}
