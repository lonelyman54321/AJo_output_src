/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.session.gauges.MemoryGaugeCollector;
import com.google.firebase.perf.util.Timer;

/*
 * Renamed from UN1
 */
public final class un1_1
implements Runnable {
    public final /* synthetic */ MemoryGaugeCollector a;
    public final /* synthetic */ Timer b;

    public /* synthetic */ un1_1(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        this.a = memoryGaugeCollector;
        this.b = timer;
    }

    public final void run() {
        MemoryGaugeCollector memoryGaugeCollector = this.a;
        Timer timer = this.b;
        MemoryGaugeCollector.b(memoryGaugeCollector, timer);
    }
}

