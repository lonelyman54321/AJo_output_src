/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

public final class lv$a
extends RecyclerView$B {
    public final t82_0 a;
    public final yi2_1 b;

    public lv$a(View object, NewProductDetailsFragment newProductDetailsFragment, NewProductDetailsFragment newProductDetailsFragment2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(newProductDetailsFragment2, "pdpInfoProvider");
        super((View)object);
        this.a = newProductDetailsFragment;
        this.b = newProductDetailsFragment2;
        object = AnalyticsManager.Companion;
        ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
    }
}

