/*
 * Decompiled with CFR 0.152.
 */
public final class ZW2
extends Enum {
    private static final /* synthetic */ ZW2[] $VALUES;
    public static final /* enum */ ZW2 Inherit;
    public static final /* enum */ ZW2 SecureOff;
    public static final /* enum */ ZW2 SecureOn;

    private static final /* synthetic */ ZW2[] $values() {
        ZW2 zW2 = Inherit;
        zW2 = SecureOn;
        zW2 = SecureOff;
        ZW2[] zW2Array = new ZW2[]{zW2, zW2, zW2};
        return zW2Array;
    }

    static {
        ZW2 zW2;
        Inherit = zW2 = new ZW2("Inherit", 0);
        SecureOn = zW2 = new ZW2("SecureOn", 1);
        SecureOff = zW2 = new ZW2("SecureOff", 2);
        $VALUES = ZW2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ZW2() {
        void var2_-1;
        void var1_-1;
    }

    public static ZW2 valueOf(String string2) {
        return Enum.valueOf(ZW2.class, string2);
    }

    public static ZW2[] values() {
        return (ZW2[])$VALUES.clone();
    }
}

