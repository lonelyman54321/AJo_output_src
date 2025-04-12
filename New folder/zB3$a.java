/*
 * Decompiled with CFR 0.152.
 */
public final class zB3$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        WF3$b wF3$b;
        int n7 = WF3$b.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            wF3$b = WF3$b.START;
            n4 = wF3$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wF3$b = WF3$b.END;
            n4 = wF3$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wF3$b = WF3$b.CENTER;
            n4 = wF3$b.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

