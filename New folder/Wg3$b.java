/*
 * Decompiled with CFR 0.152.
 */
public final class Wg3$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Nv2 nv2;
        int n7 = Nv2.values().length;
        int[] nArray = new int[n7];
        try {
            nv2 = Nv2.Initial;
            n4 = nv2.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nv2 = Nv2.Final;
            n4 = nv2.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nv2 = Nv2.Main;
            n4 = nv2.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

