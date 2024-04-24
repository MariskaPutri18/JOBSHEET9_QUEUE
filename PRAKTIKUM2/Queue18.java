package PRAKTIKUM2;
public class Queue18 {
    Nasabah18 [] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue18(int n) {
        max = n;
        data = new Nasabah18 [max];
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
    public void clear() {
        if (!ISEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void Enqueue (Nasabah18 dt) {
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

    public Nasabah18 Dequeue() {
        Nasabah18 dt = new Nasabah18();
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

    public void peek() {
        if (!ISEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " +data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " +data[front].saldo);    
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
                System.out.print(data[i].norek + " " +data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " +data[i].saldo);
                i = (i +1) % max;
            }
            System.out.println(data[i].norek + " " +data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " +data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public Nasabah18 peekRear() {
        Nasabah18 dt = new Nasabah18();
        if (!ISEmpty()) {
            dt = data[rear];
            return dt;
        } else {
            System.out.println("Queue masih kosong");
            return null;
        }
    }
    


}
