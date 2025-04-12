/*
 * Decompiled with CFR 0.152.
 */
public final class Fb3$b
extends Enum {
    private static final /* synthetic */ Fb3$b[] $VALUES;
    public static final /* enum */ Fb3$b BASELINE_TO_BASELINE;
    public static final /* enum */ Fb3$b BASELINE_TO_BOTTOM;
    public static final /* enum */ Fb3$b BASELINE_TO_TOP;
    public static final /* enum */ Fb3$b BOTTOM_TO_BASELINE;
    public static final /* enum */ Fb3$b BOTTOM_TO_BOTTOM;
    public static final /* enum */ Fb3$b BOTTOM_TO_TOP;
    public static final /* enum */ Fb3$b CENTER_HORIZONTALLY;
    public static final /* enum */ Fb3$b CENTER_VERTICALLY;
    public static final /* enum */ Fb3$b CIRCULAR_CONSTRAINT;
    public static final /* enum */ Fb3$b END_TO_END;
    public static final /* enum */ Fb3$b END_TO_START;
    public static final /* enum */ Fb3$b LEFT_TO_LEFT;
    public static final /* enum */ Fb3$b LEFT_TO_RIGHT;
    public static final /* enum */ Fb3$b RIGHT_TO_LEFT;
    public static final /* enum */ Fb3$b RIGHT_TO_RIGHT;
    public static final /* enum */ Fb3$b START_TO_END;
    public static final /* enum */ Fb3$b START_TO_START;
    public static final /* enum */ Fb3$b TOP_TO_BASELINE;
    public static final /* enum */ Fb3$b TOP_TO_BOTTOM;
    public static final /* enum */ Fb3$b TOP_TO_TOP;

    private static /* synthetic */ Fb3$b[] $values() {
        Fb3$b fb3$b = LEFT_TO_LEFT;
        fb3$b = LEFT_TO_RIGHT;
        fb3$b = RIGHT_TO_LEFT;
        fb3$b = RIGHT_TO_RIGHT;
        fb3$b = START_TO_START;
        fb3$b = START_TO_END;
        fb3$b = END_TO_START;
        fb3$b = END_TO_END;
        fb3$b = TOP_TO_TOP;
        fb3$b = TOP_TO_BOTTOM;
        fb3$b = TOP_TO_BASELINE;
        fb3$b = BOTTOM_TO_TOP;
        fb3$b = BOTTOM_TO_BOTTOM;
        fb3$b = BOTTOM_TO_BASELINE;
        fb3$b = BASELINE_TO_BASELINE;
        fb3$b = BASELINE_TO_TOP;
        fb3$b = BASELINE_TO_BOTTOM;
        fb3$b = CENTER_HORIZONTALLY;
        fb3$b = CENTER_VERTICALLY;
        fb3$b = CIRCULAR_CONSTRAINT;
        Fb3$b[] fb3$bArray = new Fb3$b[]{fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b, fb3$b};
        return fb3$bArray;
    }

    static {
        Fb3$b fb3$b;
        LEFT_TO_LEFT = fb3$b = new Fb3$b("LEFT_TO_LEFT", 0);
        LEFT_TO_RIGHT = fb3$b = new Fb3$b("LEFT_TO_RIGHT", 1);
        RIGHT_TO_LEFT = fb3$b = new Fb3$b("RIGHT_TO_LEFT", 2);
        RIGHT_TO_RIGHT = fb3$b = new Fb3$b("RIGHT_TO_RIGHT", 3);
        START_TO_START = fb3$b = new Fb3$b("START_TO_START", 4);
        START_TO_END = fb3$b = new Fb3$b("START_TO_END", 5);
        END_TO_START = fb3$b = new Fb3$b("END_TO_START", 6);
        END_TO_END = fb3$b = new Fb3$b("END_TO_END", 7);
        TOP_TO_TOP = fb3$b = new Fb3$b("TOP_TO_TOP", 8);
        TOP_TO_BOTTOM = fb3$b = new Fb3$b("TOP_TO_BOTTOM", 9);
        TOP_TO_BASELINE = fb3$b = new Fb3$b("TOP_TO_BASELINE", 10);
        BOTTOM_TO_TOP = fb3$b = new Fb3$b("BOTTOM_TO_TOP", 11);
        BOTTOM_TO_BOTTOM = fb3$b = new Fb3$b("BOTTOM_TO_BOTTOM", 12);
        BOTTOM_TO_BASELINE = fb3$b = new Fb3$b("BOTTOM_TO_BASELINE", 13);
        BASELINE_TO_BASELINE = fb3$b = new Fb3$b("BASELINE_TO_BASELINE", 14);
        BASELINE_TO_TOP = fb3$b = new Fb3$b("BASELINE_TO_TOP", 15);
        BASELINE_TO_BOTTOM = fb3$b = new Fb3$b("BASELINE_TO_BOTTOM", 16);
        CENTER_HORIZONTALLY = fb3$b = new Fb3$b("CENTER_HORIZONTALLY", 17);
        CENTER_VERTICALLY = fb3$b = new Fb3$b("CENTER_VERTICALLY", 18);
        CIRCULAR_CONSTRAINT = fb3$b = new Fb3$b("CIRCULAR_CONSTRAINT", 19);
        $VALUES = Fb3$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Fb3$b() {
        void var2_-1;
        void var1_-1;
    }

    public static Fb3$b valueOf(String string2) {
        return Enum.valueOf(Fb3$b.class, string2);
    }

    public static Fb3$b[] values() {
        return (Fb3$b[])$VALUES.clone();
    }
}

