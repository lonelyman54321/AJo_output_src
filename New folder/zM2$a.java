/*
 * Decompiled with CFR 0.152.
 */
public final class zM2$a
extends Enum {
    private static final /* synthetic */ zM2$a[] $VALUES;
    public static final /* enum */ zM2$a FOREVER;
    public static final /* enum */ zM2$a ONE_DAY;
    public static final /* enum */ zM2$a ONE_HOUR;
    public static final /* enum */ zM2$a ONE_WEEK;

    private static final /* synthetic */ zM2$a[] $values() {
        zM2$a zM2$a = ONE_HOUR;
        zM2$a = ONE_DAY;
        zM2$a = ONE_WEEK;
        zM2$a = FOREVER;
        zM2$a[] zM2$aArray = new zM2$a[]{zM2$a, zM2$a, zM2$a, zM2$a};
        return zM2$aArray;
    }

    static {
        zM2$a zM2$a;
        ONE_HOUR = zM2$a = new zM2$a("ONE_HOUR", 0);
        ONE_DAY = zM2$a = new zM2$a("ONE_DAY", 1);
        ONE_WEEK = zM2$a = new zM2$a("ONE_WEEK", 2);
        FOREVER = zM2$a = new zM2$a("FOREVER", 3);
        $VALUES = zM2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zM2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static zM2$a valueOf(String string2) {
        return Enum.valueOf(zM2$a.class, string2);
    }

    public static zM2$a[] values() {
        return (zM2$a[])$VALUES.clone();
    }
}

