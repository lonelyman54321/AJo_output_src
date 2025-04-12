/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

public final class a$a
extends Enum {
    private static final /* synthetic */ a$a[] $VALUES;
    public static final /* enum */ a$a BOOLEAN_TYPE;
    public static final /* enum */ a$a COLOR_DRAWABLE_TYPE;
    public static final /* enum */ a$a COLOR_TYPE;
    public static final /* enum */ a$a DIMENSION_TYPE;
    public static final /* enum */ a$a FLOAT_TYPE;
    public static final /* enum */ a$a INT_TYPE;
    public static final /* enum */ a$a REFERENCE_TYPE;
    public static final /* enum */ a$a STRING_TYPE;

    private static /* synthetic */ a$a[] $values() {
        a$a a$a = INT_TYPE;
        a$a = FLOAT_TYPE;
        a$a = COLOR_TYPE;
        a$a = COLOR_DRAWABLE_TYPE;
        a$a = STRING_TYPE;
        a$a = BOOLEAN_TYPE;
        a$a = DIMENSION_TYPE;
        a$a = REFERENCE_TYPE;
        a$a[] a$aArray = new a$a[]{a$a, a$a, a$a, a$a, a$a, a$a, a$a, a$a};
        return a$aArray;
    }

    static {
        a$a a$a;
        INT_TYPE = a$a = new a$a("INT_TYPE", 0);
        FLOAT_TYPE = a$a = new a$a("FLOAT_TYPE", 1);
        COLOR_TYPE = a$a = new a$a("COLOR_TYPE", 2);
        COLOR_DRAWABLE_TYPE = a$a = new a$a("COLOR_DRAWABLE_TYPE", 3);
        STRING_TYPE = a$a = new a$a("STRING_TYPE", 4);
        BOOLEAN_TYPE = a$a = new a$a("BOOLEAN_TYPE", 5);
        DIMENSION_TYPE = a$a = new a$a("DIMENSION_TYPE", 6);
        REFERENCE_TYPE = a$a = new a$a("REFERENCE_TYPE", 7);
        $VALUES = a$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a$a() {
        void var2_-1;
        void var1_-1;
    }

    public static a$a valueOf(String string2) {
        return Enum.valueOf(a$a.class, string2);
    }

    public static a$a[] values() {
        return (a$a[])$VALUES.clone();
    }
}

