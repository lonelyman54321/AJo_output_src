/*
 * Decompiled with CFR 0.152.
 */
public final class eA0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Xz0 xz0;
        int n7 = Xz0.values().length;
        int[] nArray = new int[n7];
        try {
            xz0 = Xz0.Visible;
            n4 = xz0.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xz0 = Xz0.PreEnter;
            n4 = xz0.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xz0 = Xz0.PostExit;
            n4 = xz0.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

