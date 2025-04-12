/*
 * Decompiled with CFR 0.152.
 */
public final class RB1 {
    public static final RB1 b;
    public final WC1 a;

    static {
        RB1 rB1;
        b = rB1 = new RB1();
    }

    public RB1() {
        WC1 wC1;
        this.a = wC1 = new WC1(20);
    }

    public final QB1 a(String string2) {
        if (string2 == null) {
            return null;
        }
        return (QB1)this.a.get(string2);
    }
}

