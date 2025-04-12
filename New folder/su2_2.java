/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from sU2
 */
public final class su2_2
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Throwable e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;

    public /* synthetic */ su2_2(SdkTracker sdkTracker, String string2, String string3, String string4, Throwable throwable, String string5, String string6) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = throwable;
        this.f = string5;
        this.g = string6;
    }

    public final void run() {
        String string2 = this.f;
        String string3 = this.g;
        SdkTracker sdkTracker = this.a;
        String string4 = this.b;
        String string5 = this.c;
        String string6 = this.d;
        Throwable throwable = this.e;
        SdkTracker.s(sdkTracker, string4, string5, string6, throwable, string2, string3);
    }
}

