/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cP1
 */
public final class cp1_1
extends XO1 {
    public static final cp1_1 a;

    static {
        cp1_1 cp1_12;
        a = cp1_12 = new XO1(1, 2);
    }

    public final void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        xg3_12.o("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        xg3_12.o("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        xg3_12.o("DROP TABLE IF EXISTS alarmInfo");
        xg3_12.o("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}

