/*
 * Decompiled with CFR 0.152.
 */
public final class vu1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        su1_2 su1_22;
        int n7 = su1_2.values().length;
        int[] nArray = new int[n7];
        try {
            su1_22 = su1_2.Session;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.Seconds;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.Minutes;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.Hours;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.Days;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.Weeks;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.Ever;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.OnEvery;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su1_22 = su1_2.OnExactly;
            n4 = su1_22.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

