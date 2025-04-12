/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;

/*
 * Renamed from Tr3
 */
public final class tr3_0
implements Runnable {
    public final /* synthetic */ TransportManager a;
    public final /* synthetic */ GaugeMetric b;
    public final /* synthetic */ ApplicationProcessState c;

    public /* synthetic */ tr3_0(TransportManager transportManager, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.a = transportManager;
        this.b = gaugeMetric;
        this.c = applicationProcessState;
    }

    public final void run() {
        GaugeMetric gaugeMetric = this.b;
        ApplicationProcessState applicationProcessState = this.c;
        TransportManager.f(this.a, gaugeMetric, applicationProcessState);
    }
}

