/*
 * Decompiled with CFR 0.152.
 */
public final class uZ
extends Enum {
    private static final /* synthetic */ uZ[] $VALUES;
    public static final /* enum */ uZ INITIAL;
    public static final /* enum */ uZ OTHER;
    public static final /* enum */ uZ RECEIVER;

    private static final /* synthetic */ uZ[] $values() {
        uZ uZ3 = INITIAL;
        uZ3 = RECEIVER;
        uZ3 = OTHER;
        uZ[] uZArray = new uZ[]{uZ3, uZ3, uZ3};
        return uZArray;
    }

    static {
        uZ uZ3;
        INITIAL = uZ3 = new uZ("INITIAL", 0);
        RECEIVER = uZ3 = new uZ("RECEIVER", 1);
        OTHER = uZ3 = new uZ("OTHER", 2);
        $VALUES = uZ.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uZ() {
        void var2_-1;
        void var1_-1;
    }

    public static uZ valueOf(String string2) {
        return Enum.valueOf(uZ.class, string2);
    }

    public static uZ[] values() {
        return (uZ[])$VALUES.clone();
    }
}

