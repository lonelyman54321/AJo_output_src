/*
 * Decompiled with CFR 0.152.
 */
public final class qZ2$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        zj3_0 zj3_02;
        int n7 = zj3_0.values().length;
        int[] nArray = new int[n7];
        try {
            zj3_02 = zj3_0.FULLY_COMPLETE;
            n4 = zj3_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            zj3_02 = zj3_0.SOURCE_COMPLETE;
            n4 = zj3_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

