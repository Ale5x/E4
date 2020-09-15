package partOne.test5;

public class Counter {

    private int counter = 0;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public int setCounterPlus(){
        return counter++;
    }

    public int setCounterMinus(){
        return counter--;
    }
}

