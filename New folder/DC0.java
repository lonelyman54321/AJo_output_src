/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Intent;
import android.view.View;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeConfirmedActivity;
import kotlin.jvm.internal.Intrinsics;

public final class DC0
implements View.OnClickListener {
    public final /* synthetic */ ExchangeConfirmedActivity a;

    public /* synthetic */ DC0(ExchangeConfirmedActivity exchangeConfirmedActivity) {
        this.a = exchangeConfirmedActivity;
    }

    public final void onClick(View view) {
        ExchangeConfirmedActivity exchangeConfirmedActivity = this.a;
        Intrinsics.checkNotNullParameter(exchangeConfirmedActivity, "this$0");
        view = new Intent();
        exchangeConfirmedActivity.setResult(-1, (Intent)view);
        exchangeConfirmedActivity.finish();
    }
}

