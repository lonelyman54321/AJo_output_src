/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.services.HyperServices;

/*
 * Renamed from bc1
 */
public final class bc1_2
implements Runnable {
    public final /* synthetic */ HyperServices a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ bc1_2(HyperServices hyperServices, Throwable throwable) {
        this.a = hyperServices;
        this.b = throwable;
    }

    public final void run() {
        HyperServices hyperServices = this.a;
        Throwable throwable = this.b;
        HyperServices.d(hyperServices, throwable);
    }
}

