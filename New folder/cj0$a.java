/*
 * Decompiled with CFR 0.152.
 */
public final class cj0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        WS2 wS2;
        int n7 = WS2.values().length;
        int[] nArray = new int[n7];
        try {
            wS2 = WS2.FILL;
            n4 = wS2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            wS2 = WS2.FIT;
            n4 = wS2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

