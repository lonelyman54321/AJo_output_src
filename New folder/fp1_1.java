/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fP1
 */
public final class fp1_1
extends XO1 {
    public static final fp1_1 a;

    static {
        fp1_1 fp1_12;
        a = fp1_12 = new XO1(6, 7);
    }

    public final void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        xg3_12.o("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}

