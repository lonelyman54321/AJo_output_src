/*
 * Decompiled with CFR 0.152.
 */
public final class zn2
extends Enum {
    private static final /* synthetic */ zn2[] $VALUES;
    public static final /* enum */ zn2 REQUEST;
    public static final /* enum */ zn2 RESPONSE;

    private static final /* synthetic */ zn2[] $values() {
        zn2 zn22 = REQUEST;
        zn22 = RESPONSE;
        zn2[] zn2Array = new zn2[]{zn22, zn22};
        return zn2Array;
    }

    static {
        zn2 zn22;
        REQUEST = zn22 = new zn2("REQUEST", 0);
        RESPONSE = zn22 = new zn2("RESPONSE", 1);
        $VALUES = zn2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zn2() {
        void var2_-1;
        void var1_-1;
    }

    public static zn2 valueOf(String string2) {
        return Enum.valueOf(zn2.class, string2);
    }

    public static zn2[] values() {
        return (zn2[])$VALUES.clone();
    }
}

