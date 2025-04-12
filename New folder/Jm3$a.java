/*
 * Decompiled with CFR 0.152.
 */
public final class Jm3$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        qc1_2 qc1_22;
        int n7 = qc1_2.values().length;
        int[] nArray = new int[n7];
        try {
            qc1_22 = qc1_2.START;
            n4 = qc1_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            qc1_22 = qc1_2.TOP;
            n4 = qc1_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            qc1_22 = qc1_2.BOTTOM;
            n4 = qc1_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            qc1_22 = qc1_2.END;
            n4 = qc1_22.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

