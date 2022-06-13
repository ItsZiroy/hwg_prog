package Prog2.Aufgabe25;

public class RechenServiceImpl implements RechenService {
    @Override
    public long fakultaet(int n) throws IllegalArgumentException {
        if(n < 0) throw new IllegalArgumentException();
        if(n <= 1) return 1;
        return n * fakultaet(n - 1);
    }
}
