/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RD0
 */
public final class rd0_1
implements Runnable {
    public final /* synthetic */ ExchangeReturnVerifyActivity a;
    public final /* synthetic */ int b;

    public /* synthetic */ rd0_1(ExchangeReturnVerifyActivity exchangeReturnVerifyActivity, int n3) {
        this.a = exchangeReturnVerifyActivity;
        this.b = n3;
    }

    public final void run() {
        ExchangeReturnVerifyActivity exchangeReturnVerifyActivity = this.a;
        Intrinsics.checkNotNullParameter(exchangeReturnVerifyActivity, "this$0");
        RecyclerView recyclerView = exchangeReturnVerifyActivity.r0;
        Intrinsics.checkNotNull(recyclerView);
        int n3 = this.b;
        recyclerView.smoothScrollToPosition(n3);
    }
}

