/*
 * Decompiled with CFR 0.152.
 */
public final class W11$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        v50$a v50$a;
        int n7 = v50$a.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            v50$a = v50$a.LEFT;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.RIGHT;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.TOP;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.BOTTOM;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.BASELINE;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.CENTER;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.CENTER_X;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.CENTER_Y;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            v50$a = v50$a.NONE;
            n4 = v50$a.ordinal();
            nArray[n4] = n3 = 9;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

