/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogManager;

/*
 * Renamed from Iw1
 */
public final class iw1_2
implements Runnable {
    public final /* synthetic */ LogManager a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ iw1_2(LogManager logManager, boolean bl2) {
        this.a = logManager;
        this.b = bl2;
    }

    public final void run() {
        LogManager logManager = this.a;
        boolean bl2 = this.b;
        LogManager.c(logManager, bl2);
    }
}

