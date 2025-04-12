/*
 * Decompiled with CFR 0.152.
 */
public final class vl1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        yt2_2 yt2_22;
        int n7 = yt2_2.values().length;
        int[] nArray = new int[n7];
        try {
            yt2_22 = yt2_2.PLP;
            n4 = yt2_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yt2_22 = yt2_2.PDP;
            n4 = yt2_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yt2_22 = yt2_2.CART;
            n4 = yt2_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yt2_22 = yt2_2.WISHLIST;
            n4 = yt2_22.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yt2_22 = yt2_2.UNKNOWN;
            n4 = yt2_22.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

