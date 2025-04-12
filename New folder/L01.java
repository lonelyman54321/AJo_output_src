/*
 * Decompiled with CFR 0.152.
 */
public final class L01
extends Enum {
    private static final /* synthetic */ L01[] $VALUES;
    public static final /* enum */ L01 LINEAR;
    public static final /* enum */ L01 RADIAL;

    private static /* synthetic */ L01[] $values() {
        L01 l01 = LINEAR;
        l01 = RADIAL;
        L01[] l01Array = new L01[]{l01, l01};
        return l01Array;
    }

    static {
        L01 l01;
        LINEAR = l01 = new L01("LINEAR", 0);
        RADIAL = l01 = new L01("RADIAL", 1);
        $VALUES = L01.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private L01() {
        void var2_-1;
        void var1_-1;
    }

    public static L01 valueOf(String string2) {
        return Enum.valueOf(L01.class, string2);
    }

    public static L01[] values() {
        return (L01[])$VALUES.clone();
    }
}

