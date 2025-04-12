/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from tU2
 */
public final class tu2_2
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tu2_2(String string2, String string3, String string4, String string5, Object object) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = object;
    }

    public final void run() {
        String string2 = this.d;
        Object object = this.e;
        String string3 = this.a;
        String string4 = this.b;
        String string5 = this.c;
        SdkTracker.n(string3, string4, string5, string2, object);
    }
}

