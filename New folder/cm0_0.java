/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cM0
 */
public final class cm0_0
extends Enum {
    private static final /* synthetic */ cm0_0[] $VALUES;
    public static final /* enum */ cm0_0 AGGREGATION_COUNT;
    public static final /* enum */ cm0_0 CLASSES;
    public static final /* enum */ cm0_0 DEX_FILES;
    public static final /* enum */ cm0_0 EXTRA_DESCRIPTORS;
    public static final /* enum */ cm0_0 METHODS;
    private final long mValue;

    private static /* synthetic */ cm0_0[] $values() {
        cm0_0 cm0_02 = DEX_FILES;
        cm0_02 = EXTRA_DESCRIPTORS;
        cm0_02 = CLASSES;
        cm0_02 = METHODS;
        cm0_02 = AGGREGATION_COUNT;
        cm0_0[] cm0_0Array = new cm0_0[]{cm0_02, cm0_02, cm0_02, cm0_02, cm0_02};
        return cm0_0Array;
    }

    static {
        cm0_0 cm0_02;
        DEX_FILES = cm0_02 = new cm0_0("DEX_FILES", 0, 0L);
        EXTRA_DESCRIPTORS = cm0_02 = new cm0_0("EXTRA_DESCRIPTORS", 1, 1L);
        CLASSES = cm0_02 = new cm0_0("CLASSES", 2, (long)2);
        METHODS = cm0_02 = new cm0_0("METHODS", 3, (long)3);
        AGGREGATION_COUNT = cm0_02 = new cm0_0("AGGREGATION_COUNT", 4, (long)4);
        $VALUES = cm0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cm0_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.mValue = var3_2;
    }

    public static cm0_0 fromValue(long l2) {
        int n3;
        Object object = cm0_0.values();
        for (int i3 = 0; i3 < (n3 = ((cm0_0[])object).length); ++i3) {
            cm0_0 cm0_02 = object[i3];
            long l3 = cm0_02.getValue();
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) continue;
            return object[i3];
        }
        String string2 = Wm2.a(l2, "Unsupported FileSection Type ");
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static cm0_0 valueOf(String string2) {
        return Enum.valueOf(cm0_0.class, string2);
    }

    public static cm0_0[] values() {
        return (cm0_0[])$VALUES.clone();
    }

    public long getValue() {
        return this.mValue;
    }
}

