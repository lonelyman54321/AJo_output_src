/*
 * Decompiled with CFR 0.152.
 */
public final class yC1$b
extends Enum {
    private static final /* synthetic */ yC1$b[] $VALUES;
    public static final /* enum */ yC1$b NONE;
    public static final /* enum */ yC1$b PLAY;
    public static final /* enum */ yC1$b RESUME;

    private static /* synthetic */ yC1$b[] $values() {
        yC1$b yC1$b = NONE;
        yC1$b = PLAY;
        yC1$b = RESUME;
        yC1$b[] yC1$bArray = new yC1$b[]{yC1$b, yC1$b, yC1$b};
        return yC1$bArray;
    }

    static {
        yC1$b yC1$b;
        NONE = yC1$b = new yC1$b("NONE", 0);
        PLAY = yC1$b = new yC1$b("PLAY", 1);
        RESUME = yC1$b = new yC1$b("RESUME", 2);
        $VALUES = yC1$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private yC1$b() {
        void var2_-1;
        void var1_-1;
    }

    public static yC1$b valueOf(String string2) {
        return Enum.valueOf(yC1$b.class, string2);
    }

    public static yC1$b[] values() {
        return (yC1$b[])$VALUES.clone();
    }
}

