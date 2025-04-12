/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aY
 */
public final class ay_0 {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int e;

    static {
        long l2 = 3;
        int n3 = 32;
        long l3 = l2 << n3;
        long l4 = 0;
        long l7 = 0xFFFFFFFFL;
        a = l4 & l7 | l3;
        b = (long)1 & l7 | l3;
        l4 = (long)2 & l7;
        c = l3 | l4;
        long l8 = (long)4 << n3;
        d = l2 & l7 | l8;
    }

    public static final boolean a(long l2, long l3) {
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        boolean bl2 = object == false;
        return bl2;
    }

    public static String b(long l2) {
        boolean bl2;
        long l3 = a;
        boolean bl3 = ay_0.a(l2, l3);
        String string2 = bl3 ? "Rgb" : ((bl3 = ay_0.a(l2, l3 = b)) ? "Xyz" : ((bl3 = ay_0.a(l2, l3 = c)) ? "Lab" : ((bl2 = ay_0.a(l2, l3 = d)) ? "Cmyk" : "Unknown")));
        return string2;
    }
}

