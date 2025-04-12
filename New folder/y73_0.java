/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y73
 */
public final class y73_0
extends Enum {
    private static final /* synthetic */ y73_0[] $VALUES;
    private static final EnumSet ALL;
    public static final y73$a Companion;
    public static final /* enum */ y73_0 Enabled;
    public static final /* enum */ y73_0 None;
    public static final /* enum */ y73_0 RequireConfirm;
    private final long value;

    private static final /* synthetic */ y73_0[] $values() {
        y73_0 y73_02 = None;
        y73_02 = Enabled;
        y73_02 = RequireConfirm;
        y73_0[] y73_0Array = new y73_0[]{y73_02, y73_02, y73_02};
        return y73_0Array;
    }

    static {
        Object object;
        None = object = new y73_0("None", 0, 0L);
        Enabled = object = new y73_0("Enabled", 1, 1L);
        RequireConfirm = object = new y73_0("RequireConfirm", 2, (long)2);
        $VALUES = y73_0.$values();
        object = new Object();
        Companion = object;
        object = EnumSet.allOf(y73_0.class);
        Intrinsics.checkNotNullExpressionValue(object, "allOf(SmartLoginOption::class.java)");
        ALL = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private y73_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static final /* synthetic */ EnumSet access$getALL$cp() {
        return ALL;
    }

    public static final EnumSet parseOptions(long l2) {
        Companion.getClass();
        return y73$a.a(l2);
    }

    public static y73_0 valueOf(String string2) {
        return Enum.valueOf(y73_0.class, string2);
    }

    public static y73_0[] values() {
        return (y73_0[])$VALUES.clone();
    }

    public final long getValue() {
        return this.value;
    }
}

