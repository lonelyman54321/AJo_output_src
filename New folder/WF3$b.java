/*
 * Decompiled with CFR 0.152.
 */
public final class WF3$b
extends Enum {
    private static final /* synthetic */ WF3$b[] $VALUES;
    public static final /* enum */ WF3$b CENTER;
    public static final /* enum */ WF3$b END;
    public static final /* enum */ WF3$b NONE;
    public static final /* enum */ WF3$b START;

    private static /* synthetic */ WF3$b[] $values() {
        WF3$b wF3$b = NONE;
        wF3$b = START;
        wF3$b = END;
        wF3$b = CENTER;
        WF3$b[] wF3$bArray = new WF3$b[]{wF3$b, wF3$b, wF3$b, wF3$b};
        return wF3$bArray;
    }

    static {
        WF3$b wF3$b;
        NONE = wF3$b = new WF3$b("NONE", 0);
        START = wF3$b = new WF3$b("START", 1);
        END = wF3$b = new WF3$b("END", 2);
        CENTER = wF3$b = new WF3$b("CENTER", 3);
        $VALUES = WF3$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private WF3$b() {
        void var2_-1;
        void var1_-1;
    }

    public static WF3$b valueOf(String string2) {
        return Enum.valueOf(WF3$b.class, string2);
    }

    public static WF3$b[] values() {
        return (WF3$b[])$VALUES.clone();
    }
}

