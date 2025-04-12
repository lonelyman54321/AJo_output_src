/*
 * Decompiled with CFR 0.152.
 */
public final class jO1$a
extends Enum {
    private static final /* synthetic */ jO1$a[] $VALUES;
    public static final /* enum */ jO1$a ADD;
    public static final /* enum */ jO1$a EXCLUDE_INTERSECTIONS;
    public static final /* enum */ jO1$a INTERSECT;
    public static final /* enum */ jO1$a MERGE;
    public static final /* enum */ jO1$a SUBTRACT;

    private static /* synthetic */ jO1$a[] $values() {
        jO1$a jO1$a = MERGE;
        jO1$a = ADD;
        jO1$a = SUBTRACT;
        jO1$a = INTERSECT;
        jO1$a = EXCLUDE_INTERSECTIONS;
        jO1$a[] jO1$aArray = new jO1$a[]{jO1$a, jO1$a, jO1$a, jO1$a, jO1$a};
        return jO1$aArray;
    }

    static {
        jO1$a jO1$a;
        MERGE = jO1$a = new jO1$a("MERGE", 0);
        ADD = jO1$a = new jO1$a("ADD", 1);
        SUBTRACT = jO1$a = new jO1$a("SUBTRACT", 2);
        INTERSECT = jO1$a = new jO1$a("INTERSECT", 3);
        EXCLUDE_INTERSECTIONS = jO1$a = new jO1$a("EXCLUDE_INTERSECTIONS", 4);
        $VALUES = jO1$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jO1$a() {
        void var2_-1;
        void var1_-1;
    }

    public static jO1$a forId(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    n4 = 4;
                    if (n3 != n4) {
                        n4 = 5;
                        if (n3 != n4) {
                            return MERGE;
                        }
                        return EXCLUDE_INTERSECTIONS;
                    }
                    return INTERSECT;
                }
                return SUBTRACT;
            }
            return ADD;
        }
        return MERGE;
    }

    public static jO1$a valueOf(String string2) {
        return Enum.valueOf(jO1$a.class, string2);
    }

    public static jO1$a[] values() {
        return (jO1$a[])$VALUES.clone();
    }
}

