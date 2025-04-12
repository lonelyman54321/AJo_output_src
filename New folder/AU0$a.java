/*
 * Decompiled with CFR 0.152.
 */
public final class AU0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        uu0_1 uu0_12;
        int n3;
        Enum enum_;
        int n4;
        int n7 = bp1_0.values().length;
        int[] nArray = new int[n7];
        int n8 = 1;
        try {
            bp1_0 bp1_02 = bp1_0.Ltr;
            n4 = bp1_02.ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 2;
        try {
            enum_ = bp1_0.Rtl;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n7 = uu0_1.values().length;
        nArray = new int[n7];
        try {
            enum_ = uu0_1.Active;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.ActiveParent;
            n8 = uu0_12.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.Captured;
            n8 = uu0_12.ordinal();
            nArray[n8] = n4 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.Inactive;
            n8 = uu0_12.ordinal();
            nArray[n8] = n4 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
    }
}

