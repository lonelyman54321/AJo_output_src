/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Jz0
 */
public final class jz0_1
extends Enum {
    private static final /* synthetic */ jz0_1[] $VALUES;
    public static final Jz0$a Companion;
    public static final /* enum */ jz0_1 ENDPOINT_A1;
    public static final /* enum */ jz0_1 ENDPOINT_DEFINE_VARS;
    public static final /* enum */ jz0_1 ENDPOINT_HELLO;
    public static final /* enum */ jz0_1 ENDPOINT_SPIKY;
    private final String identifier;

    private static final /* synthetic */ jz0_1[] $values() {
        jz0_1 jz0_12 = ENDPOINT_SPIKY;
        jz0_12 = ENDPOINT_A1;
        jz0_12 = ENDPOINT_HELLO;
        jz0_12 = ENDPOINT_DEFINE_VARS;
        jz0_1[] jz0_1Array = new jz0_1[]{jz0_12, jz0_12, jz0_12, jz0_12};
        return jz0_1Array;
    }

    static {
        Object object;
        ENDPOINT_SPIKY = object = new jz0_1("ENDPOINT_SPIKY", 0, "-spiky");
        ENDPOINT_A1 = object = new jz0_1("ENDPOINT_A1", 1, "/a1");
        ENDPOINT_HELLO = object = new jz0_1("ENDPOINT_HELLO", 2, "/hello");
        ENDPOINT_DEFINE_VARS = object = new jz0_1("ENDPOINT_DEFINE_VARS", 3, "/defineVars");
        $VALUES = jz0_1.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private jz0_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.identifier = var3_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final jz0_1 fromEventGroup(FB0 object) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(object, "eventGroup");
        int[] nArray = Jz0$a$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) return ENDPOINT_SPIKY;
        n4 = 2;
        if (n3 == n4) return ENDPOINT_A1;
        n4 = 3;
        if (n3 == n4) {
            return ENDPOINT_DEFINE_VARS;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public static final jz0_1 fromString(String string2) {
        jz0_1 jz0_122;
        block3: {
            Companion.getClass();
            Intrinsics.checkNotNullParameter(string2, "identifier");
            for (jz0_1 jz0_122 : jz0_1.values()) {
                String string3 = jz0_122.getIdentifier();
                boolean bl2 = StringsKt.F(string2, string3, false);
                if (!bl2) {
                    continue;
                }
                break block3;
            }
            jz0_122 = null;
        }
        if (jz0_122 == null) {
            jz0_122 = ENDPOINT_A1;
        }
        return jz0_122;
    }

    public static jz0_1 valueOf(String string2) {
        return Enum.valueOf(jz0_1.class, string2);
    }

    public static jz0_1[] values() {
        return (jz0_1[])$VALUES.clone();
    }

    public final String getIdentifier() {
        return this.identifier;
    }
}

