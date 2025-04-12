/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogChannelExp;
import in.juspay.hypersdk.analytics.LogPusherExp;

/*
 * Renamed from Uw1
 */
public final class uw1_2
implements Runnable {
    public final /* synthetic */ LogPusherExp a;
    public final /* synthetic */ String b;
    public final /* synthetic */ LogChannelExp c;

    public /* synthetic */ uw1_2(LogPusherExp logPusherExp, String string2, LogChannelExp logChannelExp) {
        this.a = logPusherExp;
        this.b = string2;
        this.c = logChannelExp;
    }

    public final void run() {
        String string2 = this.b;
        LogChannelExp logChannelExp = this.c;
        LogPusherExp.c(this.a, string2, logChannelExp);
    }
}

