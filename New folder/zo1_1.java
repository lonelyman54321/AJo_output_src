/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZO1
 */
public final class zo1_1
extends XO1 {
    public static final zo1_1 a;

    static {
        zo1_1 zo1_12;
        a = zo1_12 = new XO1(12, 13);
    }

    public final void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        xg3_12.o("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        xg3_12.o("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}

