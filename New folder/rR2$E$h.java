/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$h
extends Enum {
    private static final /* synthetic */ rR2$E$h[] $VALUES;
    public static final /* enum */ rR2$E$h LTR;
    public static final /* enum */ rR2$E$h RTL;

    static {
        rR2$E$h rR2$E$h;
        rR2$E$h rR2$E$h2;
        LTR = rR2$E$h2 = new rR2$E$h("LTR", 0);
        int n3 = 1;
        RTL = rR2$E$h = new rR2$E$h("RTL", n3);
        rR2$E$h[] rR2$E$hArray = new rR2$E$h[2];
        rR2$E$hArray[0] = rR2$E$h2;
        rR2$E$hArray[n3] = rR2$E$h;
        $VALUES = rR2$E$hArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$h() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$h valueOf(String string2) {
        return Enum.valueOf(rR2$E$h.class, string2);
    }

    public static rR2$E$h[] values() {
        return (rR2$E$h[])$VALUES.clone();
    }
}

