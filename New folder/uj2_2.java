/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.holders.PDPVideoKYPHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uj2
 */
public final class uj2_2
implements Runnable {
    public final /* synthetic */ PDPVideoKYPHolder a;

    public /* synthetic */ uj2_2(PDPVideoKYPHolder pDPVideoKYPHolder) {
        this.a = pDPVideoKYPHolder;
    }

    public final void run() {
        PDPVideoKYPHolder pDPVideoKYPHolder = this.a;
        Intrinsics.checkNotNullParameter(pDPVideoKYPHolder, "this$0");
        pDPVideoKYPHolder.x(true);
    }
}

