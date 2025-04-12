/*
 * Decompiled with CFR 0.152.
 */
public final class HI3$m
extends n23 {
    public final String createQuery() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}

