/*
 * Decompiled with CFR 0.152.
 */
public final class uQ2$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        WX0 wX0;
        int n7 = WX0.values().length;
        int[] nArray = new int[n7];
        try {
            wX0 = WX0.SUBMIT;
            n4 = wX0.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            wX0 = WX0.DIALOG_LOAD;
            n4 = wX0.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            wX0 = WX0.SUCCESS_DIALOG_LOAD;
            n4 = wX0.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            wX0 = WX0.CLOSE_DIALOG;
            n4 = wX0.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

