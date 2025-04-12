/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from pi0
 */
public final class pi0_0
extends Enum {
    private static final /* synthetic */ pi0_0[] $VALUES;
    public static final /* enum */ pi0_0 DATA_DISK_CACHE;
    public static final /* enum */ pi0_0 LOCAL;
    public static final /* enum */ pi0_0 MEMORY_CACHE;
    public static final /* enum */ pi0_0 REMOTE;
    public static final /* enum */ pi0_0 RESOURCE_DISK_CACHE;

    private static /* synthetic */ pi0_0[] $values() {
        pi0_0 pi0_02 = LOCAL;
        pi0_02 = REMOTE;
        pi0_02 = DATA_DISK_CACHE;
        pi0_02 = RESOURCE_DISK_CACHE;
        pi0_02 = MEMORY_CACHE;
        pi0_0[] pi0_0Array = new pi0_0[]{pi0_02, pi0_02, pi0_02, pi0_02, pi0_02};
        return pi0_0Array;
    }

    static {
        pi0_0 pi0_02;
        LOCAL = pi0_02 = new pi0_0("LOCAL", 0);
        REMOTE = pi0_02 = new pi0_0("REMOTE", 1);
        DATA_DISK_CACHE = pi0_02 = new pi0_0("DATA_DISK_CACHE", 2);
        RESOURCE_DISK_CACHE = pi0_02 = new pi0_0("RESOURCE_DISK_CACHE", 3);
        MEMORY_CACHE = pi0_02 = new pi0_0("MEMORY_CACHE", 4);
        $VALUES = pi0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pi0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static pi0_0 valueOf(String string2) {
        return Enum.valueOf(pi0_0.class, string2);
    }

    public static pi0_0[] values() {
        return (pi0_0[])$VALUES.clone();
    }
}

