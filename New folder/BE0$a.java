/*
 * Decompiled with CFR 0.152.
 */
public final class BE0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        yE0 yE02;
        int n7 = yE0.values().length;
        int[] nArray = new int[n7];
        try {
            yE02 = yE0.RESPECT_PERFORMANCE;
            n4 = yE02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yE02 = yE0.IGNORE;
            n4 = yE02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yE02 = yE0.RESPECT_ALL;
            n4 = yE02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

