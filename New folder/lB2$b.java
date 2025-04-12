/*
 * Decompiled with CFR 0.152.
 */
public final class lB2$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        lB2$a lB2$a;
        int n7 = lB2$a.values().length;
        int[] nArray = new int[n7];
        try {
            lB2$a = lB2$a.DOUBLE_NUMBER;
            n4 = lB2$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lB2$a = lB2$a.FLOAT_NUMBER;
            n4 = lB2$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

