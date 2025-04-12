/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.core.SdkTracker;

/*
 * Renamed from DU2
 */
public final class du2_2
implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ du2_2(String string2, String string3, Throwable throwable, String string4, String string5, String string6) {
        this.a = string2;
        this.b = string3;
        this.c = throwable;
        this.d = string4;
        this.e = string5;
        this.f = string6;
    }

    public final void run() {
        String string2 = this.e;
        String string3 = this.f;
        String string4 = this.a;
        String string5 = this.b;
        Throwable throwable = this.c;
        String string6 = this.d;
        SdkTracker.o(string4, string5, throwable, string6, string2, string3);
    }
}

