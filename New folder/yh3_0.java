/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from YH3
 */
public final class yh3_0
extends XO1 {
    public final void migrate(xg3_1 xg3_12) {
        xg3_12.o("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}

