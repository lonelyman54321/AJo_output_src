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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BO2
 */
public final class bo2_0
extends RecyclerView$B {
    public final EpoxyCustomerPhotosReviewsBinding a;
    public final yi2_1 b;
    public final hd2_0 c;

    public bo2_0(EpoxyCustomerPhotosReviewsBinding epoxyCustomerPhotosReviewsBinding, yi2_1 yi2_12, hd2_0 hd2_02) {
        Intrinsics.checkNotNullParameter(epoxyCustomerPhotosReviewsBinding, "binding");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewClickListener");
        ConstraintLayout constraintLayout = epoxyCustomerPhotosReviewsBinding.getRoot();
        super((View)constraintLayout);
        this.a = epoxyCustomerPhotosReviewsBinding;
        this.b = yi2_12;
        this.c = hd2_02;
    }

    public final void w() {
        ComposeView composeView = this.a.composeView;
        AO2 aO2 = new AO2(this);
        u10 u102 = new u10(1307962009, aO2, true);
        composeView.setContent(u102);
    }
}

