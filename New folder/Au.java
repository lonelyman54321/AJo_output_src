/*
 * Decompiled with CFR 0.152.
 */
public final class Au
extends Enum {
    private static final /* synthetic */ Au[] $VALUES;
    public static final /* enum */ Au EXPONENTIAL;
    public static final /* enum */ Au LINEAR;

    private static final /* synthetic */ Au[] $values() {
        Au au4 = EXPONENTIAL;
        au4 = LINEAR;
        Au[] auArray = new Au[]{au4, au4};
        return auArray;
    }

    static {
        Au au4;
        EXPONENTIAL = au4 = new Au("EXPONENTIAL", 0);
        LINEAR = au4 = new Au("LINEAR", 1);
        $VALUES = Au.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Au() {
        void var2_-1;
        void var1_-1;
    }

    public static Au valueOf(String string2) {
        return Enum.valueOf(Au.class, string2);
    }

    public static Au[] values() {
        return (Au[])$VALUES.clone();
    }
}

