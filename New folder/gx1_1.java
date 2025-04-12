/*
 * Decompiled with CFR 0.152.
 */
import com.appsflyer.AFLogger;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import in.juspay.hypersdk.analytics.LogPusherExp;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from gx1
 */
public final class gx1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gx1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                AFLogger.a((Function1)this.b);
                return;
            }
            case 1: {
                PDPStylingIdeasVideoHolder.d((PDPStylingIdeasVideoHolder)this.b);
                return;
            }
            case 0: 
        }
        ((LogPusherExp)this.b).stopLogPusherOnTerminate();
    }
}

