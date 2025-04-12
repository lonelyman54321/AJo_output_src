/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioVmapAdsLoader;
import in.juspay.hypersdk.core.JuspayServices;

/*
 * Renamed from fn1
 */
public final class fn1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fn1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                JioVmapAdsLoader.d((JioVmapAdsLoader)this.b);
                return;
            }
            case 0: 
        }
        JuspayServices.i((JuspayServices)this.b);
    }
}

