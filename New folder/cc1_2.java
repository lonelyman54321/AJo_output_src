/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogPusherExp;

/*
 * Renamed from cc1
 */
public final class cc1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                LogPusherExp.h((LogPusherExp)this.b);
                return;
            }
            case 0: 
        }
        ((W72)this.b).remove();
    }
}

