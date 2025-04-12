/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.data.Payment.ConvenienceFeePriceSplitUp;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class RT
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ RT(RecyclerView$B recyclerView$B, Serializable serializable, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
        this.c = serializable;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (ts1_2)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = (CouponEntity)this.c;
                Intrinsics.checkNotNullParameter(object2, "$entity");
                object = ((ts1_2)object).a;
                object2 = ((CouponEntity)object2).getDetailsURL();
                object.e6((String)object2);
                return;
            }
            case 0: 
        }
        ST sT = (ST)this.b;
        Intrinsics.checkNotNullParameter(sT, "this$0");
        ConvenienceFeePriceSplitUp convenienceFeePriceSplitUp = (ConvenienceFeePriceSplitUp)this.c;
        Intrinsics.checkNotNullParameter(convenienceFeePriceSplitUp, "$convenienceFee");
        object = AnalyticsManager.Companion;
        GTMEvents gTMEvents = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        String string2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp().getEC_PAYMENT_INSTRUMENT_SCR_TYPE();
        GTMEvents.gtmEventsToGaWithCategory$default(gTMEvents, string2, "whats_this_click", "Whats this click", null, "single page checkout", null, 32, null);
        sT.c.I9(convenienceFeePriceSplitUp);
    }
}

