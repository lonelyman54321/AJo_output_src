/*
 * Decompiled with CFR 0.152.
 */
public final class ng1$b
extends Enum {
    private static final /* synthetic */ ng1$b[] $VALUES;
    public static final /* enum */ ng1$b INAPP;
    public static final /* enum */ ng1$b SUBS;
    private final String type;

    private static final /* synthetic */ ng1$b[] $values() {
        ng1$b ng1$b = INAPP;
        ng1$b = SUBS;
        ng1$b[] ng1$bArray = new ng1$b[]{ng1$b, ng1$b};
        return ng1$bArray;
    }

    static {
        ng1$b ng1$b;
        INAPP = ng1$b = new ng1$b("INAPP", 0, "inapp");
        SUBS = ng1$b = new ng1$b("SUBS", 1, "subs");
        $VALUES = ng1$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ng1$b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ng1$b valueOf(String string2) {
        return Enum.valueOf(ng1$b.class, string2);
    }

    public static ng1$b[] values() {
        return (ng1$b[])$VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

