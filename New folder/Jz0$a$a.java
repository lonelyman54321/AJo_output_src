/*
 * Decompiled with CFR 0.152.
 */
public final class Jz0$a$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        FB0 fB0;
        int n7 = FB0.values().length;
        int[] nArray = new int[n7];
        try {
            fB0 = FB0.PUSH_NOTIFICATION_VIEWED;
            n4 = fB0.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fB0 = FB0.REGULAR;
            n4 = fB0.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fB0 = FB0.VARIABLES;
            n4 = fB0.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

