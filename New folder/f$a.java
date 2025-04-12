/*
 * Decompiled with CFR 0.152.
 */
public final class f$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        Enum enum_;
        int n4;
        int n7 = Ms2.values().length;
        int[] nArray = new int[n7];
        int n8 = 1;
        try {
            Ms2 ms2 = Ms2.UNCHANGED;
            n4 = ms2.ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 2;
        try {
            enum_ = Ms2.TRANSLUCENT;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            int n10;
            enum_ = Ms2.OPAQUE;
            n3 = enum_.ordinal();
            nArray[n3] = n10 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n7 = WS2.values().length;
        nArray = new int[n7];
        try {
            enum_ = WS2.FILL;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            WS2 wS2 = WS2.FIT;
            n8 = wS2.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
    }
}

