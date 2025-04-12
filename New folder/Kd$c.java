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

public final class Kd$c
extends RecyclerView$B {
    public final cq1_2 a;
    public final t82_0 b;
    public final yi2_1 c;
    public final NewCustomEventsRevamp d;
    public final NewEEcommerceEventsRevamp e;

    public Kd$c(cq1_2 object, t82_0 object2, yi2_1 yi2_12, View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(object, "moreProductOfferCallback");
        Intrinsics.checkNotNullParameter(object2, "onPromotionClickListener");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        super(view);
        this.a = object;
        this.b = object2;
        this.c = yi2_12;
        object = AnalyticsManager.Companion;
        this.d = object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.e = object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
    }
}

