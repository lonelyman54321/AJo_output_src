/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from wU2
 */
public final class wu2_1
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Throwable f;

    public /* synthetic */ wu2_1(SdkTracker sdkTracker, String string2, String string3, String string4, String string5, Throwable throwable) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = throwable;
    }

    public final void run() {
        String string2 = this.e;
        Throwable throwable = this.f;
        SdkTracker sdkTracker = this.a;
        String string3 = this.b;
        String string4 = this.c;
        String string5 = this.d;
        SdkTracker.q(sdkTracker, string3, string4, string5, string2, throwable);
    }
}

