class MyCircularDeque {
int q[];
int capacity;
int size=0;
int front;
int rear;
    public MyCircularDeque(int k) {
       q=new int[k];
       front=0;
       rear=-1;
       capacity=k;

    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(size==0) {
            front=rear=0;         
         }else{
            front=(front-1+capacity)%capacity;
    }
            q[front]=value;

            size++;
            return true;
         }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        if(size==0) {
        front=rear=0;
        }
        else{
        rear=(rear+1)%capacity;
        }
        q[rear]=value;
        size++;
        
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty())return false;
        if (size == 1) {
            front = 0;
            rear = -1;
        }else
        front=(front+1)%capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
          if (size == 1) {
            front = 0;
            rear = -1;
        } else
        rear=(rear-1+capacity)%capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        
        return q[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        
        return q[rear];
    }
    
    public boolean isEmpty() {
    return size==0;   
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */