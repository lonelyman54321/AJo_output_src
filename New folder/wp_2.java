/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wp
 */
public final class wp_2
extends Enum {
    private static final /* synthetic */ wp_2[] $VALUES;
    public static final /* enum */ wp_2 ALIGN_ANCHOR;
    public static final /* enum */ wp_2 ALIGN_FIXED;

    private static final /* synthetic */ wp_2[] $values() {
        wp_2 wp_22 = ALIGN_ANCHOR;
        wp_22 = ALIGN_FIXED;
        wp_2[] wp_2Array = new wp_2[]{wp_22, wp_22};
        return wp_2Array;
    }

    static {
        wp_2 wp_22;
        ALIGN_ANCHOR = wp_22 = new wp_2("ALIGN_ANCHOR", 0);
        ALIGN_FIXED = wp_22 = new wp_2("ALIGN_FIXED", 1);
        $VALUES = wp_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wp_2() {
        void var2_-1;
        void var1_-1;
    }

    public static wp_2 valueOf(String string2) {
        return Enum.valueOf(wp_2.class, string2);
    }

    public static wp_2[] values() {
        return (wp_2[])$VALUES.clone();
    }
}

