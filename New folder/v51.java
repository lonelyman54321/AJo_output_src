/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnControllerActivity;
import com.ril.ajio.myaccount.order.exchangereturn.activity.Hilt_ExchangeReturnControllerActivity;

public final class v51
implements u82_0 {
    public final /* synthetic */ Hilt_ExchangeReturnControllerActivity a;

    public v51(Hilt_ExchangeReturnControllerActivity hilt_ExchangeReturnControllerActivity) {
        this.a = hilt_ExchangeReturnControllerActivity;
    }

    public final void a(Context object) {
        object = this.a;
        boolean bl2 = ((Hilt_ExchangeReturnControllerActivity)object).k0;
        if (!bl2) {
            ((Hilt_ExchangeReturnControllerActivity)object).k0 = bl2 = true;
            kd0_1 kd0_12 = (kd0_1)((Hilt_ExchangeReturnControllerActivity)object).generatedComponent();
            object = (ExchangeReturnControllerActivity)object;
            kd0_12.getClass();
        }
    }
}

