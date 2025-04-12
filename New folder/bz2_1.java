/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZ2
 */
public final class bz2_1 {
    public static final int a;
    public static final gh3_2 b;
    public static final gh3_2 c;
    public static final gh3_2 d;
    public static final gh3_2 e;
    public static final int f;

    static {
        gh3_2 gh3_22;
        int n3 = 12;
        a = hh3_1.e(100, 0, 0, n3, "kotlinx.coroutines.semaphore.maxSpinCycles");
        b = gh3_22 = new gh3_2("PERMIT");
        c = gh3_22 = new gh3_2("TAKEN");
        d = gh3_22 = new gh3_2("BROKEN");
        e = gh3_22 = new gh3_2("CANCELLED");
        f = hh3_1.e(16, 0, 0, n3, "kotlinx.coroutines.semaphore.segmentSize");
    }
}

