/*
 * Decompiled with CFR 0.152.
 */
public final class fX0$b$d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        fX0$b$b fX0$b$b;
        int n7 = fX0$b$b.values().length;
        int[] nArray = new int[n7];
        try {
            fX0$b$b = fX0$b$b.ON_CONFIGURE;
            n4 = fX0$b$b.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fX0$b$b = fX0$b$b.ON_CREATE;
            n4 = fX0$b$b.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fX0$b$b = fX0$b$b.ON_UPGRADE;
            n4 = fX0$b$b.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fX0$b$b = fX0$b$b.ON_DOWNGRADE;
            n4 = fX0$b$b.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fX0$b$b = fX0$b$b.ON_OPEN;
            n4 = fX0$b$b.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

