/*
 * Decompiled with CFR 0.152.
 */
public final class v61$c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Rv1 rv1;
        int n7 = Rv1.values().length;
        int[] nArray = new int[n7];
        try {
            rv1 = Rv1.PREPEND;
            n4 = rv1.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            rv1 = Rv1.APPEND;
            n4 = rv1.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

