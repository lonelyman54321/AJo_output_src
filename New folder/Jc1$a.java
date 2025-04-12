/*
 * Decompiled with CFR 0.152.
 */
public final class Jc1$a
extends Enum {
    public static final /* synthetic */ Jc1$a[] $VALUES;
    public static final /* enum */ Jc1$a APPLICATION;
    public static final /* enum */ Jc1$a CONTEXT_SPECIFIC;
    public static final /* enum */ Jc1$a PRIVATE;
    public static final /* enum */ Jc1$a UNIVERSAL;

    public static /* synthetic */ Jc1$a[] $values() {
        Jc1$a jc1$a = UNIVERSAL;
        jc1$a = APPLICATION;
        jc1$a = CONTEXT_SPECIFIC;
        jc1$a = PRIVATE;
        Jc1$a[] jc1$aArray = new Jc1$a[]{jc1$a, jc1$a, jc1$a, jc1$a};
        return jc1$aArray;
    }

    static {
        Jc1$a jc1$a;
        UNIVERSAL = jc1$a = new Jc1$a("UNIVERSAL", 0);
        APPLICATION = jc1$a = new Jc1$a("APPLICATION", 1);
        CONTEXT_SPECIFIC = jc1$a = new Jc1$a("CONTEXT_SPECIFIC", 2);
        PRIVATE = jc1$a = new Jc1$a("PRIVATE", 3);
        $VALUES = Jc1$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public Jc1$a() {
        void var2_-1;
        void var1_-1;
    }

    public static Jc1$a valueOf(String string2) {
        return Enum.valueOf(Jc1$a.class, string2);
    }

    public static Jc1$a[] values() {
        return (Jc1$a[])$VALUES.clone();
    }
}

