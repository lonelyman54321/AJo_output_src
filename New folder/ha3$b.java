/*
 * Decompiled with CFR 0.152.
 */
public final class ha3$b
extends Enum {
    private static final /* synthetic */ ha3$b[] $VALUES;
    public static final /* enum */ ha3$b LOG;
    public static final /* enum */ ha3$b QUIET;
    public static final /* enum */ ha3$b STRICT;

    private static final /* synthetic */ ha3$b[] $values() {
        ha3$b ha3$b = STRICT;
        ha3$b = LOG;
        ha3$b = QUIET;
        ha3$b[] ha3$bArray = new ha3$b[]{ha3$b, ha3$b, ha3$b};
        return ha3$bArray;
    }

    static {
        ha3$b ha3$b;
        STRICT = ha3$b = new ha3$b("STRICT", 0);
        LOG = ha3$b = new ha3$b("LOG", 1);
        QUIET = ha3$b = new ha3$b("QUIET", 2);
        $VALUES = ha3$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ha3$b() {
        void var2_-1;
        void var1_-1;
    }

    public static ha3$b valueOf(String string2) {
        return Enum.valueOf(ha3$b.class, string2);
    }

    public static ha3$b[] values() {
        return (ha3$b[])$VALUES.clone();
    }
}

