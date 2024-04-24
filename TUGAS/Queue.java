package TUGAS;

public class Queue {
    pasien [] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new pasien[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max ){
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue (pasien antri){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
        }
        antrian [rear] = antri;
        size++;
    }

    public pasien Dequeue() {
        pasien antri = new pasien();
        if (IsEmpty()) { 
            System.out.println("Queue masih kosong");
        }  else {
            antri = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noID + " " + antrian[front].jeniskelamin + " " + antrian[front].umur );    
           } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (IsEmpty()) {
            System.out.println("queue masih kosong");
        } else {
            int i = front;
            while (i != rear ) {
                System.out.print(antrian[front].nama + " " + antrian[front].noID + " " + antrian[front].jeniskelamin + " " + antrian[front].umur);
                i = (i +1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jeniskelamin + " " + antrian[i].umur);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public pasien peekRear() {
        pasien antri = new pasien();
        if (!IsEmpty()) {
            antri = antrian [rear];
            return antri ;
        } else {
            System.out.println("Queue masih kosong");
            return null;
        }
    }

    public int peekPosition(String nama) {
        int i = front;
        int count = 1;
        while (i != rear) {
            if (antrian[i].nama.equals(nama)) {
                return count;
            }
            count++;
            i = (i + 1) % max;
        }
        if (antrian[i].nama.equals(nama)) {
            return count;
        }
        return -1; 
    }

    public void daftarPasien() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jeniskelamin + " " + antrian[i].umur);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jeniskelamin + " " + antrian[i].umur);
        }
    }

} 
