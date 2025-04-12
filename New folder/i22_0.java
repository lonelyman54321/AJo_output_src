/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from i22
 */
public final class i22_0
implements Function0 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ i22_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final Object invoke() {
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        return newProductDetailsFragment.requireActivity().getApplication();
    }
}

