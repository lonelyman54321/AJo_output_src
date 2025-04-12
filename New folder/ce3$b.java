/*
 * Decompiled with CFR 0.152.
 */
public final class ce3$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        pj3_2 pj3_22;
        int n7 = pj3_2.values().length;
        int[] nArray = new int[n7];
        try {
            pj3_22 = pj3_2.LIST;
            n4 = pj3_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pj3_22 = pj3_2.MAP;
            n4 = pj3_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pj3_22 = pj3_2.POLY_OBJ;
            n4 = pj3_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pj3_22 = pj3_2.OBJ;
            n4 = pj3_22.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

