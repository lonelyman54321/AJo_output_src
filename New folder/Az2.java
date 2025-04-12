/*
 * Decompiled with CFR 0.152.
 */
public final class Az2
extends Enum {
    private static final /* synthetic */ Az2[] $VALUES;
    public static final /* enum */ Az2 HIGH;
    public static final /* enum */ Az2 IMMEDIATE;
    public static final /* enum */ Az2 LOW;
    public static final /* enum */ Az2 NORMAL;

    private static /* synthetic */ Az2[] $values() {
        Az2 az2 = IMMEDIATE;
        az2 = HIGH;
        az2 = NORMAL;
        az2 = LOW;
        Az2[] az2Array = new Az2[]{az2, az2, az2, az2};
        return az2Array;
    }

    static {
        Az2 az2;
        IMMEDIATE = az2 = new Az2("IMMEDIATE", 0);
        HIGH = az2 = new Az2("HIGH", 1);
        NORMAL = az2 = new Az2("NORMAL", 2);
        LOW = az2 = new Az2("LOW", 3);
        $VALUES = Az2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Az2() {
        void var2_-1;
        void var1_-1;
    }

    public static Az2 valueOf(String string2) {
        return Enum.valueOf(Az2.class, string2);
    }

    public static Az2[] values() {
        return (Az2[])$VALUES.clone();
    }
}

