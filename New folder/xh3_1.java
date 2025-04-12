/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XH3
 */
public final class xh3_1
extends XO1 {
    public final void migrate(xg3_1 xg3_12) {
        xg3_12.o("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        xg3_12.o("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}

