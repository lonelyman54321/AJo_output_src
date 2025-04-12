/*
 * Decompiled with CFR 0.152.
 */
public final class Qa1
extends Enum {
    private static final /* synthetic */ Qa1[] $VALUES;
    public static final /* enum */ Qa1 DELETE;
    public static final /* enum */ Qa1 GET;
    public static final /* enum */ Qa1 POST;

    private static final /* synthetic */ Qa1[] $values() {
        Qa1 qa1 = GET;
        qa1 = POST;
        qa1 = DELETE;
        Qa1[] qa1Array = new Qa1[]{qa1, qa1, qa1};
        return qa1Array;
    }

    static {
        Qa1 qa1;
        GET = qa1 = new Qa1("GET", 0);
        POST = qa1 = new Qa1("POST", 1);
        DELETE = qa1 = new Qa1("DELETE", 2);
        $VALUES = Qa1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Qa1() {
        void var2_-1;
        void var1_-1;
    }

    public static Qa1 valueOf(String string2) {
        return Enum.valueOf(Qa1.class, string2);
    }

    public static Qa1[] values() {
        return (Qa1[])$VALUES.clone();
    }
}

