/*
 * Decompiled with CFR 0.152.
 */
public final class FD$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        hv1_1 hv1_12;
        int n7 = hv1_1.values().length;
        int[] nArray = new int[n7];
        try {
            hv1_12 = hv1_1.LOADING;
            n4 = hv1_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hv1_12 = hv1_1.PAGINATING;
            n4 = hv1_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hv1_12 = hv1_1.PAGINATION_EXHAUST;
            n4 = hv1_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hv1_12 = hv1_1.PAGINATION_ERROR;
            n4 = hv1_12.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hv1_12 = hv1_1.ERROR;
            n4 = hv1_12.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

