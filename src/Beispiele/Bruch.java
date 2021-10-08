package Beispiele;

public final class Bruch {

    private final float oben;

    private final float unten;

    public Bruch(float o, float u) throws NennerNullException  {
        oben = o;
        try {
            if (u == 0) {
                throw new NennerNullException("bruch.dont.divide.null");
            }
        }
        catch (NennerNullException  e) {

        }
        catch (Exception e) {

        }
        unten = u;
    }

    public double gibDouble() {
        return oben / unten;
    }

}
