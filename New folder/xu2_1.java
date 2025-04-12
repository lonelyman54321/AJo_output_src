/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from xU2
 */
public final class xu2_1
implements Runnable {
    public final /* synthetic */ SdkTracker a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ String k;

    public /* synthetic */ xu2_1(SdkTracker sdkTracker, String string2, String string3, String string4, Integer n3, String string5, Long l2, Long l3, Object object, Object object2, String string6) {
        this.a = sdkTracker;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n3;
        this.f = string5;
        this.g = l2;
        this.h = l3;
        this.i = object;
        this.j = object2;
        this.k = string6;
    }

    public final void run() {
        Object object = this.j;
        String string2 = this.k;
        SdkTracker sdkTracker = this.a;
        String string3 = this.b;
        String string4 = this.c;
        String string5 = this.d;
        Integer n3 = this.e;
        String string6 = this.f;
        Long l2 = this.g;
        Long l3 = this.h;
        Object object2 = this.i;
        SdkTracker.d(sdkTracker, string3, string4, string5, n3, string6, l2, l3, object2, object, string2);
    }
}

