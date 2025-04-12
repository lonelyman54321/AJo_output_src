/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogPusher;

/*
 * Renamed from Qw1
 */
public final class qw1_2
implements Runnable {
    public final /* synthetic */ LogPusher a;
    public final /* synthetic */ Iterable b;

    public /* synthetic */ qw1_2(LogPusher logPusher, Iterable iterable) {
        this.a = logPusher;
        this.b = iterable;
    }

    public final void run() {
        LogPusher logPusher = this.a;
        Iterable iterable = this.b;
        LogPusher.f(logPusher, iterable);
    }
}

