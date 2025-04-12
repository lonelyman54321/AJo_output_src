/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from on1
 */
public final class on1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ on1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                SdkTracker.h((String)this.b);
                return;
            }
            case 0: 
        }
        JuspayServices.l((JuspayServices)this.b);
    }
}

