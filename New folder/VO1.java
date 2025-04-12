/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.metrics.MetricsUseCaseImpl;

public final class VO1
implements Runnable {
    public final /* synthetic */ MetricsUseCaseImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ VO1(MetricsUseCaseImpl metricsUseCaseImpl, String string2, String string3) {
        this.a = metricsUseCaseImpl;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        String string2 = this.b;
        String string3 = this.c;
        MetricsUseCaseImpl.b(this.a, string2, string3);
    }
}

