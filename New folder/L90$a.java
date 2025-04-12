/*
 * Decompiled with CFR 0.152.
 */
public final class L90$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        l90_0 l90_02;
        int n7 = l90_0.values().length;
        int[] nArray = new int[n7];
        try {
            l90_02 = l90_0.DEFAULT;
            n4 = l90_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            l90_02 = l90_0.ATOMIC;
            n4 = l90_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            l90_02 = l90_0.UNDISPATCHED;
            n4 = l90_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            l90_02 = l90_0.LAZY;
            n4 = l90_02.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

