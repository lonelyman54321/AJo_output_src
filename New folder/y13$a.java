/*
 * Decompiled with CFR 0.152.
 */
public final class y13$a
extends Enum {
    private static final /* synthetic */ y13$a[] $VALUES;
    public static final /* enum */ y13$a INDIVIDUALLY;
    public static final /* enum */ y13$a SIMULTANEOUSLY;

    private static /* synthetic */ y13$a[] $values() {
        y13$a y13$a = SIMULTANEOUSLY;
        y13$a = INDIVIDUALLY;
        y13$a[] y13$aArray = new y13$a[]{y13$a, y13$a};
        return y13$aArray;
    }

    static {
        y13$a y13$a;
        SIMULTANEOUSLY = y13$a = new y13$a("SIMULTANEOUSLY", 0);
        INDIVIDUALLY = y13$a = new y13$a("INDIVIDUALLY", 1);
        $VALUES = y13$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private y13$a() {
        void var2_-1;
        void var1_-1;
    }

    public static y13$a forId(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) {
                return INDIVIDUALLY;
            }
            String string2 = hj0_0.a(n3, "Unknown trim path type ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        return SIMULTANEOUSLY;
    }

    public static y13$a valueOf(String string2) {
        return Enum.valueOf(y13$a.class, string2);
    }

    public static y13$a[] values() {
        return (y13$a[])$VALUES.clone();
    }
}

