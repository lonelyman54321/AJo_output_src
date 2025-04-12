/*
 * Decompiled with CFR 0.152.
 */
public final class k93$a
extends Enum {
    private static final /* synthetic */ k93$a[] $VALUES;
    public static final /* enum */ k93$a CONSTANT;
    public static final /* enum */ k93$a ERROR;
    public static final /* enum */ k93$a SLACK;
    public static final /* enum */ k93$a UNKNOWN;
    public static final /* enum */ k93$a UNRESTRICTED;

    private static /* synthetic */ k93$a[] $values() {
        k93$a k93$a = UNRESTRICTED;
        k93$a = CONSTANT;
        k93$a = SLACK;
        k93$a = ERROR;
        k93$a = UNKNOWN;
        k93$a[] k93$aArray = new k93$a[]{k93$a, k93$a, k93$a, k93$a, k93$a};
        return k93$aArray;
    }

    static {
        k93$a k93$a;
        UNRESTRICTED = k93$a = new k93$a("UNRESTRICTED", 0);
        CONSTANT = k93$a = new k93$a("CONSTANT", 1);
        SLACK = k93$a = new k93$a("SLACK", 2);
        ERROR = k93$a = new k93$a("ERROR", 3);
        UNKNOWN = k93$a = new k93$a("UNKNOWN", 4);
        $VALUES = k93$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private k93$a() {
        void var2_-1;
        void var1_-1;
    }

    public static k93$a valueOf(String string2) {
        return Enum.valueOf(k93$a.class, string2);
    }

    public static k93$a[] values() {
        return (k93$a[])$VALUES.clone();
    }
}

