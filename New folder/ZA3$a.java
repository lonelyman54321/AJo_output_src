/*
 * Decompiled with CFR 0.152.
 */
public final class ZA3$a
extends Enum {
    private static final /* synthetic */ ZA3$a[] $VALUES;
    public static final /* enum */ ZA3$a Impulse;
    public static final /* enum */ ZA3$a Lsq2;

    private static final /* synthetic */ ZA3$a[] $values() {
        ZA3$a zA3$a = Lsq2;
        zA3$a = Impulse;
        ZA3$a[] zA3$aArray = new ZA3$a[]{zA3$a, zA3$a};
        return zA3$aArray;
    }

    static {
        ZA3$a zA3$a;
        Lsq2 = zA3$a = new ZA3$a("Lsq2", 0);
        Impulse = zA3$a = new ZA3$a("Impulse", 1);
        $VALUES = ZA3$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ZA3$a() {
        void var2_-1;
        void var1_-1;
    }

    public static ZA3$a valueOf(String string2) {
        return Enum.valueOf(ZA3$a.class, string2);
    }

    public static ZA3$a[] values() {
        return (ZA3$a[])$VALUES.clone();
    }
}

