/*
 * Decompiled with CFR 0.152.
 */
public final class cp$a$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        s80_0 s80_02;
        int n7 = s80_0.values().length;
        int[] nArray = new int[n7];
        try {
            s80_02 = s80_0.PARTIAL_REFUNDABLE;
            n4 = s80_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            s80_02 = s80_0.NON_REFUNDABLE;
            n4 = s80_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            s80_02 = s80_0.REFUNDABLE;
            n4 = s80_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

