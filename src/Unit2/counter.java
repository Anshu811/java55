package Unit2;

public class counter {
    private int count=0;
    public synchronized void Increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
