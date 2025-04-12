/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogSessioniser;

/*
 * Renamed from dx1
 */
public final class dx1_2
implements Runnable {
    public final /* synthetic */ LogSessioniser a;

    public /* synthetic */ dx1_2(LogSessioniser logSessioniser) {
        this.a = logSessioniser;
    }

    public final void run() {
        LogSessioniser.b(this.a);
    }
}

