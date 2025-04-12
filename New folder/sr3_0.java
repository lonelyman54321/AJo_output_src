/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.perf.transport.TransportManager;
import com.jio.jioads.adinterfaces.JioAdView;

/*
 * Renamed from Sr3
 */
public final class sr3_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr3_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                JioAdView.b((JioAdView)this.b);
                return;
            }
            case 0: 
        }
        TransportManager.e((TransportManager)this.b);
    }
}

