/*
 * Decompiled with CFR 0.152.
 */
public final class ss0$g
extends Enum {
    private static final /* synthetic */ ss0$g[] $VALUES;
    public static final /* enum */ ss0$g MEMORY;
    public static final /* enum */ ss0$g QUALITY;

    private static /* synthetic */ ss0$g[] $values() {
        ss0$g ss0$g = MEMORY;
        ss0$g = QUALITY;
        ss0$g[] ss0$gArray = new ss0$g[]{ss0$g, ss0$g};
        return ss0$gArray;
    }

    static {
        ss0$g ss0$g;
        MEMORY = ss0$g = new ss0$g("MEMORY", 0);
        QUALITY = ss0$g = new ss0$g("QUALITY", 1);
        $VALUES = ss0$g.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ss0$g() {
        void var2_-1;
        void var1_-1;
    }

    public static ss0$g valueOf(String string2) {
        return Enum.valueOf(ss0$g.class, string2);
    }

    public static ss0$g[] values() {
        return (ss0$g[])$VALUES.clone();
    }
}

