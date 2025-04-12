/*
 * Decompiled with CFR 0.152.
 */
public final class ni$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        gn2$a gn2$a;
        int n7 = gn2$a.values().length;
        int[] nArray = new int[n7];
        try {
            gn2$a = gn2$a.CounterClockwise;
            n4 = gn2$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            gn2$a = gn2$a.Clockwise;
            n4 = gn2$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

