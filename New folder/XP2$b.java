/*
 * Decompiled with CFR 0.152.
 */
public final class XP2$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        XP2$a xP2$a;
        int n7 = XP2$a.values().length;
        int[] nArray = new int[n7];
        try {
            xP2$a = XP2$a.PATH;
            n4 = xP2$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            xP2$a = XP2$a.QUERY;
            n4 = xP2$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

