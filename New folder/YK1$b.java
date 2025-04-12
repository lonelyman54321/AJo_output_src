/*
 * Decompiled with CFR 0.152.
 */
public final class YK1$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Xp1$d xp1$d;
        int n7 = Xp1$d.values().length;
        int[] nArray = new int[n7];
        try {
            xp1$d = Xp1$d.LookaheadMeasuring;
            n4 = xp1$d.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xp1$d = Xp1$d.Measuring;
            n4 = xp1$d.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xp1$d = Xp1$d.LookaheadLayingOut;
            n4 = xp1$d.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xp1$d = Xp1$d.LayingOut;
            n4 = xp1$d.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xp1$d = Xp1$d.Idle;
            n4 = xp1$d.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

