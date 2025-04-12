/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.payment.activity.Hilt_OrderConfirmationActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;

/*
 * Renamed from a61
 */
public final class a61_0
implements u82_0 {
    public final /* synthetic */ Hilt_OrderConfirmationActivity a;

    public a61_0(Hilt_OrderConfirmationActivity hilt_OrderConfirmationActivity) {
        this.a = hilt_OrderConfirmationActivity;
    }

    public final void a(Context object) {
        object = this.a;
        boolean bl2 = ((Hilt_OrderConfirmationActivity)object).k0;
        if (!bl2) {
            ((Hilt_OrderConfirmationActivity)object).k0 = bl2 = true;
            ya2_0 ya2_02 = (ya2_0)((Hilt_OrderConfirmationActivity)object).generatedComponent();
            object = (OrderConfirmationActivity)object;
            ya2_02.getClass();
        }
    }
}

