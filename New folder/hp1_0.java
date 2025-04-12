/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hP1
 */
public final class hp1_0
extends XO1 {
    public static final hp1_0 a;

    static {
        hp1_0 hp1_02;
        a = hp1_02 = new XO1(8, 9);
    }

    public final void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        xg3_12.o("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}

