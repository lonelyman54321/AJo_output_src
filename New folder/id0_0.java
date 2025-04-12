/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.session.gauges.CpuGaugeCollector;
import com.google.firebase.perf.util.Timer;

/*
 * Renamed from id0
 */
public final class id0_0
implements Runnable {
    public final /* synthetic */ CpuGaugeCollector a;
    public final /* synthetic */ Timer b;

    public /* synthetic */ id0_0(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        this.a = cpuGaugeCollector;
        this.b = timer;
    }

    public final void run() {
        CpuGaugeCollector cpuGaugeCollector = this.a;
        Timer timer = this.b;
        CpuGaugeCollector.a(cpuGaugeCollector, timer);
    }
}

