/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from R12
 */
public final class r12_0
implements View.OnClickListener {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ r12_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onClick(View object) {
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        object = newProductDetailsFragment.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cartClosetListener");
            object = null;
        }
        object.B0();
    }
}

