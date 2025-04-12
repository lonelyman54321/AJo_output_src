/*
 * Decompiled with CFR 0.152.
 */
public final class Pl3$c {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Wr0$a wr0$a;
        int n7 = Wr0$a.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            wr0$a = Wr0$a.LEFT_ALIGN;
            n4 = wr0$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wr0$a = Wr0$a.RIGHT_ALIGN;
            n4 = wr0$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wr0$a = Wr0$a.CENTER;
            n4 = wr0$a.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

