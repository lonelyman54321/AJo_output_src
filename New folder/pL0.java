/*
 * Decompiled with CFR 0.152.
 */
public final class pL0
extends Enum {
    private static final /* synthetic */ pL0[] $VALUES;
    public static final /* enum */ pL0 GZIP;
    public static final /* enum */ pL0 JSON;
    public static final /* enum */ pL0 ZIP;
    public final String extension;

    private static /* synthetic */ pL0[] $values() {
        pL0 pL02 = JSON;
        pL02 = ZIP;
        pL02 = GZIP;
        pL0[] pL0Array = new pL0[]{pL02, pL02, pL02};
        return pL0Array;
    }

    static {
        pL0 pL02;
        JSON = pL02 = new pL0("JSON", 0, ".json");
        ZIP = pL02 = new pL0("ZIP", 1, ".zip");
        GZIP = pL02 = new pL0("GZIP", 2, ".gz");
        $VALUES = pL0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pL0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.extension = var3_2;
    }

    public static pL0 valueOf(String string2) {
        return Enum.valueOf(pL0.class, string2);
    }

    public static pL0[] values() {
        return (pL0[])$VALUES.clone();
    }

    public String tempExtension() {
        StringBuilder stringBuilder = new StringBuilder(".temp");
        String string2 = this.extension;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.extension;
    }
}

