/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from RB3
 */
public final class rb3_1
extends Enum {
    private static final /* synthetic */ rb3_1[] $VALUES;
    public static final /* enum */ rb3_1 EXOPLAYER;
    public static final /* enum */ rb3_1 MEDIA3;
    public static final /* enum */ rb3_1 NONE;

    private static final /* synthetic */ rb3_1[] $values() {
        rb3_1 rb3_12 = EXOPLAYER;
        rb3_12 = MEDIA3;
        rb3_12 = NONE;
        rb3_1[] rb3_1Array = new rb3_1[]{rb3_12, rb3_12, rb3_12};
        return rb3_1Array;
    }

    static {
        rb3_1 rb3_12;
        EXOPLAYER = rb3_12 = new rb3_1("EXOPLAYER", 0);
        MEDIA3 = rb3_12 = new rb3_1("MEDIA3", 1);
        NONE = rb3_12 = new rb3_1("NONE", 2);
        $VALUES = rb3_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rb3_1() {
        void var2_-1;
        void var1_-1;
    }

    public static rb3_1 valueOf(String string2) {
        return Enum.valueOf(rb3_1.class, string2);
    }

    public static rb3_1[] values() {
        return (rb3_1[])$VALUES.clone();
    }
}

