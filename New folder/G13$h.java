/*
 * Decompiled with CFR 0.152.
 */
public final class G13$h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        G13$d g13$d;
        int n7 = G13$d.values().length;
        int[] nArray = new int[n7];
        try {
            g13$d = G13$d.AUTOMATIC;
            n4 = g13$d.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            g13$d = G13$d.WEB;
            n4 = g13$d.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            g13$d = G13$d.NATIVE;
            n4 = g13$d.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

