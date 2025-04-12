/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.coroutines.scheduling;

public final class CoroutineScheduler$b
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ CoroutineScheduler$b[] $VALUES;
    public static final /* enum */ CoroutineScheduler$b BLOCKING;
    public static final /* enum */ CoroutineScheduler$b CPU_ACQUIRED;
    public static final /* enum */ CoroutineScheduler$b DORMANT;
    public static final /* enum */ CoroutineScheduler$b PARKING;
    public static final /* enum */ CoroutineScheduler$b TERMINATED;

    private static final /* synthetic */ CoroutineScheduler$b[] $values() {
        CoroutineScheduler$b coroutineScheduler$b = CPU_ACQUIRED;
        coroutineScheduler$b = BLOCKING;
        coroutineScheduler$b = PARKING;
        coroutineScheduler$b = DORMANT;
        coroutineScheduler$b = TERMINATED;
        CoroutineScheduler$b[] coroutineScheduler$bArray = new CoroutineScheduler$b[]{coroutineScheduler$b, coroutineScheduler$b, coroutineScheduler$b, coroutineScheduler$b, coroutineScheduler$b};
        return coroutineScheduler$bArray;
    }

    static {
        Enum[] enumArray = new CoroutineScheduler$b("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = enumArray;
        enumArray = new CoroutineScheduler$b("BLOCKING", 1);
        BLOCKING = enumArray;
        enumArray = new CoroutineScheduler$b("PARKING", 2);
        PARKING = enumArray;
        enumArray = new CoroutineScheduler$b("DORMANT", 3);
        DORMANT = enumArray;
        enumArray = new CoroutineScheduler$b("TERMINATED", 4);
        TERMINATED = enumArray;
        enumArray = CoroutineScheduler$b.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CoroutineScheduler$b() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static CoroutineScheduler$b valueOf(String string2) {
        return Enum.valueOf(CoroutineScheduler$b.class, string2);
    }

    public static CoroutineScheduler$b[] values() {
        return (CoroutineScheduler$b[])$VALUES.clone();
    }
}

