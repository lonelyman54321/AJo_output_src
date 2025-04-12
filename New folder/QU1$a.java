/*
 * Decompiled with CFR 0.152.
 */
public final class QU1$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        pL0 pL02;
        int n7 = pL0.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            pL02 = pL0.ZIP;
            n4 = pL02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            pL02 = pL0.GZIP;
            n4 = pL02.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

