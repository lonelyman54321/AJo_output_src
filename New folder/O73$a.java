/*
 * Decompiled with CFR 0.152.
 */
public final class O73$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        E73 e73;
        int n7 = E73.values().length;
        int[] nArray = new int[n7];
        try {
            e73 = E73.Indefinite;
            n4 = e73.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e73 = E73.Long;
            n4 = e73.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            e73 = E73.Short;
            n4 = e73.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

