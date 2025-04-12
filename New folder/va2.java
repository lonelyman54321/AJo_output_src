/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity$a;

public final class va2
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;

    public /* synthetic */ va2(View view, String string2) {
        this.a = view;
        this.b = string2;
    }

    public final void run() {
        OrderConfirmationActivity$a orderConfirmationActivity$a = OrderConfirmationActivity.Companion;
        orderConfirmationActivity$a = this.a;
        if (orderConfirmationActivity$a != null) {
            String string2 = this.b;
            orderConfirmationActivity$a.setContentDescription(string2);
        }
        if (orderConfirmationActivity$a != null) {
            ai0_2.a((View)orderConfirmationActivity$a);
        }
    }
}

