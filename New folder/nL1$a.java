/*
 * Decompiled with CFR 0.152.
 */
public final class nL1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Y50$b y50$b;
        int n7 = Y50$b.values().length;
        int[] nArray = new int[n7];
        try {
            y50$b = Y50$b.FIXED;
            n4 = y50$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            y50$b = Y50$b.WRAP_CONTENT;
            n4 = y50$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            y50$b = Y50$b.MATCH_CONSTRAINT;
            n4 = y50$b.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            y50$b = Y50$b.MATCH_PARENT;
            n4 = y50$b.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

