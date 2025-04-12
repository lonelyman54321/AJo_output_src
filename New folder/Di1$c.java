/*
 * Decompiled with CFR 0.152.
 */
public final class Di1$c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Di1$b di1$b;
        int n7 = Di1$b.values().length;
        int[] nArray = new int[n7];
        try {
            di1$b = Di1$b.Analysis;
            n4 = di1$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            di1$b = Di1$b.AnrReport;
            n4 = di1$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            di1$b = Di1$b.CrashReport;
            n4 = di1$b.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            di1$b = Di1$b.CrashShield;
            n4 = di1$b.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            di1$b = Di1$b.ThreadCheck;
            n4 = di1$b.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

