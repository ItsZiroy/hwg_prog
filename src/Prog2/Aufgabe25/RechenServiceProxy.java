package Prog2.Aufgabe25;

import java.util.HashMap;
import java.util.Map;

public class RechenServiceProxy implements RechenService{
    RechenServiceImpl proxy = new RechenServiceImpl();
    Map<Integer, Long> cache = new HashMap<>();
    @Override
    public long fakultaet(int n) throws IllegalArgumentException {
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        long result = proxy.fakultaet(n);
        cache.put(n, result);
        return result;
    }
}
