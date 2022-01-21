package ch.ictbz.fifopuffer.fifopuffer;

public class FifoPuffer {
    private int[] puffer;
    private int amountNumbersStored = 0;

    public FifoPuffer(int size) {
        puffer = new int[size];

    }

    public void put(int zahl) throws Exception {
        if (amountNumbersStored >= puffer.length) throw new Exception("Der Puffer ist voll.");
        puffer[amountNumbersStored] = zahl;
        amountNumbersStored += 1;
    }
    public int get() throws Exception {
        if (amountNumbersStored == 0) throw new Exception("Der Puffer ist leer.");

        int returnValue = puffer[0];

        for (int i = 1; i < puffer.length; i++) {
            puffer[i-1] = puffer[i];
        }
        amountNumbersStored -= 1;

        return returnValue;
    }
    public String getAll() {
        String returnValue = "";
        if (amountNumbersStored == 0) return "";
        for (int i = 0; i < amountNumbersStored - 1; i++) {
            returnValue += puffer[i] + ", ";
        }
        returnValue += puffer[amountNumbersStored-1];
        return returnValue;
    }
}
