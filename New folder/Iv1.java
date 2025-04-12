/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class Iv1 {
    public static final AtomicLong b;
    public final Map a;

    static {
        AtomicLong atomicLong;
        b = atomicLong = new AtomicLong();
    }

    public Iv1(long l2, ti0_1 ti0_12, long l3) {
        Object object = ti0_12.a;
        object = Collections.emptyMap();
        this((Map)object);
    }

    public Iv1(Map map2) {
        this.a = map2;
    }
}

