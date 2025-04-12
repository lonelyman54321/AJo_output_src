/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.DuiInterface;
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from nw0
 */
public final class nw0_2
implements Runnable {
    public final /* synthetic */ DuiInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SdkTracker d;

    public /* synthetic */ nw0_2(DuiInterface duiInterface, String string2, String string3, SdkTracker sdkTracker) {
        this.a = duiInterface;
        this.b = string2;
        this.c = string3;
        this.d = sdkTracker;
    }

    public final void run() {
        String string2 = this.c;
        SdkTracker sdkTracker = this.d;
        DuiInterface duiInterface = this.a;
        String string3 = this.b;
        DuiInterface.i(duiInterface, string3, string2, sdkTracker);
    }
}

