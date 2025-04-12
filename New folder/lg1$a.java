/*
 * Decompiled with CFR 0.152.
 */
public final class lg1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ng1$a ng1$a;
        int n7 = ng1$a.values().length;
        int[] nArray = new int[n7];
        try {
            ng1$a = ng1$a.NONE;
            n4 = ng1$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ng1$a = ng1$a.V1;
            n4 = ng1$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ng1$a = ng1$a.V2_V4;
            n4 = ng1$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ng1$a = ng1$a.V5_V7;
            n4 = ng1$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

