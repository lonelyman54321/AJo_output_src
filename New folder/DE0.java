/*
 * Decompiled with CFR 0.152.
 */
public final class DE0
extends Enum {
    private static final /* synthetic */ DE0[] $VALUES;
    public static final /* enum */ DE0 APPEND;
    public static final /* enum */ DE0 APPEND_OR_REPLACE;
    public static final /* enum */ DE0 KEEP;
    public static final /* enum */ DE0 REPLACE;

    private static final /* synthetic */ DE0[] $values() {
        DE0 dE0 = REPLACE;
        dE0 = KEEP;
        dE0 = APPEND;
        dE0 = APPEND_OR_REPLACE;
        DE0[] dE0Array = new DE0[]{dE0, dE0, dE0, dE0};
        return dE0Array;
    }

    static {
        DE0 dE0;
        REPLACE = dE0 = new DE0("REPLACE", 0);
        KEEP = dE0 = new DE0("KEEP", 1);
        APPEND = dE0 = new DE0("APPEND", 2);
        APPEND_OR_REPLACE = dE0 = new DE0("APPEND_OR_REPLACE", 3);
        $VALUES = DE0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DE0() {
        void var2_-1;
        void var1_-1;
    }

    public static DE0 valueOf(String string2) {
        return Enum.valueOf(DE0.class, string2);
    }

    public static DE0[] values() {
        return (DE0[])$VALUES.clone();
    }
}

