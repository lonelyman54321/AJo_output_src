/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

/*
 * Renamed from MY0
 */
public final class my0_0
implements Runnable {
    public final /* synthetic */ GaugeManager a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ApplicationProcessState c;

    public /* synthetic */ my0_0(GaugeManager gaugeManager, String string2, ApplicationProcessState applicationProcessState) {
        this.a = gaugeManager;
        this.b = string2;
        this.c = applicationProcessState;
    }

    public final void run() {
        String string2 = this.b;
        ApplicationProcessState applicationProcessState = this.c;
        GaugeManager.a(this.a, string2, applicationProcessState);
    }
}

