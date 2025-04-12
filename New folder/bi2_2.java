/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Renamed from bI2
 */
public final class bi2_2
extends Enum
implements fo0_2 {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ bi2_2[] $VALUES;
    public static final /* enum */ bi2_2 CANON_EQ;
    public static final /* enum */ bi2_2 COMMENTS;
    public static final /* enum */ bi2_2 DOT_MATCHES_ALL;
    public static final /* enum */ bi2_2 IGNORE_CASE;
    public static final /* enum */ bi2_2 LITERAL;
    public static final /* enum */ bi2_2 MULTILINE;
    public static final /* enum */ bi2_2 UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ bi2_2[] $values() {
        bi2_2 bi2_22 = IGNORE_CASE;
        bi2_22 = MULTILINE;
        bi2_22 = LITERAL;
        bi2_22 = UNIX_LINES;
        bi2_22 = COMMENTS;
        bi2_22 = DOT_MATCHES_ALL;
        bi2_22 = CANON_EQ;
        bi2_2[] bi2_2Array = new bi2_2[]{bi2_22, bi2_22, bi2_22, bi2_22, bi2_22, bi2_22, bi2_22};
        return bi2_2Array;
    }

    static {
        Enum[] enumArray;
        int n3 = 2;
        Enum[] enumArray2 = enumArray;
        enumArray = new bi2_2("IGNORE_CASE", 0, n3, 0, 2, null);
        IGNORE_CASE = enumArray;
        int n4 = 2;
        enumArray2 = new bi2_2("MULTILINE", 1, 8, 0, n4, null);
        MULTILINE = enumArray2;
        int n7 = 2;
        enumArray2 = new bi2_2("LITERAL", n3, 16, 0, n7, null);
        LITERAL = enumArray2;
        enumArray2 = new bi2_2("UNIX_LINES", 3, 1, 0, n4, null);
        UNIX_LINES = enumArray2;
        enumArray2 = new bi2_2("COMMENTS", 4, 4, 0, n7, null);
        COMMENTS = enumArray2;
        enumArray2 = new bi2_2("DOT_MATCHES_ALL", 5, 32, 0, n4, null);
        DOT_MATCHES_ALL = enumArray2;
        enumArray2 = new bi2_2("CANON_EQ", 6, 128, 0, n7, null);
        CANON_EQ = enumArray2;
        enumArray2 = bi2_2.$values();
        $VALUES = enumArray2;
        $ENTRIES = ha0_2.a(enumArray2);
    }

    /*
     * WARNING - void declaration
     */
    private bi2_2() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
        this.mask = var4_1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ bi2_2(int n3, int n4, int n7, DefaultConstructorMarker object) {
        void var1_-1;
        void var5_4;
        int n8 = var5_4 & 2;
        if (n8 != 0) {
            object = n7;
        }
        this((String)var1_-1, n4, n7, (int)object);
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static bi2_2 valueOf(String string2) {
        return Enum.valueOf(bi2_2.class, string2);
    }

    public static bi2_2[] values() {
        return (bi2_2[])$VALUES.clone();
    }

    public int getMask() {
        return this.mask;
    }

    public int getValue() {
        return this.value;
    }
}

