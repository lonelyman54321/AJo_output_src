/*
 * Decompiled with CFR 0.152.
 */
public final class Wn$a
extends Enum {
    private static final /* synthetic */ Wn$a[] $VALUES;
    public static final /* enum */ Wn$a COUNTRY;
    public static final Wn$a$a Companion;
    public static final /* enum */ Wn$a OPTIONS;
    public static final /* enum */ Wn$a STATE;
    private final String rawValue;

    private static final /* synthetic */ Wn$a[] $values() {
        Wn$a wn$a = OPTIONS;
        wn$a = COUNTRY;
        wn$a = STATE;
        Wn$a[] wn$aArray = new Wn$a[]{wn$a, wn$a, wn$a};
        return wn$aArray;
    }

    static {
        Object object;
        OPTIONS = object = new Wn$a("OPTIONS", 0, "data_processing_options");
        COUNTRY = object = new Wn$a("COUNTRY", 1, "data_processing_options_country");
        STATE = object = new Wn$a("STATE", 2, "data_processing_options_state");
        $VALUES = Wn$a.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Wn$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static Wn$a valueOf(String string2) {
        return Enum.valueOf(Wn$a.class, string2);
    }

    public static Wn$a[] values() {
        return (Wn$a[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

