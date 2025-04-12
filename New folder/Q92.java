/*
 * Decompiled with CFR 0.152.
 */
public final class Q92
extends Enum {
    private static final /* synthetic */ Q92[] $VALUES;
    public static final /* enum */ Q92 IAPParameters;
    private final String value;

    private static final /* synthetic */ Q92[] $values() {
        Q92 q92 = IAPParameters;
        Q92[] q92Array = new Q92[]{q92};
        return q92Array;
    }

    static {
        Q92 q92;
        IAPParameters = q92 = new Q92("IAPParameters", 0, "iap_parameters");
        $VALUES = Q92.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Q92() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static Q92 valueOf(String string2) {
        return Enum.valueOf(Q92.class, string2);
    }

    public static Q92[] values() {
        return (Q92[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

