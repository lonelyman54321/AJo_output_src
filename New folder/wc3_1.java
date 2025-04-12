/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wc3
 */
public final class wc3_1 {
    public static final wc3_1 c;
    public final zp1 a;
    public final Tl3 b;

    static {
        wc3_1 wc3_12;
        c = wc3_12 = new wc3_1(null, null);
    }

    public wc3_1(zp1 zp12, Tl3 tl3) {
        this.a = zp12;
        this.b = tl3;
    }

    public static wc3_1 a(wc3_1 wc3_12, w32_0 zp12, Tl3 tl3, int n3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            zp12 = wc3_12.a;
        }
        if ((n3 &= 2) != 0) {
            tl3 = wc3_12.b;
        }
        wc3_12.getClass();
        wc3_12 = new wc3_1(zp12, tl3);
        return wc3_12;
    }
}

