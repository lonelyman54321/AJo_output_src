/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from nU2
 */
public final class nu2_2
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nu2_2(SdkTracker sdkTracker, String string2, String string3, String string4, String string5, Object object) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = object;
    }

    public final void run() {
        String string2 = this.e;
        Object object = this.f;
        SdkTracker sdkTracker = this.a;
        String string3 = this.b;
        String string4 = this.c;
        String string5 = this.d;
        SdkTracker.j(sdkTracker, string3, string4, string5, string2, object);
    }
}

