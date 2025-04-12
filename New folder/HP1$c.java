/*
 * Decompiled with CFR 0.152.
 */
public final class HP1$c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        HP1$a hP1$a;
        int n7 = HP1$a.values().length;
        int[] nArray = new int[n7];
        try {
            hP1$a = HP1$a.MTML_APP_EVENT_PREDICTION;
            n4 = hP1$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            hP1$a = HP1$a.MTML_INTEGRITY_DETECT;
            n4 = hP1$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

