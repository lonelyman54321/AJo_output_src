/*
 * Decompiled with CFR 0.152.
 */
public final class yU0$a {
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
        int n7;
        int n8;
        int n10 = Ef0.values().length;
        int[] nArray = new int[n10];
        int n14 = 1;
        try {
            Ef0 ef0 = Ef0.None;
            n8 = ef0.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            Ef0 ef0 = Ef0.Redirected;
            n7 = ef0.ordinal();
            nArray[n7] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            Ef0 ef0 = Ef0.Cancelled;
            n4 = ef0.ordinal();
            nArray[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 4;
        try {
            enum_ = Ef0.RedirectCancelled;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n10 = uu0_1.values().length;
        nArray = new int[n10];
        try {
            enum_ = uu0_1.Active;
            n3 = enum_.ordinal();
            nArray[n3] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.Captured;
            n14 = uu0_12.ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.ActiveParent;
            n14 = uu0_12.ordinal();
            nArray[n14] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.Inactive;
            n14 = uu0_12.ordinal();
            nArray[n14] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
    }
}

