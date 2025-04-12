/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogPusherExp;

/*
 * Renamed from Ww1
 */
public final class ww1_1
implements Runnable {
    public final /* synthetic */ LogPusherExp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ ww1_1(LogPusherExp logPusherExp, String string2, String string3) {
        this.a = logPusherExp;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        String string2 = this.b;
        String string3 = this.c;
        LogPusherExp.b(this.a, string2, string3);
    }
}

