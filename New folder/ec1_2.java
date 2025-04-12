/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogPusherExp;
import in.juspay.services.HyperServices;

/*
 * Renamed from ec1
 */
public final class ec1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((LogPusherExp)this.b).clearBacklog();
                return;
            }
            case 0: 
        }
        HyperServices.b((HyperServices)this.b);
    }
}

