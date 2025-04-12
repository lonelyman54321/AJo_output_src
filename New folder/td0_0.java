/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TD0
 */
public final class td0_0
implements Runnable {
    public final /* synthetic */ ExchangeReturnVerifyActivity a;

    public /* synthetic */ td0_0(ExchangeReturnVerifyActivity exchangeReturnVerifyActivity) {
        this.a = exchangeReturnVerifyActivity;
    }

    public final void run() {
        Object object = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ExchangeReturnVerifyActivity)object).G0;
        if (object != null && (object = ((CustomToolbarViewMerger)object).getToolbar()) != null) {
            ai0_2.a((View)object);
        }
    }
}

