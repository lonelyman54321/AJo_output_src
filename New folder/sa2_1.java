/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sa2
 */
public final class sa2_1
implements Function0 {
    public final /* synthetic */ OrderConfirmationActivity a;

    public /* synthetic */ sa2_1(OrderConfirmationActivity orderConfirmationActivity) {
        this.a = orderConfirmationActivity;
    }

    public final Object invoke() {
        OrderConfirmationActivity orderConfirmationActivity = this.a;
        Intrinsics.checkNotNullParameter(orderConfirmationActivity, "this$0");
        return UserInformation.getInstance((Context)orderConfirmationActivity);
    }
}

