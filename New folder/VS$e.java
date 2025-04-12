/*
 * Decompiled with CFR 0.152.
 */
public final class VS$e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ao3 ao32;
        int n7 = ao3.values().length;
        int[] nArray = new int[n7];
        try {
            ao32 = ao3.On;
            n4 = ao32.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ao32 = ao3.Off;
            n4 = ao32.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ao32 = ao3.Indeterminate;
            n4 = ao32.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

