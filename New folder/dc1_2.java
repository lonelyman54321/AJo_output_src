/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.services.HyperServices;

/*
 * Renamed from dc1
 */
public final class dc1_2
implements Runnable {
    public final /* synthetic */ HyperServices a;
    public final /* synthetic */ long b;

    public /* synthetic */ dc1_2(HyperServices hyperServices, long l2) {
        this.a = hyperServices;
        this.b = l2;
    }

    public final void run() {
        HyperServices hyperServices = this.a;
        long l2 = this.b;
        HyperServices.h(hyperServices, l2);
    }
}

