/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.session.gauges.MemoryGaugeCollector;
import com.google.firebase.perf.util.Timer;

/*
 * Renamed from TN1
 */
public final class tn1_1
implements Runnable {
    public final /* synthetic */ MemoryGaugeCollector a;
    public final /* synthetic */ Timer b;

    public /* synthetic */ tn1_1(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        this.a = memoryGaugeCollector;
        this.b = timer;
    }

    public final void run() {
        MemoryGaugeCollector memoryGaugeCollector = this.a;
        Timer timer = this.b;
        MemoryGaugeCollector.a(memoryGaugeCollector, timer);
    }
}

