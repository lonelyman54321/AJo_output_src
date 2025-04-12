/*
 * Decompiled with CFR 0.152.
 */
public final class ol3$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Yh1 yh1;
        int n7 = Yh1.values().length;
        int[] nArray = new int[n7];
        try {
            yh1 = Yh1.Focused;
            n4 = yh1.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yh1 = Yh1.UnfocusedEmpty;
            n4 = yh1.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yh1 = Yh1.UnfocusedNotEmpty;
            n4 = yh1.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

