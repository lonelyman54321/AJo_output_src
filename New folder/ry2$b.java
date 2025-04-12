/*
 * Decompiled with CFR 0.152.
 */
public final class ry2$b
extends Enum {
    private static final /* synthetic */ ry2$b[] $VALUES;
    public static final /* enum */ ry2$b BOOLEAN;
    public static final /* enum */ ry2$b DOUBLE;
    public static final /* enum */ ry2$b FLOAT;
    public static final /* enum */ ry2$b INTEGER;
    public static final /* enum */ ry2$b LONG;
    public static final /* enum */ ry2$b STRING;
    public static final /* enum */ ry2$b STRING_SET;
    public static final /* enum */ ry2$b VALUE_NOT_SET;
    private final int value;

    static {
        ry2$b ry2$b;
        ry2$b ry2$b2;
        ry2$b ry2$b3;
        ry2$b ry2$b4;
        ry2$b ry2$b5;
        ry2$b ry2$b6;
        ry2$b ry2$b7;
        ry2$b ry2$b8;
        int n3 = 1;
        BOOLEAN = ry2$b8 = new ry2$b("BOOLEAN", 0, n3);
        int n4 = 2;
        FLOAT = ry2$b7 = new ry2$b("FLOAT", n3, n4);
        int n7 = 3;
        INTEGER = ry2$b6 = new ry2$b("INTEGER", n4, n7);
        int n8 = 4;
        LONG = ry2$b5 = new ry2$b("LONG", n7, n8);
        int n10 = 5;
        STRING = ry2$b4 = new ry2$b("STRING", n8, n10);
        int n14 = 6;
        STRING_SET = ry2$b3 = new ry2$b("STRING_SET", n10, n14);
        int n15 = 7;
        DOUBLE = ry2$b2 = new ry2$b("DOUBLE", n14, n15);
        VALUE_NOT_SET = ry2$b = new ry2$b("VALUE_NOT_SET", n15, 0);
        ry2$b[] ry2$bArray = new ry2$b[8];
        ry2$bArray[0] = ry2$b8;
        ry2$bArray[n3] = ry2$b7;
        ry2$bArray[n4] = ry2$b6;
        ry2$bArray[n7] = ry2$b5;
        ry2$bArray[n8] = ry2$b4;
        ry2$bArray[n10] = ry2$b3;
        ry2$bArray[6] = ry2$b2;
        ry2$bArray[n15] = ry2$b;
        $VALUES = ry2$bArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ry2$b() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ry2$b forNumber(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 7: {
                return DOUBLE;
            }
            case 6: {
                return STRING_SET;
            }
            case 5: {
                return STRING;
            }
            case 4: {
                return LONG;
            }
            case 3: {
                return INTEGER;
            }
            case 2: {
                return FLOAT;
            }
            case 1: {
                return BOOLEAN;
            }
            case 0: 
        }
        return VALUE_NOT_SET;
    }

    public static ry2$b valueOf(int n3) {
        return ry2$b.forNumber(n3);
    }

    public static ry2$b valueOf(String string2) {
        return Enum.valueOf(ry2$b.class, string2);
    }

    public static ry2$b[] values() {
        return (ry2$b[])$VALUES.clone();
    }

    public int getNumber() {
        return this.value;
    }
}

