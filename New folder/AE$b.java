/*
 * Decompiled with CFR 0.152.
 */
public final class AE$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ye_0 ye_02;
        int n7 = ye_0.values().length;
        int[] nArray = new int[n7];
        try {
            ye_02 = ye_0.NOT_SHIPPED_YET_VIEW_HOLDER;
            n4 = ye_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ye_02 = ye_0.EXCHANGE_CONFIRM_FRAGMENT;
            n4 = ye_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

