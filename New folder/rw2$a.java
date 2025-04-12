/*
 * Decompiled with CFR 0.152.
 */
public final class rw2$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        sw2$a sw2$a;
        int n7 = sw2$a.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            sw2$a = sw2$a.STAR;
            n4 = sw2$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            sw2$a = sw2$a.POLYGON;
            n4 = sw2$a.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

