/*
 * Decompiled with CFR 0.152.
 */
public final class ri0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ri0[] $VALUES;
    public static final /* enum */ ri0 DISK;
    public static final /* enum */ ri0 MEMORY;
    public static final /* enum */ ri0 MEMORY_CACHE;
    public static final /* enum */ ri0 NETWORK;

    private static final /* synthetic */ ri0[] $values() {
        ri0 ri02 = MEMORY_CACHE;
        ri02 = MEMORY;
        ri02 = DISK;
        ri02 = NETWORK;
        ri0[] ri0Array = new ri0[]{ri02, ri02, ri02, ri02};
        return ri0Array;
    }

    static {
        Enum[] enumArray = new ri0("MEMORY_CACHE", 0);
        MEMORY_CACHE = enumArray;
        enumArray = new ri0("MEMORY", 1);
        MEMORY = enumArray;
        enumArray = new ri0("DISK", 2);
        DISK = enumArray;
        enumArray = new ri0("NETWORK", 3);
        NETWORK = enumArray;
        enumArray = ri0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ri0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ri0 valueOf(String string2) {
        return Enum.valueOf(ri0.class, string2);
    }

    public static ri0[] values() {
        return (ri0[])$VALUES.clone();
    }
}

