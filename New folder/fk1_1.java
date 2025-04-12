/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import in.juspay.hypersdk.core.JBridge;
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from Fk1
 */
public final class fk1_1
implements Runnable {
    public final /* synthetic */ JBridge a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Drawable c;
    public final /* synthetic */ SdkTracker d;

    public /* synthetic */ fk1_1(JBridge jBridge, int n3, Drawable drawable2, SdkTracker sdkTracker) {
        this.a = jBridge;
        this.b = n3;
        this.c = drawable2;
        this.d = sdkTracker;
    }

    public final void run() {
        Drawable drawable2 = this.c;
        SdkTracker sdkTracker = this.d;
        JBridge jBridge = this.a;
        int n3 = this.b;
        JBridge.p(jBridge, n3, drawable2, sdkTracker);
    }
}

