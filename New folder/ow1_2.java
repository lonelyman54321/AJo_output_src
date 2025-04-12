/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogPusher;
import java.util.Queue;

/*
 * Renamed from Ow1
 */
public final class ow1_2
implements Runnable {
    public final /* synthetic */ LogPusher a;
    public final /* synthetic */ Queue b;

    public /* synthetic */ ow1_2(LogPusher logPusher, Queue queue) {
        this.a = logPusher;
        this.b = queue;
    }

    public final void run() {
        LogPusher logPusher = this.a;
        Queue queue = this.b;
        LogPusher.b(logPusher, queue);
    }
}

