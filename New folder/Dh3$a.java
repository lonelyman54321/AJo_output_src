/*
 * Decompiled with CFR 0.152.
 */
public final class Dh3$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        lV1 lV12;
        int n7 = lV1.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            lV12 = lV1.NOT_REQUIRED;
            n4 = lV12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            lV12 = lV1.CONNECTED;
            n4 = lV12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            lV12 = lV1.UNMETERED;
            n4 = lV12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            lV12 = lV1.NOT_ROAMING;
            n4 = lV12.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            lV12 = lV1.METERED;
            n4 = lV12.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

