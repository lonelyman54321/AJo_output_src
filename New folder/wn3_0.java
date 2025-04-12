/*
 * Decompiled with CFR 0.152.
 */
/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from Wn3
 */
public final class wn3_0
extends Enum {
    private static final /* synthetic */ wn3_0[] $VALUES;
    public static final Wn3$a Companion;
    public static final /* enum */ wn3_0 SSL_3_0;
    public static final /* enum */ wn3_0 TLS_1_0;
    public static final /* enum */ wn3_0 TLS_1_1;
    public static final /* enum */ wn3_0 TLS_1_2;
    public static final /* enum */ wn3_0 TLS_1_3;
    private final String javaName;

    private static final /* synthetic */ wn3_0[] $values() {
        wn3_0 wn3_02 = TLS_1_3;
        wn3_02 = TLS_1_2;
        wn3_02 = TLS_1_1;
        wn3_02 = TLS_1_0;
        wn3_02 = SSL_3_0;
        wn3_0[] wn3_0Array = new wn3_0[]{wn3_02, wn3_02, wn3_02, wn3_02, wn3_02};
        return wn3_0Array;
    }

    static {
        Object object;
        TLS_1_3 = object = new wn3_0("TLS_1_3", 0, "TLSv1.3");
        TLS_1_2 = object = new wn3_0("TLS_1_2", 1, "TLSv1.2");
        TLS_1_1 = object = new wn3_0("TLS_1_1", 2, "TLSv1.1");
        TLS_1_0 = object = new wn3_0("TLS_1_0", 3, "TLSv1");
        SSL_3_0 = object = new wn3_0("SSL_3_0", 4, "SSLv3");
        $VALUES = wn3_0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wn3_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.javaName = var3_2;
    }

    public static final wn3_0 forJavaName(String string2) {
        Companion.getClass();
        return Wn3$a.a(string2);
    }

    public static wn3_0 valueOf(String string2) {
        return Enum.valueOf(wn3_0.class, string2);
    }

    public static wn3_0[] values() {
        return (wn3_0[])$VALUES.clone();
    }

    public final String -deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}

