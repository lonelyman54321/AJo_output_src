/*
 * Decompiled with CFR 0.152.
 */
public final class sT0$b$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        b33 b332;
        int n7 = b33.values().length;
        int[] nArray = new int[n7];
        try {
            b332 = b33.START;
            n4 = b332.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            b332 = b33.STOP;
            n4 = b332.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            b332 = b33.STOP_AND_RESET_REPLAY_CACHE;
            n4 = b332.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

