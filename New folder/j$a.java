/*
 * Decompiled with CFR 0.152.
 */
public final class j$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        yx2_0 yx2_02;
        int n7 = yx2_0.values().length;
        int[] nArray = new int[n7];
        try {
            yx2_02 = yx2_0.EXACT;
            n4 = yx2_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yx2_02 = yx2_0.INEXACT;
            n4 = yx2_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            yx2_02 = yx2_0.AUTOMATIC;
            n4 = yx2_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

