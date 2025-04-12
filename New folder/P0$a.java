/*
 * Decompiled with CFR 0.152.
 */
public final class P0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        hb3_1 hb3_12;
        int n7 = hb3_1.values().length;
        int[] nArray = new int[n7];
        try {
            hb3_12 = hb3_1.Done;
            n4 = hb3_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hb3_12 = hb3_1.Ready;
            n4 = hb3_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

