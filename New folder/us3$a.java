/*
 * Decompiled with CFR 0.152.
 */
public final class us3$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ss3_0 ss3_02;
        int n7 = ss3_0.values().length;
        int[] nArray = new int[n7];
        try {
            ss3_02 = ss3_0.Set;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.LessThan;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.GreaterThan;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.Equals;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.NotEquals;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.Between;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.Contains;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.NotContains;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ss3_02 = ss3_0.NotSet;
            n4 = ss3_02.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

