/*
 * Decompiled with CFR 0.152.
 */
public final class sw2$a
extends Enum {
    private static final /* synthetic */ sw2$a[] $VALUES;
    public static final /* enum */ sw2$a POLYGON;
    public static final /* enum */ sw2$a STAR;
    private final int value;

    private static /* synthetic */ sw2$a[] $values() {
        sw2$a sw2$a = STAR;
        sw2$a = POLYGON;
        sw2$a[] sw2$aArray = new sw2$a[]{sw2$a, sw2$a};
        return sw2$aArray;
    }

    static {
        sw2$a sw2$a;
        int n3 = 1;
        STAR = sw2$a = new sw2$a("STAR", 0, n3);
        POLYGON = sw2$a = new sw2$a("POLYGON", n3, 2);
        $VALUES = sw2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private sw2$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static sw2$a forValue(int n3) {
        for (sw2$a sw2$a : sw2$a.values()) {
            int n4 = sw2$a.value;
            if (n4 != n3) continue;
            return sw2$a;
        }
        return null;
    }

    public static sw2$a valueOf(String string2) {
        return Enum.valueOf(sw2$a.class, string2);
    }

    public static sw2$a[] values() {
        return (sw2$a[])$VALUES.clone();
    }
}

