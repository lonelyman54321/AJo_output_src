/*
 * Decompiled with CFR 0.152.
 */
public final class cO1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        cO1 cO12;
        int n7 = cO1.values().length;
        int[] nArray = new int[n7];
        try {
            cO12 = cO1.Copy;
            n4 = cO12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            cO12 = cO1.Paste;
            n4 = cO12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            cO12 = cO1.Cut;
            n4 = cO12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            cO12 = cO1.SelectAll;
            n4 = cO12.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

