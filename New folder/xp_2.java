/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xp
 */
public final class xp_2
extends Enum {
    private static final /* synthetic */ xp_2[] $VALUES;
    public static final /* enum */ xp_2 ALIGN_ANCHOR;
    public static final /* enum */ xp_2 ALIGN_BALLOON;

    private static final /* synthetic */ xp_2[] $values() {
        xp_2 xp_22 = ALIGN_BALLOON;
        xp_22 = ALIGN_ANCHOR;
        xp_2[] xp_2Array = new xp_2[]{xp_22, xp_22};
        return xp_2Array;
    }

    static {
        xp_2 xp_22;
        ALIGN_BALLOON = xp_22 = new xp_2("ALIGN_BALLOON", 0);
        ALIGN_ANCHOR = xp_22 = new xp_2("ALIGN_ANCHOR", 1);
        $VALUES = xp_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xp_2() {
        void var2_-1;
        void var1_-1;
    }

    public static xp_2 valueOf(String string2) {
        return Enum.valueOf(xp_2.class, string2);
    }

    public static xp_2[] values() {
        return (xp_2[])$VALUES.clone();
    }
}

