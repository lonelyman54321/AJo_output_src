/*
 * Decompiled with CFR 0.152.
 */
public final class Wn$e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        Enum enum_;
        int n4;
        int n7 = Wn$d.values().length;
        int[] nArray = new int[n7];
        int n8 = 1;
        try {
            Wn$d wn$d = Wn$d.ARRAY;
            n4 = wn$d.ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 2;
        try {
            enum_ = Wn$d.BOOL;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            int n10;
            enum_ = Wn$d.INT;
            n3 = enum_.ordinal();
            nArray[n3] = n10 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n7 = v80_0.values().length;
        nArray = new int[n7];
        try {
            enum_ = v80_0.APP_DATA;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = v80_0.USER_DATA;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
        n7 = rn_0.values().length;
        nArray = new int[n7];
        try {
            enum_ = rn_0.MOBILE_APP_INSTALL;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            rn_0 rn_02 = rn_0.CUSTOM;
            n8 = rn_02.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$2 = nArray;
    }
}

