/*
 * Decompiled with CFR 0.152.
 */
public final class DA3 {
    public static final mz0_2 a = mz0_2.a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(TX tX) {
        int n3 = tX instanceof ay_1;
        boolean bl2 = true;
        if (n3 != 0) {
            tX = (ay_1)tX;
            n3 = ((ay_1)tX).c;
            int n4 = 5;
            if ((n3 = (int)(zy_0.a(n3, n4) ? 1 : 0)) != 0) return bl2;
            int n7 = ((ay_1)tX).c;
            n3 = 3;
            if ((n7 = (int)(zy_0.a(n7, n3) ? 1 : 0)) == 0) return false;
            return bl2;
        } else if (tX != null) return false;
        return bl2;
    }
}

