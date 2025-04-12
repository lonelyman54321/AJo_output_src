/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from P12
 */
public final class p12_0
implements View.OnClickListener {
    public final /* synthetic */ NewProductDetailsFragment a;

    public /* synthetic */ p12_0(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void onClick(View object) {
        boolean bl2;
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "this$0");
        object = newProductDetailsFragment.getActivity();
        if (object != null && !(bl2 = (object = newProductDetailsFragment.requireActivity()).isFinishing())) {
            object = newProductDetailsFragment.requireActivity();
            ((ComponentActivity)object).onBackPressed();
        }
    }
}

