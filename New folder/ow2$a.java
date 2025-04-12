/*
 * Decompiled with CFR 0.152.
 */
public final class ow2$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        su_1 su_12;
        int n7 = su_1.values().length;
        int[] nArray = new int[n7];
        try {
            su_12 = su_1.NONE;
            n4 = su_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su_12 = su_1.POLYMORPHIC;
            n4 = su_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            su_12 = su_1.ALL_JSON_OBJECTS;
            n4 = su_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

