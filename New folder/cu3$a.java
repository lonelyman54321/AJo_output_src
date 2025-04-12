/*
 * Decompiled with CFR 0.152.
 */
public final class cu3$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        hj_1 hj_12;
        int n7 = hj_1.values().length;
        int[] nArray = new int[n7];
        try {
            hj_12 = hj_1.SAVED_UPI;
            n4 = hj_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hj_12 = hj_1.INTENT_UPI;
            n4 = hj_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

