/*
 * Decompiled with CFR 0.152.
 */
public final class S03
extends Enum {
    private static final /* synthetic */ S03[] $VALUES;
    public static final /* enum */ S03 ACCESSKEY;
    public static final /* enum */ S03 DATASETID;
    public static final /* enum */ S03 ENABLED;
    public static final /* enum */ S03 URL;
    private final String rawValue;

    private static final /* synthetic */ S03[] $values() {
        S03 s03 = URL;
        s03 = ENABLED;
        s03 = DATASETID;
        s03 = ACCESSKEY;
        S03[] s03Array = new S03[]{s03, s03, s03, s03};
        return s03Array;
    }

    static {
        S03 s03;
        URL = s03 = new S03("URL", 0, "endpoint");
        ENABLED = s03 = new S03("ENABLED", 1, "is_enabled");
        DATASETID = s03 = new S03("DATASETID", 2, "dataset_id");
        ACCESSKEY = s03 = new S03("ACCESSKEY", 3, "access_key");
        $VALUES = S03.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private S03() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static S03 valueOf(String string2) {
        return Enum.valueOf(S03.class, string2);
    }

    public static S03[] values() {
        return (S03[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

