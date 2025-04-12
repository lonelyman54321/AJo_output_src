/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d22
 */
public final class d22_0
implements Function0 {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ d22_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final Object invoke() {
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        newProductDetailsFragment = newProductDetailsFragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(newProductDetailsFragment, "getApplication(...)");
        bD2 bD22 = new bD2((Context)newProductDetailsFragment);
        ZC2 zC2 = new ZC2(bD22);
        return zC2;
    }
}

