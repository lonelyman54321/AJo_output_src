/*
 * Decompiled with CFR 0.152.
 */
public final class KL0$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ie0_0 ie0_02;
        int n7 = ie0_0.values().length;
        int[] nArray = new int[n7];
        try {
            ie0_02 = ie0_0.IMAGE;
            n4 = ie0_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ie0_02 = ie0_0.GIF;
            n4 = ie0_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ie0_02 = ie0_0.FILES;
            n4 = ie0_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

