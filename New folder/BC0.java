/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeConfirmedActivity;
import kotlin.jvm.internal.Intrinsics;

public final class BC0
implements View.OnClickListener {
    public final /* synthetic */ ExchangeConfirmedActivity a;

    public /* synthetic */ BC0(ExchangeConfirmedActivity exchangeConfirmedActivity) {
        this.a = exchangeConfirmedActivity;
    }

    public final void onClick(View view) {
        ExchangeConfirmedActivity exchangeConfirmedActivity = this.a;
        Intrinsics.checkNotNullParameter(exchangeConfirmedActivity, "this$0");
        at2_1.e((Context)exchangeConfirmedActivity);
    }
}

