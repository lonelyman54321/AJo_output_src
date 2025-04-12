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
import kotlin.jvm.internal.Intrinsics;

public final class Kd$b
extends RecyclerView$B {
    public final cq1_2 a;
    public final t82_0 b;
    public final yi2_1 c;
    public final t30_0 d;
    public final NewCustomEventsRevamp e;
    public final NewEEcommerceEventsRevamp f;

    public Kd$b(View object, cq1_2 object2, t82_0 t82_02, yi2_1 yi2_12, t30_0 t30_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object2, "moreProductOfferCallback");
        Intrinsics.checkNotNullParameter(t82_02, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(t30_02, "disposable");
        super((View)object);
        this.a = object2;
        this.b = t82_02;
        this.c = yi2_12;
        this.d = t30_02;
        object = AnalyticsManager.Companion;
        this.e = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.f = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
    }
}

