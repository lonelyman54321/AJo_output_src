/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aX2
 */
public final class ax2_0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ZW2 zW2;
        int n7 = ZW2.values().length;
        int[] nArray = new int[n7];
        try {
            zW2 = ZW2.SecureOff;
            n4 = zW2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            zW2 = ZW2.SecureOn;
            n4 = zW2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            zW2 = ZW2.Inherit;
            n4 = zW2.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

