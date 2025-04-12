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
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

public final class Fc0$a
extends RecyclerView$B {
    public final t82_0 a;
    public final yi2_1 b;
    public final t30_0 c;
    public final o62_0 d;
    public final NewCustomEventsRevamp e;
    public final NewEEcommerceEventsRevamp f;

    public Fc0$a(View object, NewProductDetailsFragment object2, NewProductDetailsFragment newProductDetailsFragment, t30_0 t30_02, o62_0 o62_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(newProductDetailsFragment, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(t30_02, "disposable");
        Intrinsics.checkNotNullParameter(o62_02, "offersDismissCallBack");
        super((View)object);
        this.a = object2;
        this.b = newProductDetailsFragment;
        this.c = t30_02;
        this.d = o62_02;
        object = AnalyticsManager.Companion;
        this.e = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.f = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
    }
}

