/*
 * Decompiled with CFR 0.152.
 */
public final class sp1$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        pp1$b pp1$b;
        int n7 = pp1$b.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            pp1$b = pp1$b.LUMA;
            n4 = pp1$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            pp1$b = pp1$b.LUMA_INVERTED;
            n4 = pp1$b.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

