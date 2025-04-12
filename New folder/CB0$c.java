/*
 * Decompiled with CFR 0.152.
 */
public final class CB0$c
extends Enum {
    private static final /* synthetic */ CB0$c[] $VALUES;
    public static final /* enum */ CB0$c INFERENCE;
    public static final /* enum */ CB0$c MANUAL;

    private static final /* synthetic */ CB0$c[] $values() {
        CB0$c cB0$c = MANUAL;
        cB0$c = INFERENCE;
        CB0$c[] cB0$cArray = new CB0$c[]{cB0$c, cB0$c};
        return cB0$cArray;
    }

    static {
        CB0$c cB0$c;
        MANUAL = cB0$c = new CB0$c("MANUAL", 0);
        INFERENCE = cB0$c = new CB0$c("INFERENCE", 1);
        $VALUES = CB0$c.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CB0$c() {
        void var2_-1;
        void var1_-1;
    }

    public static CB0$c valueOf(String string2) {
        return Enum.valueOf(CB0$c.class, string2);
    }

    public static CB0$c[] values() {
        return (CB0$c[])$VALUES.clone();
    }
}

