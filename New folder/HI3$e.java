/*
 * Decompiled with CFR 0.152.
 */
public final class HI3$e
extends n23 {
    public final String createQuery() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}

