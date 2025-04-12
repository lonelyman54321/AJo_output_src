/*
 * Decompiled with CFR 0.152.
 */
public final class AI$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AI$f aI$f;
        int n7 = AI$f.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            aI$f = AI$f.INIT;
            n4 = aI$f.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            aI$f = AI$f.FETCHED;
            n4 = aI$f.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            aI$f = AI$f.ACTIVATED;
            n4 = aI$f.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

