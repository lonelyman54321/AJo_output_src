/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.Scheduler;
import io.reactivex.Scheduler$Worker;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;

/*
 * Renamed from A32
 */
public final class a32_0
extends Scheduler {
    public static final RxThreadFactory d;
    public final ThreadFactory c;

    static {
        RxThreadFactory rxThreadFactory;
        int n3 = Integer.getInteger("rx2.newthread-priority", 5);
        n3 = Math.min(10, n3);
        n3 = Math.max(1, n3);
        d = rxThreadFactory = new RxThreadFactory("RxNewThreadScheduler", n3, false);
    }

    public a32_0() {
        RxThreadFactory rxThreadFactory = d;
        this.c = rxThreadFactory;
    }

    public final Scheduler$Worker a() {
        ThreadFactory threadFactory = this.c;
        b32_0 b32_02 = new b32_0(threadFactory);
        return b32_02;
    }
}

