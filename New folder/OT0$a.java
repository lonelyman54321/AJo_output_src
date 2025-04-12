/*
 * Decompiled with CFR 0.152.
 */
public final class OT0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        uu0_1 uu0_12;
        int n7 = uu0_1.values().length;
        int[] nArray = new int[n7];
        try {
            uu0_12 = uu0_1.Active;
            n4 = uu0_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.ActiveParent;
            n4 = uu0_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.Captured;
            n4 = uu0_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            uu0_12 = uu0_1.Inactive;
            n4 = uu0_12.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

