/*
 * Decompiled with CFR 0.152.
 */
public final class G50$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Fb3$b fb3$b;
        int n7 = Fb3$b.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            fb3$b = Fb3$b.LEFT_TO_LEFT;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.LEFT_TO_RIGHT;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.RIGHT_TO_LEFT;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.RIGHT_TO_RIGHT;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.START_TO_START;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.START_TO_END;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.END_TO_START;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.END_TO_END;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.TOP_TO_TOP;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.TOP_TO_BOTTOM;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.TOP_TO_BASELINE;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.BOTTOM_TO_TOP;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.BOTTOM_TO_BOTTOM;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.BOTTOM_TO_BASELINE;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.BASELINE_TO_BOTTOM;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.BASELINE_TO_TOP;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.BASELINE_TO_BASELINE;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.CIRCULAR_CONSTRAINT;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.CENTER_HORIZONTALLY;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            fb3$b = Fb3$b.CENTER_VERTICALLY;
            n4 = fb3$b.ordinal();
            nArray[n4] = n3 = 20;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

