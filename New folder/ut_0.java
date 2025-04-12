/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uT
 */
public final class ut_0
implements Function0 {
    public final /* synthetic */ CheckoutFragment a;

    public /* synthetic */ ut_0(CheckoutFragment checkoutFragment) {
        this.a = checkoutFragment;
    }

    public final Object invoke() {
        CheckoutFragment checkoutFragment = this.a;
        Intrinsics.checkNotNullParameter(checkoutFragment, "this$0");
        checkoutFragment = checkoutFragment.requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(checkoutFragment, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)checkoutFragment);
        return jo_22;
    }
}

