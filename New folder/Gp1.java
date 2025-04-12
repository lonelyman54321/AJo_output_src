/*
 * Decompiled with CFR 0.152.
 */
public final class Gp1
extends Enum {
    private static final /* synthetic */ Gp1[] $VALUES;
    public static final /* enum */ Gp1 BOUNDS;
    public static final /* enum */ Gp1 NONE;

    private static final /* synthetic */ Gp1[] $values() {
        Gp1 gp1 = NONE;
        gp1 = BOUNDS;
        Gp1[] gp1Array = new Gp1[]{gp1, gp1};
        return gp1Array;
    }

    static {
        Gp1 gp1;
        NONE = gp1 = new Gp1("NONE", 0);
        BOUNDS = gp1 = new Gp1("BOUNDS", 1);
        $VALUES = Gp1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Gp1() {
        void var2_-1;
        void var1_-1;
    }

    public static Gp1 valueOf(String string2) {
        return Enum.valueOf(Gp1.class, string2);
    }

    public static Gp1[] values() {
        return (Gp1[])$VALUES.clone();
    }
}

