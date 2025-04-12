/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.ui.PlayerView;
import in.juspay.hypersdk.analytics.LogManager;

/*
 * Renamed from Gw1
 */
public final class gw1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gw1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((PlayerView)((Object)this.b)).invalidate();
                return;
            }
            case 0: 
        }
        LogManager.b((LogManager)this.b);
    }
}

