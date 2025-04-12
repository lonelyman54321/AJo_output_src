/*
 * Decompiled with CFR 0.152.
 */
public final class FV0$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        vz3_0 vz3_02;
        int n7 = vz3_0.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            vz3_02 = vz3_0.BASICVALIDATOR;
            n4 = vz3_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vz3_02 = vz3_0.UNIQUEVALIDATOR;
            n4 = vz3_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vz3_02 = vz3_0.TEXTINPUTLAYOUTVALIDATOR;
            n4 = vz3_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vz3_02 = vz3_0.TEXTVIEWVALIDATOR;
            n4 = vz3_02.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            vz3_02 = vz3_0.TEXTINPUTLAYOUTVALIDATORREVAMP;
            n4 = vz3_02.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

