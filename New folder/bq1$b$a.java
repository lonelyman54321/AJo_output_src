/*
 * Decompiled with CFR 0.152.
 */
public final class bq1$b$a {
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
        int n7 = Xp1$d.values().length;
        int[] nArray = new int[n7];
        int n8 = 1;
        try {
            Xp1$d xp1$d = Xp1$d.Measuring;
            n4 = xp1$d.ordinal();
            nArray[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 2;
        try {
            enum_ = Xp1$d.LayingOut;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n7 = Xp1$f.values().length;
        nArray = new int[n7];
        try {
            enum_ = Xp1$f.InMeasureBlock;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            Xp1$f xp1$f = Xp1$f.InLayoutBlock;
            n8 = xp1$f.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
    }
}

