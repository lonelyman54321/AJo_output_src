/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Vu
 */
public final class vu_2
extends Enum {
    private static final /* synthetic */ vu_2[] $VALUES;
    public static final /* enum */ vu_2 CIRCULAR;
    public static final /* enum */ vu_2 ELASTIC;
    public static final /* enum */ vu_2 FADE;
    public static final /* enum */ vu_2 NONE;
    public static final /* enum */ vu_2 OVERSHOOT;

    private static final /* synthetic */ vu_2[] $values() {
        vu_2 vu_22 = NONE;
        vu_22 = ELASTIC;
        vu_22 = FADE;
        vu_22 = CIRCULAR;
        vu_22 = OVERSHOOT;
        vu_2[] vu_2Array = new vu_2[]{vu_22, vu_22, vu_22, vu_22, vu_22};
        return vu_2Array;
    }

    static {
        vu_2 vu_22;
        NONE = vu_22 = new vu_2("NONE", 0);
        ELASTIC = vu_22 = new vu_2("ELASTIC", 1);
        FADE = vu_22 = new vu_2("FADE", 2);
        CIRCULAR = vu_22 = new vu_2("CIRCULAR", 3);
        OVERSHOOT = vu_22 = new vu_2("OVERSHOOT", 4);
        $VALUES = vu_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private vu_2() {
        void var2_-1;
        void var1_-1;
    }

    public static vu_2 valueOf(String string2) {
        return Enum.valueOf(vu_2.class, string2);
    }

    public static vu_2[] values() {
        return (vu_2[])$VALUES.clone();
    }
}

