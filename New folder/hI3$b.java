/*
 * Decompiled with CFR 0.152.
 */
public final class hI3$b
extends Enum {
    private static final /* synthetic */ hI3$b[] $VALUES;
    public static final /* enum */ hI3$b BLOCKED;
    public static final /* enum */ hI3$b CANCELLED;
    public static final /* enum */ hI3$b ENQUEUED;
    public static final /* enum */ hI3$b FAILED;
    public static final /* enum */ hI3$b RUNNING;
    public static final /* enum */ hI3$b SUCCEEDED;

    private static final /* synthetic */ hI3$b[] $values() {
        hI3$b hI3$b = ENQUEUED;
        hI3$b = RUNNING;
        hI3$b = SUCCEEDED;
        hI3$b = FAILED;
        hI3$b = BLOCKED;
        hI3$b = CANCELLED;
        hI3$b[] hI3$bArray = new hI3$b[]{hI3$b, hI3$b, hI3$b, hI3$b, hI3$b, hI3$b};
        return hI3$bArray;
    }

    static {
        hI3$b hI3$b;
        ENQUEUED = hI3$b = new hI3$b("ENQUEUED", 0);
        RUNNING = hI3$b = new hI3$b("RUNNING", 1);
        SUCCEEDED = hI3$b = new hI3$b("SUCCEEDED", 2);
        FAILED = hI3$b = new hI3$b("FAILED", 3);
        BLOCKED = hI3$b = new hI3$b("BLOCKED", 4);
        CANCELLED = hI3$b = new hI3$b("CANCELLED", 5);
        $VALUES = hI3$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hI3$b() {
        void var2_-1;
        void var1_-1;
    }

    public static hI3$b valueOf(String string2) {
        return Enum.valueOf(hI3$b.class, string2);
    }

    public static hI3$b[] values() {
        return (hI3$b[])$VALUES.clone();
    }

    public final boolean isFinished() {
        boolean bl2;
        hI3$b hI3$b = SUCCEEDED;
        if (this != hI3$b && this != (hI3$b = FAILED) && this != (hI3$b = CANCELLED)) {
            bl2 = false;
            hI3$b = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

