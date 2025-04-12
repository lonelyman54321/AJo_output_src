/*
 * Decompiled with CFR 0.152.
 */
public final class Mv$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Fb3$c fb3$c;
        int n7 = Fb3$c.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            fb3$c = Fb3$c.LEFT;
            n4 = fb3$c.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$c = Fb3$c.START;
            n4 = fb3$c.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$c = Fb3$c.RIGHT;
            n4 = fb3$c.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$c = Fb3$c.END;
            n4 = fb3$c.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$c = Fb3$c.TOP;
            n4 = fb3$c.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$c = Fb3$c.BOTTOM;
            n4 = fb3$c.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

