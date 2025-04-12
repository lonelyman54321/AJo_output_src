/*
 * Decompiled with CFR 0.152.
 */
public final class Er2$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        kl_2 kl_22;
        int n7 = kl_2.values().length;
        int[] nArray = new int[n7];
        try {
            kl_22 = kl_2.NONE;
            n4 = kl_22.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kl_22 = kl_2.VISA_CARD;
            n4 = kl_22.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kl_22 = kl_2.MASTER_CARD;
            n4 = kl_22.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kl_22 = kl_2.DISCOVER_CARD;
            n4 = kl_22.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kl_22 = kl_2.AMEX_CARD;
            n4 = kl_22.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

