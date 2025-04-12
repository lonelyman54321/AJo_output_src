/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from GT0
 */
public final class gt0_0
extends Enum {
    private static final /* synthetic */ gt0_0[] $VALUES;
    public static final /* enum */ gt0_0 EAGER_FLUSHING_EVENT;
    public static final /* enum */ gt0_0 EVENT_THRESHOLD;
    public static final /* enum */ gt0_0 EXPLICIT;
    public static final /* enum */ gt0_0 PERSISTED_EVENTS;
    public static final /* enum */ gt0_0 SESSION_CHANGE;
    public static final /* enum */ gt0_0 TIMER;

    private static final /* synthetic */ gt0_0[] $values() {
        gt0_0 gt0_02 = EXPLICIT;
        gt0_02 = TIMER;
        gt0_02 = SESSION_CHANGE;
        gt0_02 = PERSISTED_EVENTS;
        gt0_02 = EVENT_THRESHOLD;
        gt0_02 = EAGER_FLUSHING_EVENT;
        gt0_0[] gt0_0Array = new gt0_0[]{gt0_02, gt0_02, gt0_02, gt0_02, gt0_02, gt0_02};
        return gt0_0Array;
    }

    static {
        gt0_0 gt0_02;
        EXPLICIT = gt0_02 = new gt0_0("EXPLICIT", 0);
        TIMER = gt0_02 = new gt0_0("TIMER", 1);
        SESSION_CHANGE = gt0_02 = new gt0_0("SESSION_CHANGE", 2);
        PERSISTED_EVENTS = gt0_02 = new gt0_0("PERSISTED_EVENTS", 3);
        EVENT_THRESHOLD = gt0_02 = new gt0_0("EVENT_THRESHOLD", 4);
        EAGER_FLUSHING_EVENT = gt0_02 = new gt0_0("EAGER_FLUSHING_EVENT", 5);
        $VALUES = gt0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gt0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static gt0_0 valueOf(String string2) {
        return Enum.valueOf(gt0_0.class, string2);
    }

    public static gt0_0[] values() {
        return (gt0_0[])$VALUES.clone();
    }
}

