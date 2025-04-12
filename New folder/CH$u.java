/*
 * Decompiled with CFR 0.152.
 */
public final class CH$u
extends Enum {
    private static final /* synthetic */ CH$u[] $VALUES;
    public static final /* enum */ CH$u Document;
    public static final /* enum */ CH$u RenderOptions;

    static {
        CH$u cH$u;
        CH$u cH$u2;
        Document = cH$u2 = new CH$u("Document", 0);
        int n3 = 1;
        RenderOptions = cH$u = new CH$u("RenderOptions", n3);
        CH$u[] cH$uArray = new CH$u[2];
        cH$uArray[0] = cH$u2;
        cH$uArray[n3] = cH$u;
        $VALUES = cH$uArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CH$u() {
        void var2_-1;
        void var1_-1;
    }

    public static CH$u valueOf(String string2) {
        return Enum.valueOf(CH$u.class, string2);
    }

    public static CH$u[] values() {
        return (CH$u[])$VALUES.clone();
    }
}

