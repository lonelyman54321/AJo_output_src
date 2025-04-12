/*
 * Decompiled with CFR 0.152.
 */
public final class ZA3$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ZA3$a zA3$a;
        int n7 = ZA3$a.values().length;
        int[] nArray = new int[n7];
        try {
            zA3$a = ZA3$a.Impulse;
            n4 = zA3$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            zA3$a = ZA3$a.Lsq2;
            n4 = zA3$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

