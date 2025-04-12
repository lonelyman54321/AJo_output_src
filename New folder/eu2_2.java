/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from EU2
 */
public final class eu2_2
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    public /* synthetic */ eu2_2(SdkTracker sdkTracker, String string2, String string3, String string4, Object object) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = object;
    }

    public final void run() {
        String string2 = this.d;
        Object object = this.e;
        SdkTracker sdkTracker = this.a;
        String string3 = this.b;
        String string4 = this.c;
        SdkTracker.l(sdkTracker, string3, string4, string2, object);
    }
}

