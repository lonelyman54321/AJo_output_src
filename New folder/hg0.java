/*
 * Decompiled with CFR 0.152.
 */
public final class hg0
extends Enum {
    private static final /* synthetic */ hg0[] $VALUES;
    public static final hg0$a Companion;
    public static final /* enum */ hg0 FUNCTION;
    public static final /* enum */ hg0 TEMPLATE;
    private final String stringName;

    private static final /* synthetic */ hg0[] $values() {
        hg0 hg02 = TEMPLATE;
        hg02 = FUNCTION;
        hg0[] hg0Array = new hg0[]{hg02, hg02};
        return hg0Array;
    }

    static {
        Object object;
        TEMPLATE = object = new hg0("TEMPLATE", 0, "template");
        FUNCTION = object = new hg0("FUNCTION", 1, "function");
        $VALUES = hg0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hg0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.stringName = var3_2;
    }

    public static final /* synthetic */ String access$getStringName$p(hg0 hg02) {
        return hg02.stringName;
    }

    public static hg0 valueOf(String string2) {
        return Enum.valueOf(hg0.class, string2);
    }

    public static hg0[] values() {
        return (hg0[])$VALUES.clone();
    }

    public String toString() {
        return this.stringName;
    }
}

