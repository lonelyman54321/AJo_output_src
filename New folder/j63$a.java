/*
 * Decompiled with CFR 0.152.
 */
public final class j63$a
extends Enum {
    private static final /* synthetic */ j63$a[] $VALUES;
    public static final /* enum */ j63$a CLEARED;
    public static final /* enum */ j63$a COMPLETE;
    public static final /* enum */ j63$a FAILED;
    public static final /* enum */ j63$a PENDING;
    public static final /* enum */ j63$a RUNNING;
    public static final /* enum */ j63$a WAITING_FOR_SIZE;

    private static /* synthetic */ j63$a[] $values() {
        j63$a j63$a = PENDING;
        j63$a = RUNNING;
        j63$a = WAITING_FOR_SIZE;
        j63$a = COMPLETE;
        j63$a = FAILED;
        j63$a = CLEARED;
        j63$a[] j63$aArray = new j63$a[]{j63$a, j63$a, j63$a, j63$a, j63$a, j63$a};
        return j63$aArray;
    }

    static {
        j63$a j63$a;
        PENDING = j63$a = new j63$a("PENDING", 0);
        RUNNING = j63$a = new j63$a("RUNNING", 1);
        WAITING_FOR_SIZE = j63$a = new j63$a("WAITING_FOR_SIZE", 2);
        COMPLETE = j63$a = new j63$a("COMPLETE", 3);
        FAILED = j63$a = new j63$a("FAILED", 4);
        CLEARED = j63$a = new j63$a("CLEARED", 5);
        $VALUES = j63$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private j63$a() {
        void var2_-1;
        void var1_-1;
    }

    public static j63$a valueOf(String string2) {
        return Enum.valueOf(j63$a.class, string2);
    }

    public static j63$a[] values() {
        return (j63$a[])$VALUES.clone();
    }
}

