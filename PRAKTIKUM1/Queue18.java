package PRAKTIKUM1;
public class Queue18 {

    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue18(int n) {
        max = n;
        data = new int [max];
        size = 0;
        front = rear = -1;
    }

    public boolean ISEmpty() {
        if (size ==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void peek() {
        if (!ISEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (ISEmpty()) {
            System.out.println("queue masih kosong");
        } else {
            int i = front;
            while (i != rear ) {
                System.out.print(data[i] + " ");
                i = (i +1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!ISEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue (int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            
        } else {
            if (ISEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data [rear] = dt;
            size ++;
        }
    }

    public int Deaqueue() {
        int dt = 0;
        if (ISEmpty()) {
            System.out.println("Queueue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (ISEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}