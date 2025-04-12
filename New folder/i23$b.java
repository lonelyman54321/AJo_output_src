/*
 * Decompiled with CFR 0.152.
 */
public final class i23$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        he_2 he_22;
        int n7 = he_2.values().length;
        int[] nArray = new int[n7];
        try {
            he_22 = he_2.SUSPEND;
            n4 = he_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            he_22 = he_2.DROP_LATEST;
            n4 = he_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            he_22 = he_2.DROP_OLDEST;
            n4 = he_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

