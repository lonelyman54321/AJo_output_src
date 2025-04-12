/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from kX$a
 */
public final class kx$a_0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ri0 ri02;
        int n7 = ri0.values().length;
        int[] nArray = new int[n7];
        try {
            ri02 = ri0.NETWORK;
            n4 = ri02.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ri02 = ri0.MEMORY;
            n4 = ri02.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ri02 = ri0.MEMORY_CACHE;
            n4 = ri02.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ri02 = ri0.DISK;
            n4 = ri02.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

