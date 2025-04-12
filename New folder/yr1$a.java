/*
 * Decompiled with CFR 0.152.
 */
public final class yr1$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        et1_2 et1_22;
        int n7 = et1_2.values().length;
        int[] nArray = new int[n7];
        try {
            et1_22 = et1_2.SYNCHRONIZED;
            n4 = et1_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            et1_22 = et1_2.PUBLICATION;
            n4 = et1_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            et1_22 = et1_2.NONE;
            n4 = et1_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

