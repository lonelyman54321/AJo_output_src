/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.DefaultConstructorMarker;

/*
 * Renamed from JW
 */
public final class jw_1
extends Enum {
    private static final /* synthetic */ jw_1[] $VALUES;
    public static final /* enum */ jw_1 PLAIN;
    public static final /* enum */ jw_1 S256;

    private static final /* synthetic */ jw_1[] $values() {
        jw_1 jw_12 = S256;
        jw_12 = PLAIN;
        jw_1[] jw_1Array = new jw_1[]{jw_12, jw_12};
        return jw_1Array;
    }

    static {
        jw_1 jw_12;
        String string2 = "S256";
        S256 = jw_12 = new jw_1(string2, 0, string2);
        PLAIN = jw_12 = new jw_1("PLAIN", 1, "plain");
        $VALUES = jw_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jw_1() {
        void var2_1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ jw_1(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var3_4;
        void var1_-1;
        void var4_5;
        int n4 = var4_5 & 1;
        if (n4 != 0) {
            String string3 = "S256";
        }
        this((String)var1_-1, n3, (String)var3_4);
    }

    public static jw_1 valueOf(String string2) {
        return Enum.valueOf(jw_1.class, string2);
    }

    public static jw_1[] values() {
        return (jw_1[])$VALUES.clone();
    }
}

