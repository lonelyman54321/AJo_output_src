/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$k
extends Enum {
    private static final /* synthetic */ rR2$k[] $VALUES;
    public static final /* enum */ rR2$k pad;
    public static final /* enum */ rR2$k reflect;
    public static final /* enum */ rR2$k repeat;

    static {
        rR2$k rR2$k;
        rR2$k rR2$k2;
        rR2$k rR2$k3;
        pad = rR2$k3 = new rR2$k("pad", 0);
        int n3 = 1;
        reflect = rR2$k2 = new rR2$k("reflect", n3);
        int n4 = 2;
        repeat = rR2$k = new rR2$k("repeat", n4);
        rR2$k[] rR2$kArray = new rR2$k[3];
        rR2$kArray[0] = rR2$k3;
        rR2$kArray[n3] = rR2$k2;
        rR2$kArray[n4] = rR2$k;
        $VALUES = rR2$kArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$k() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$k valueOf(String string2) {
        return Enum.valueOf(rR2$k.class, string2);
    }

    public static rR2$k[] values() {
        return (rR2$k[])$VALUES.clone();
    }
}

