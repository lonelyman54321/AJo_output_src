/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.metrics.MetricsUseCaseImpl;

public final class WO1
implements Runnable {
    public final /* synthetic */ MetricsUseCaseImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ WO1(MetricsUseCaseImpl metricsUseCaseImpl, String string2, long l2) {
        this.a = metricsUseCaseImpl;
        this.b = string2;
        this.c = l2;
    }

    public final void run() {
        String string2 = this.b;
        long l2 = this.c;
        MetricsUseCaseImpl.a(this.a, string2, l2);
    }
}

