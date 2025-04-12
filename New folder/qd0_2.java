/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnVerifyActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QD0
 */
public final class qd0_2
implements Function0 {
    public final /* synthetic */ ExchangeReturnVerifyActivity a;

    public /* synthetic */ qd0_2(ExchangeReturnVerifyActivity exchangeReturnVerifyActivity) {
        this.a = exchangeReturnVerifyActivity;
    }

    public final Object invoke() {
        ExchangeReturnVerifyActivity exchangeReturnVerifyActivity = this.a;
        Intrinsics.checkNotNullParameter(exchangeReturnVerifyActivity, "this$0");
        exchangeReturnVerifyActivity = exchangeReturnVerifyActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(exchangeReturnVerifyActivity, "getApplication(...)");
        jo_2 jo_22 = new jo_2((Context)exchangeReturnVerifyActivity);
        return jo_22;
    }
}

