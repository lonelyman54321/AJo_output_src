/*
 * Decompiled with CFR 0.152.
 */
public final class fg0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        hg0 hg02;
        int n7 = hg0.values().length;
        int[] nArray = new int[n7];
        try {
            hg02 = hg0.TEMPLATE;
            n4 = hg02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hg02 = hg0.FUNCTION;
            n4 = hg02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

