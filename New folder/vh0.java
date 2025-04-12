/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.databinding.EpoxyCustomerPhotosReviewsBinding;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class vh0
extends RecyclerView$B {
    public final EpoxyCustomerPhotosReviewsBinding a;
    public final hd2_0 b;

    public vh0(EpoxyCustomerPhotosReviewsBinding epoxyCustomerPhotosReviewsBinding, hd2_0 hd2_02) {
        Intrinsics.checkNotNullParameter(epoxyCustomerPhotosReviewsBinding, "binding");
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewClickListener");
        ConstraintLayout constraintLayout = epoxyCustomerPhotosReviewsBinding.getRoot();
        super((View)constraintLayout);
        this.a = epoxyCustomerPhotosReviewsBinding;
        this.b = hd2_02;
    }

    public final void w(yi2_1 object, ArrayList arrayList, Function0 function0) {
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(arrayList, "thumbnailArray");
        ComposeView composeView = this.a.composeView;
        uh0_1 uh0_12 = new uh0_1((yi2_1)object, arrayList, function0, this);
        object = new u10(-1814175457, uh0_12, true);
        composeView.setContent((Function2)object);
    }
}

