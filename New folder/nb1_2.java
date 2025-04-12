/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from nb1
 */
public final class nb1_2
extends hs2_2 {
    public static final ks2_2 f;
    public static final ks2_2 g;
    public static final ks2_2 h;
    public static final ks2_2 i;
    public static final ks2_2 j;
    public final boolean e;

    static {
        ks2_2 ks2_22;
        f = ks2_22 = new ks2_2("Receive");
        g = ks2_22 = new ks2_2("Parse");
        h = ks2_22 = new ks2_2("Transform");
        i = ks2_22 = new ks2_2("State");
        j = ks2_22 = new ks2_2("After");
    }

    public nb1_2() {
        ks2_2 ks2_22;
        int n3 = 1;
        ks2_2[] ks2_2Array = new ks2_2[5];
        ks2_2Array[0] = ks2_22 = f;
        ks2_2Array[n3] = ks2_22 = g;
        ks2_2Array[2] = ks2_22 = h;
        ks2_2Array[3] = ks2_22 = i;
        ks2_2Array[4] = ks2_22 = j;
        super(ks2_2Array);
        this.e = n3;
    }

    public final boolean d() {
        return this.e;
    }
}

