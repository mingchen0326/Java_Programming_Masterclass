package scopeDemo;


public class X {
    private int x;
    public X() {
    }

    public void x() {
        for (int x=0; x<13; x++) {
            System.out.println("Times " + (x+1) + ": " + (x * this.x));
        }
    }
}
