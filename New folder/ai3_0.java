/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aI3
 */
public final class ai3_0
extends XO1 {
    public final void migrate(xg3_1 xg3_12) {
        xg3_12.o("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}

