/*
 * Decompiled with CFR 0.152.
 */
public final class lk3$a$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        pl3 pl32;
        int n7 = pl3.values().length;
        int[] nArray = new int[n7];
        try {
            pl32 = pl3.Filled;
            n4 = pl32.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pl32 = pl3.Outlined;
            n4 = pl32.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

