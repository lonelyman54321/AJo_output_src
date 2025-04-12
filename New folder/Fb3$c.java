/*
 * Decompiled with CFR 0.152.
 */
public final class Fb3$c
extends Enum {
    private static final /* synthetic */ Fb3$c[] $VALUES;
    public static final /* enum */ Fb3$c BOTTOM;
    public static final /* enum */ Fb3$c END;
    public static final /* enum */ Fb3$c LEFT;
    public static final /* enum */ Fb3$c RIGHT;
    public static final /* enum */ Fb3$c START;
    public static final /* enum */ Fb3$c TOP;

    private static /* synthetic */ Fb3$c[] $values() {
        Fb3$c fb3$c = LEFT;
        fb3$c = RIGHT;
        fb3$c = START;
        fb3$c = END;
        fb3$c = TOP;
        fb3$c = BOTTOM;
        Fb3$c[] fb3$cArray = new Fb3$c[]{fb3$c, fb3$c, fb3$c, fb3$c, fb3$c, fb3$c};
        return fb3$cArray;
    }

    static {
        Fb3$c fb3$c;
        LEFT = fb3$c = new Fb3$c("LEFT", 0);
        RIGHT = fb3$c = new Fb3$c("RIGHT", 1);
        START = fb3$c = new Fb3$c("START", 2);
        END = fb3$c = new Fb3$c("END", 3);
        TOP = fb3$c = new Fb3$c("TOP", 4);
        BOTTOM = fb3$c = new Fb3$c("BOTTOM", 5);
        $VALUES = Fb3$c.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Fb3$c() {
        void var2_-1;
        void var1_-1;
    }

    public static Fb3$c valueOf(String string2) {
        return Enum.valueOf(Fb3$c.class, string2);
    }

    public static Fb3$c[] values() {
        return (Fb3$c[])$VALUES.clone();
    }
}

