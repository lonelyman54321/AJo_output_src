/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.JBridge;
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from Hk1
 */
public final class hk1_2
implements Runnable {
    public final /* synthetic */ JBridge a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ SdkTracker g;

    public /* synthetic */ hk1_2(JBridge jBridge, int n3, String string2, boolean bl2, float f5, float f6, SdkTracker sdkTracker) {
        this.a = jBridge;
        this.b = n3;
        this.c = string2;
        this.d = bl2;
        this.e = f5;
        this.f = f6;
        this.g = sdkTracker;
    }

    public final void run() {
        float f5 = this.f;
        SdkTracker sdkTracker = this.g;
        JBridge jBridge = this.a;
        int n3 = this.b;
        String string2 = this.c;
        boolean bl2 = this.d;
        float f6 = this.e;
        JBridge.n(jBridge, n3, string2, bl2, f6, f5, sdkTracker);
    }
}

