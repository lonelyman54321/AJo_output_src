/*
 * Decompiled with CFR 0.152.
 */
public final class HI3$c
extends n23 {
    public final String createQuery() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}

