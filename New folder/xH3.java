/*
 * Decompiled with CFR 0.152.
 */
public final class xH3
extends Enum {
    private static final /* synthetic */ xH3[] $VALUES;
    public static final /* enum */ xH3 BOOLEAN;
    public static final /* enum */ xH3 BYTE_STRING;
    public static final /* enum */ xH3 DOUBLE;
    public static final /* enum */ xH3 ENUM;
    public static final /* enum */ xH3 FLOAT;
    public static final /* enum */ xH3 INT;
    public static final /* enum */ xH3 LONG;
    public static final /* enum */ xH3 MESSAGE;
    public static final /* enum */ xH3 STRING;
    private final Object defaultDefault;

    static {
        xH3 xH32;
        xH3 xH33;
        xH3 xH34;
        Object object = 0;
        INT = xH34 = new xH3("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new xH3("LONG", n3, object2);
        LONG = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new xH3("FLOAT", n4, object3);
        FLOAT = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new xH3("DOUBLE", n7, object4);
        DOUBLE = object3;
        Object object5 = Boolean.FALSE;
        object4 = new xH3("BOOLEAN", 4, object5);
        BOOLEAN = object4;
        object5 = new xH3("STRING", 5, (Object)"");
        STRING = object5;
        Object object6 = DF.b;
        BYTE_STRING = xH33 = new xH3("BYTE_STRING", 6, object6);
        object6 = new xH3("ENUM", 7, null);
        ENUM = object6;
        int n8 = 8;
        MESSAGE = xH32 = new xH3("MESSAGE", n8, null);
        xH3[] xH3Array = new xH3[9];
        xH3Array[0] = xH34;
        xH3Array[n3] = object;
        xH3Array[n4] = object2;
        xH3Array[n7] = object3;
        xH3Array[4] = object4;
        xH3Array[5] = object5;
        xH3Array[6] = xH33;
        xH3Array[7] = object6;
        xH3Array[n8] = xH32;
        $VALUES = xH3Array;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xH3() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.defaultDefault = var3_2;
    }

    public static xH3 valueOf(String string2) {
        return Enum.valueOf(xH3.class, string2);
    }

    public static xH3[] values() {
        return (xH3[])$VALUES.clone();
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}

