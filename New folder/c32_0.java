/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Product.ProductPromotion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c32
 */
public final class c32_0
implements View.OnClickListener {
    public final /* synthetic */ f32 a;
    public final /* synthetic */ ProductPromotion b;

    public /* synthetic */ c32_0(f32 f322, ProductPromotion productPromotion) {
        this.a = f322;
        this.b = productPromotion;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ProductPromotion productPromotion = this.b;
        Intrinsics.checkNotNullParameter(productPromotion, "$productPromotion");
        o62_0 o62_02 = object.c;
        if (o62_02 != null) {
            o62_02.e4();
        }
        GTMEvents gTMEvents = AnalyticsManager.Companion.getInstance().getGtmEvents();
        String string2 = productPromotion.getCode();
        GTMEvents.pushButtonTapEvent$default(gTMEvents, "offers", string2, "pdp screen", null, null, 16, null);
        object.a.u(productPromotion);
    }
}

