/*
 * Decompiled with CFR 0.152.
 */
public final class QN1
extends Enum {
    private static final /* synthetic */ QN1[] $VALUES;
    public static final /* enum */ QN1 HIGH;
    public static final /* enum */ QN1 LOW;
    public static final /* enum */ QN1 NORMAL;
    private final float multiplier;

    private static /* synthetic */ QN1[] $values() {
        QN1 qN1 = LOW;
        qN1 = NORMAL;
        qN1 = HIGH;
        QN1[] qN1Array = new QN1[]{qN1, qN1, qN1};
        return qN1Array;
    }

    static {
        QN1 qN1;
        LOW = qN1 = new QN1("LOW", 0, 0.5f);
        NORMAL = qN1 = new QN1("NORMAL", 1, 1.0f);
        HIGH = qN1 = new QN1("HIGH", 2, 1.5f);
        $VALUES = QN1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QN1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.multiplier = var3_2;
    }

    public static QN1 valueOf(String string2) {
        return Enum.valueOf(QN1.class, string2);
    }

    public static QN1[] values() {
        return (QN1[])$VALUES.clone();
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}

