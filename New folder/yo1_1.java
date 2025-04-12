/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YO1
 */
public final class yo1_1
extends XO1 {
    public static final yo1_1 a;

    static {
        yo1_1 yo1_12;
        a = yo1_12 = new XO1(11, 12);
    }

    public final void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        xg3_12.o("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}

