/*
 * Decompiled with CFR 0.152.
 */
public class wH3
extends Enum {
    private static final /* synthetic */ wH3[] $VALUES;
    public static final /* enum */ wH3 BOOL;
    public static final /* enum */ wH3 BYTES;
    public static final /* enum */ wH3 DOUBLE;
    public static final /* enum */ wH3 ENUM;
    public static final /* enum */ wH3 FIXED32;
    public static final /* enum */ wH3 FIXED64;
    public static final /* enum */ wH3 FLOAT;
    public static final /* enum */ wH3 GROUP;
    public static final /* enum */ wH3 INT32;
    public static final /* enum */ wH3 INT64;
    public static final /* enum */ wH3 MESSAGE;
    public static final /* enum */ wH3 SFIXED32;
    public static final /* enum */ wH3 SFIXED64;
    public static final /* enum */ wH3 SINT32;
    public static final /* enum */ wH3 SINT64;
    public static final /* enum */ wH3 STRING;
    public static final /* enum */ wH3 UINT32;
    public static final /* enum */ wH3 UINT64;
    private final xH3 javaType;
    private final int wireType;

    static {
        wH3 wH32;
        wH3 wH33;
        wH3 wH34;
        wH3 wH35;
        wH3 wH36;
        wH3 wH37;
        Enum enum_ = xH3.DOUBLE;
        int n3 = 1;
        DOUBLE = wH37 = new wH3("DOUBLE", 0, (xH3)enum_, n3);
        Enum enum_2 = xH3.FLOAT;
        int n4 = 5;
        FLOAT = enum_ = new wH3("FLOAT", n3, (xH3)enum_2, n4);
        wH3[] wH3Array = xH3.LONG;
        int n7 = 2;
        INT64 = enum_2 = new wH3("INT64", n7, (xH3)wH3Array, 0);
        int n8 = 3;
        UINT64 = wH36 = new wH3("UINT64", n8, (xH3)wH3Array, 0);
        xH3 xH32 = xH3.INT;
        INT32 = wH35 = new wH3("INT32", 4, xH32, 0);
        FIXED64 = wH34 = new wH3("FIXED64", n4, (xH3)wH3Array, n3);
        FIXED32 = wH33 = new wH3("FIXED32", 6, xH32, n4);
        Enum enum_3 = xH3.BOOLEAN;
        BOOL = wH32 = new wH3("BOOL", 7, (xH3)enum_3, 0);
        xH3 xH33 = xH3.STRING;
        STRING = enum_3 = new wH3$a(xH33, n7);
        xH33 = xH3.MESSAGE;
        Enum enum_4 = new wH3$b(xH33, n8);
        GROUP = enum_4;
        wH3$b wH3$b = enum_4;
        int n10 = 2;
        wH3 wH38 = new wH3$c(xH33, n10);
        MESSAGE = wH38;
        Enum enum_5 = xH3.BYTE_STRING;
        wH3$c wH3$c = wH38;
        wH3 wH39 = new wH3$d((xH3)enum_5, n10);
        BYTES = wH39;
        enum_4 = new wH3("UINT32", 12, xH32, 0);
        UINT32 = enum_4;
        wH3 wH310 = enum_4;
        enum_4 = xH3.ENUM;
        wH3$d wH3$d = wH39;
        wH38 = new wH3("ENUM", 13, (xH3)enum_4, 0);
        ENUM = wH38;
        SFIXED32 = enum_4 = new wH3("SFIXED32", 14, xH32, 5);
        Enum enum_6 = enum_4;
        wH39 = new wH3("SFIXED64", 15, (xH3)wH3Array, 1);
        SFIXED64 = wH39;
        SINT32 = enum_4 = new wH3("SINT32", 16, xH32, 0);
        int n14 = 17;
        SINT64 = enum_5 = new wH3("SINT64", n14, (xH3)wH3Array, 0);
        wH3Array = new wH3[18];
        wH3Array[0] = wH37;
        wH3Array[1] = enum_;
        wH3Array[2] = enum_2;
        wH3Array[3] = wH36;
        wH3Array[4] = wH35;
        wH3Array[5] = wH34;
        wH3Array[6] = wH33;
        wH3Array[7] = wH32;
        wH3Array[8] = enum_3;
        wH3Array[9] = wH3$b;
        wH3Array[10] = wH3$c;
        wH3Array[11] = wH3$d;
        wH3Array[12] = wH310;
        wH3Array[13] = wH38;
        wH3Array[14] = enum_6;
        wH3Array[15] = wH39;
        wH3Array[16] = enum_4;
        wH3Array[n14] = enum_5;
        $VALUES = wH3Array;
    }

    /*
     * WARNING - void declaration
     */
    private wH3() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.javaType = var3_2;
        this.wireType = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ wH3(xH3 xH32, int n3, vH3 vH32) {
        this((String)var1_-1, n3, (xH3)((Object)vH32), (int)var4_3);
        void var4_3;
        void var1_-1;
    }

    public static wH3 valueOf(String string2) {
        return Enum.valueOf(wH3.class, string2);
    }

    public static wH3[] values() {
        return (wH3[])$VALUES.clone();
    }

    public xH3 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }
}

