/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from qm1
 */
public final class qm1_1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        bj0_2 bj0_22;
        int n7 = bj0_2.values().length;
        int[] nArray = new int[n7];
        try {
            bj0_22 = bj0_2.WHITESPACE_SEPARATED;
            n4 = bj0_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bj0_22 = bj0_2.ARRAY_WRAPPED;
            n4 = bj0_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bj0_22 = bj0_2.AUTO_DETECT;
            n4 = bj0_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

