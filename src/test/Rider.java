package test;

public class Rider extends Thread{
    int number = 1;
    int score = 60;
   int  trackLength = 3000;


    public Rider( int number, int score) {
        setName(number,score);

    }

    public Rider(int i) {
    }

    private void setName(int number, int score) {
        this.number = number;
        this.score=score;
    }

    public void run() {

        System.out.println("запуск потока -" + this.getName());
        try {
            System.out.println("Останавливаем поток на 1 секунд - " + this.getName());
            sleep(300);

        } catch (InterruptedException ie) {
        }
        System.out.println("Всадник финишировал - " + number);
    }
}