/*
 * Decompiled with CFR 0.152.
 */
public final class jk1
extends Enum {
    private static final /* synthetic */ jk1[] $VALUES;
    public static final /* enum */ jk1 DEFERRED;
    public static final /* enum */ jk1 IGNORED;
    public static final /* enum */ jk1 IMMINENT;
    public static final /* enum */ jk1 SCHEDULED;

    private static final /* synthetic */ jk1[] $values() {
        jk1 jk12 = IGNORED;
        jk12 = SCHEDULED;
        jk12 = DEFERRED;
        jk12 = IMMINENT;
        jk1[] jk1Array = new jk1[]{jk12, jk12, jk12, jk12};
        return jk1Array;
    }

    static {
        jk1 jk12;
        IGNORED = jk12 = new jk1("IGNORED", 0);
        SCHEDULED = jk12 = new jk1("SCHEDULED", 1);
        DEFERRED = jk12 = new jk1("DEFERRED", 2);
        IMMINENT = jk12 = new jk1("IMMINENT", 3);
        $VALUES = jk1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jk1() {
        void var2_-1;
        void var1_-1;
    }

    public static jk1 valueOf(String string2) {
        return Enum.valueOf(jk1.class, string2);
    }

    public static jk1[] values() {
        return (jk1[])$VALUES.clone();
    }
}

