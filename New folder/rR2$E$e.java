/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$e
extends Enum {
    private static final /* synthetic */ rR2$E$e[] $VALUES;
    public static final /* enum */ rR2$E$e auto;
    public static final /* enum */ rR2$E$e optimizeQuality;
    public static final /* enum */ rR2$E$e optimizeSpeed;

    static {
        rR2$E$e rR2$E$e;
        rR2$E$e rR2$E$e2;
        rR2$E$e rR2$E$e3;
        auto = rR2$E$e3 = new rR2$E$e("auto", 0);
        int n3 = 1;
        optimizeQuality = rR2$E$e2 = new rR2$E$e("optimizeQuality", n3);
        int n4 = 2;
        optimizeSpeed = rR2$E$e = new rR2$E$e("optimizeSpeed", n4);
        rR2$E$e[] rR2$E$eArray = new rR2$E$e[3];
        rR2$E$eArray[0] = rR2$E$e3;
        rR2$E$eArray[n3] = rR2$E$e2;
        rR2$E$eArray[n4] = rR2$E$e;
        $VALUES = rR2$E$eArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$e() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$e valueOf(String string2) {
        return Enum.valueOf(rR2$E$e.class, string2);
    }

    public static rR2$E$e[] values() {
        return (rR2$E$e[])$VALUES.clone();
    }
}

