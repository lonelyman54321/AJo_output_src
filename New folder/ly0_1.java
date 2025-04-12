/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

/*
 * Renamed from LY0
 */
public final class ly0_1
implements Runnable {
    public final /* synthetic */ GaugeManager a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ApplicationProcessState c;

    public /* synthetic */ ly0_1(GaugeManager gaugeManager, String string2, ApplicationProcessState applicationProcessState) {
        this.a = gaugeManager;
        this.b = string2;
        this.c = applicationProcessState;
    }

    public final void run() {
        String string2 = this.b;
        ApplicationProcessState applicationProcessState = this.c;
        GaugeManager.d(this.a, string2, applicationProcessState);
    }
}

