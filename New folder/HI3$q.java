/*
 * Decompiled with CFR 0.152.
 */
public final class HI3$q
extends n23 {
    public final String createQuery() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}

