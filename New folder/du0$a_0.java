/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from du0$a
 */
public final class du0$a_0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        bp1_0 bp1_02;
        int n7 = bp1_0.values().length;
        int[] nArray = new int[n7];
        try {
            bp1_02 = bp1_0.Ltr;
            n4 = bp1_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bp1_02 = bp1_0.Rtl;
            n4 = bp1_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

