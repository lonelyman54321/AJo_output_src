/*
 * Decompiled with CFR 0.152.
 */
public final class CB1$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        OB1 oB1;
        int n7 = OB1.values().length;
        int[] nArray = new int[n7];
        try {
            oB1 = OB1.OnIterationFinish;
            n4 = oB1.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            oB1 = OB1.Immediately;
            n4 = oB1.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

