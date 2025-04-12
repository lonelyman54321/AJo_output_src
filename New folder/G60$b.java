/*
 * Decompiled with CFR 0.152.
 */
public final class G60$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        pg2_0 pg2_02;
        int n7 = pg2_0.values().length;
        int[] nArray = new int[n7];
        try {
            pg2_02 = pg2_0.Vertical;
            n4 = pg2_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            pg2_02 = pg2_0.Horizontal;
            n4 = pg2_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

