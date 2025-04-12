/*
 * Decompiled with CFR 0.152.
 */
public final class gi$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        uk2_0 uk2_02;
        int n7 = uk2_0.values().length;
        int[] nArray = new int[n7];
        try {
            uk2_02 = uk2_0.Ltr;
            n4 = uk2_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uk2_02 = uk2_0.Rtl;
            n4 = uk2_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

