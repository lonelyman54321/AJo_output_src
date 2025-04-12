/*
 * Decompiled with CFR 0.152.
 */
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFh1uSDK;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import in.juspay.hypersdk.analytics.LogSessioniserExp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hx1
 */
public final class hx1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hx1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                AFLogger.b((AFh1uSDK[])object);
                return;
            }
            case 1: {
                object = (PDPStylingIdeasVideoHolder)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                ((PDPStylingIdeasVideoHolder)object).e(true);
                return;
            }
            case 0: 
        }
        LogSessioniserExp.e((LogSessioniserExp)object);
    }
}

