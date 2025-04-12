/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xa1
 */
public final class xa1_2
extends hs2_2 {
    public static final ks2_2 f;
    public static final ks2_2 g;
    public static final ks2_2 h;
    public final boolean e;

    static {
        ks2_2 ks2_22;
        f = ks2_22 = new ks2_2("Before");
        g = ks2_22 = new ks2_2("State");
        h = ks2_22 = new ks2_2("After");
    }

    public xa1_2() {
        ks2_2 ks2_22;
        int n3 = 1;
        ks2_2[] ks2_2Array = new ks2_2[3];
        ks2_2Array[0] = ks2_22 = f;
        ks2_2Array[n3] = ks2_22 = g;
        ks2_2Array[2] = ks2_22 = h;
        super(ks2_2Array);
        this.e = n3;
    }

    public final boolean d() {
        return this.e;
    }
}

