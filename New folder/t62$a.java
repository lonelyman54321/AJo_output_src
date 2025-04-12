/*
 * Decompiled with CFR 0.152.
 */
public final class t62$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        cu_2 cu_22;
        int n7 = cu_2.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            cu_22 = cu_2.DROP;
            n4 = cu_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            cu_22 = cu_2.LATEST;
            n4 = cu_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            cu_22 = cu_2.MISSING;
            n4 = cu_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            cu_22 = cu_2.ERROR;
            n4 = cu_22.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

