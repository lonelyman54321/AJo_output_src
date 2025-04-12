/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dt2
 */
public final class dt2_2
extends k1_0 {
    public final int d(int n3, int n4) {
        return ThreadLocalRandom.current().nextInt(n3, n4);
    }

    public final Random e() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Intrinsics.checkNotNullExpressionValue(threadLocalRandom, "current(...)");
        return threadLocalRandom;
    }
}

