/*
 * Decompiled with CFR 0.152.
 */
public final class uB3$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Fb3$a fb3$a;
        int n7 = Fb3$a.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            fb3$a = Fb3$a.SPREAD;
            n4 = fb3$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$a = Fb3$a.SPREAD_INSIDE;
            n4 = fb3$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$a = Fb3$a.PACKED;
            n4 = fb3$a.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

