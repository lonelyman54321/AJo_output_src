/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.payment.fragment.CheckoutFragment;
import kotlin.jvm.internal.Intrinsics;

public final class wT
implements Runnable {
    public final /* synthetic */ CheckoutFragment a;

    public /* synthetic */ wT(CheckoutFragment checkoutFragment) {
        this.a = checkoutFragment;
    }

    public final void run() {
        CheckoutFragment checkoutFragment = this.a;
        Intrinsics.checkNotNullParameter(checkoutFragment, "this$0");
        ys_1 ys_12 = checkoutFragment.o;
        if (ys_12 != null) {
            ys_12.notifyDataSetChanged();
        }
    }
}

