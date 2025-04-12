/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xm1$a
 */
public final class xm1$a_0 {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Gm1$b gm1$b;
        int n7 = Gm1$b.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            gm1$b = Gm1$b.NUMBER;
            n4 = gm1$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            gm1$b = Gm1$b.BEGIN_ARRAY;
            n4 = gm1$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            gm1$b = Gm1$b.BEGIN_OBJECT;
            n4 = gm1$b.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

