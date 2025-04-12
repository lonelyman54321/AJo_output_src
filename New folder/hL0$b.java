/*
 * Decompiled with CFR 0.152.
 */
public final class hL0$b
extends Enum {
    private static final /* synthetic */ hL0$b[] $VALUES;
    public static final /* enum */ hL0$b MAP;
    public static final /* enum */ hL0$b PACKED_VECTOR;
    public static final /* enum */ hL0$b SCALAR;
    public static final /* enum */ hL0$b VECTOR;
    private final boolean isList;

    static {
        hL0$b hL0$b;
        hL0$b hL0$b2;
        hL0$b hL0$b3;
        hL0$b hL0$b4;
        SCALAR = hL0$b4 = new hL0$b("SCALAR", 0, false);
        int n3 = 1;
        VECTOR = hL0$b3 = new hL0$b("VECTOR", n3, n3 != 0);
        int n4 = 2;
        PACKED_VECTOR = hL0$b2 = new hL0$b("PACKED_VECTOR", n4, n3 != 0);
        int n7 = 3;
        MAP = hL0$b = new hL0$b("MAP", n7, false);
        hL0$b[] hL0$bArray = new hL0$b[4];
        hL0$bArray[0] = hL0$b4;
        hL0$bArray[n3] = hL0$b3;
        hL0$bArray[n4] = hL0$b2;
        hL0$bArray[n7] = hL0$b;
        $VALUES = hL0$bArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hL0$b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.isList = var3_2;
    }

    public static hL0$b valueOf(String string2) {
        return Enum.valueOf(hL0$b.class, string2);
    }

    public static hL0$b[] values() {
        return (hL0$b[])$VALUES.clone();
    }

    public boolean isList() {
        return this.isList;
    }
}

