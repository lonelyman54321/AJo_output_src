/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

public final class UV$a$a
implements uv_0 {
    public final long a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long l2 = this.currentTimeMillis();
        return timeUnit.toSeconds(l2);
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

