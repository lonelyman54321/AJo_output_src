/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from BU2
 */
public final class bu2_2
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Throwable e;

    public /* synthetic */ bu2_2(String string2, String string3, String string4, String string5, Throwable throwable) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = throwable;
    }

    public final void run() {
        String string2 = this.d;
        Throwable throwable = this.e;
        String string3 = this.a;
        String string4 = this.b;
        String string5 = this.c;
        SdkTracker.r(string3, string4, string5, string2, throwable);
    }
}

