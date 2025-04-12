/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gn2
 */
public final class gn2_2
implements Function0 {
    public final /* synthetic */ PaymentActivity a;

    public /* synthetic */ gn2_2(PaymentActivity paymentActivity) {
        this.a = paymentActivity;
    }

    public final Object invoke() {
        PaymentActivity paymentActivity = this.a;
        Intrinsics.checkNotNullParameter(paymentActivity, "this$0");
        return UserInformation.getInstance((Context)paymentActivity);
    }
}

