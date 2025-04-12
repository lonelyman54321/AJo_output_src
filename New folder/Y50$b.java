/*
 * Decompiled with CFR 0.152.
 */
public final class Y50$b
extends Enum {
    private static final /* synthetic */ Y50$b[] $VALUES;
    public static final /* enum */ Y50$b FIXED;
    public static final /* enum */ Y50$b MATCH_CONSTRAINT;
    public static final /* enum */ Y50$b MATCH_PARENT;
    public static final /* enum */ Y50$b WRAP_CONTENT;

    private static /* synthetic */ Y50$b[] $values() {
        Y50$b y50$b = FIXED;
        y50$b = WRAP_CONTENT;
        y50$b = MATCH_CONSTRAINT;
        y50$b = MATCH_PARENT;
        Y50$b[] y50$bArray = new Y50$b[]{y50$b, y50$b, y50$b, y50$b};
        return y50$bArray;
    }

    static {
        Y50$b y50$b;
        FIXED = y50$b = new Y50$b("FIXED", 0);
        WRAP_CONTENT = y50$b = new Y50$b("WRAP_CONTENT", 1);
        MATCH_CONSTRAINT = y50$b = new Y50$b("MATCH_CONSTRAINT", 2);
        MATCH_PARENT = y50$b = new Y50$b("MATCH_PARENT", 3);
        $VALUES = Y50$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Y50$b() {
        void var2_-1;
        void var1_-1;
    }

    public static Y50$b valueOf(String string2) {
        return Enum.valueOf(Y50$b.class, string2);
    }

    public static Y50$b[] values() {
        return (Y50$b[])$VALUES.clone();
    }
}

