/*
 * Decompiled with CFR 0.152.
 */
public final class a21$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        a21$a a21$a;
        int n7 = a21$a.values().length;
        int[] nArray = new int[n7];
        try {
            a21$a = a21$a.CANCEL_INIT;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.CANCELLATION_DETAIL;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.ORDER_DETAIL;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.RETURN_CREATED;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.RETURN_REQUESTED;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.RETURN_INIT;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.MSG_QUANTITY_CHANGE;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a21$a = a21$a.RETURN_REFUND;
            n4 = a21$a.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

