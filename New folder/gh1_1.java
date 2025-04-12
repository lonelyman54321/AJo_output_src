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
import com.ril.ajio.myaccount.order.MarkDeliveredActivity;
import com.ril.ajio.web.CustomWebViewActivity;

/*
 * Renamed from gH1
 */
public final class gh1_1
implements View.OnClickListener {
    public final /* synthetic */ MarkDeliveredActivity a;

    public /* synthetic */ gh1_1(MarkDeliveredActivity markDeliveredActivity) {
        this.a = markDeliveredActivity;
    }

    public final void onClick(View object) {
        object = this.a;
        object.getClass();
        CustomWebViewActivity.H2((Context)object, 14, "https://www.ajio.com/_ui/desktop/theme-rilfnl/images/returnExchange_invoice_help.jpg");
    }
}

