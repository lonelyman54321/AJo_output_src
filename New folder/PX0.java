/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.util.concurrent.Futures;
import in.juspay.hypersdk.analytics.LogSessioniser;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

public final class PX0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ PX0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                LogSessioniser.g((LogSessioniser)this.b);
                return;
            }
            case 0: 
        }
        Futures.b((ScheduledFuture)((Future)this.b));
    }
}

