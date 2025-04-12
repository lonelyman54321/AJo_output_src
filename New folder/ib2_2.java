/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from IB2
 */
public final class ib2_2
extends Enum {
    private static final /* synthetic */ ib2_2[] $VALUES;
    public static final IB2$a Companion;
    public static final /* enum */ ib2_2 H2_PRIOR_KNOWLEDGE;
    public static final /* enum */ ib2_2 HTTP_1_0;
    public static final /* enum */ ib2_2 HTTP_1_1;
    public static final /* enum */ ib2_2 HTTP_2;
    public static final /* enum */ ib2_2 QUIC;
    public static final /* enum */ ib2_2 SPDY_3;
    private final String protocol;

    private static final /* synthetic */ ib2_2[] $values() {
        ib2_2 ib2_22 = HTTP_1_0;
        ib2_22 = HTTP_1_1;
        ib2_22 = SPDY_3;
        ib2_22 = HTTP_2;
        ib2_22 = H2_PRIOR_KNOWLEDGE;
        ib2_22 = QUIC;
        ib2_2[] ib2_2Array = new ib2_2[]{ib2_22, ib2_22, ib2_22, ib2_22, ib2_22, ib2_22};
        return ib2_2Array;
    }

    static {
        Object object;
        HTTP_1_0 = object = new ib2_2("HTTP_1_0", 0, "http/1.0");
        HTTP_1_1 = object = new ib2_2("HTTP_1_1", 1, "http/1.1");
        SPDY_3 = object = new ib2_2("SPDY_3", 2, "spdy/3.1");
        HTTP_2 = object = new ib2_2("HTTP_2", 3, "h2");
        H2_PRIOR_KNOWLEDGE = object = new ib2_2("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        QUIC = object = new ib2_2("QUIC", 5, "quic");
        $VALUES = ib2_2.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ib2_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.protocol = var3_2;
    }

    public static final /* synthetic */ String access$getProtocol$p(ib2_2 ib2_22) {
        return ib2_22.protocol;
    }

    public static final ib2_2 get(String string2) {
        Companion.getClass();
        return IB2$a.a(string2);
    }

    public static ib2_2 valueOf(String string2) {
        return Enum.valueOf(ib2_2.class, string2);
    }

    public static ib2_2[] values() {
        return (ib2_2[])$VALUES.clone();
    }

    public String toString() {
        return this.protocol;
    }
}

