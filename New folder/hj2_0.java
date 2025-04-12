/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Hj2
 */
public final class hj2_0 {
    public final boolean a;
    public final String b;
    public final boolean c;

    public hj2_0() {
        this(null, 15, false, false);
    }

    public hj2_0(String string2, int n3, boolean bl2, boolean bl3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            bl3 = false;
        }
        this.a = bl2;
        this.b = string2;
        this.c = bl3;
    }
}

