/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.NestedScrollView;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;

public final class q4
implements Runnable {
    public final /* synthetic */ AddAddressFragment a;

    public /* synthetic */ q4(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((AddAddressFragment)object).i;
        Intrinsics.checkNotNull(object);
        int n3 = object.getScrollX();
        n3 = 0 - n3;
        int n4 = object.getScrollY();
        n4 = 0 - n4;
        ((NestedScrollView)object).p(n3, n4, false);
    }
}

