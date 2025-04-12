/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.CartAssuredGiftModel$Gift;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JM
 */
public final class jm_1
implements View.OnClickListener {
    public final /* synthetic */ km_2 a;

    public /* synthetic */ jm_1(km_2 km_22) {
        this.a = km_22;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = ((km_2)object2).b;
        int n3 = object.getVisibility();
        View view = ((km_2)object2).c;
        LinearLayout linearLayout = ((km_2)object2).b;
        ImageView imageView = ((km_2)object2).h;
        if (n3 == 0) {
            n3 = 0;
            float f5 = 0.0f;
            object = null;
            imageView.setRotation(0.0f);
            ai0_2.i((View)linearLayout);
            ai0_2.i(view);
        } else {
            object = ((km_2)object2).a.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartAssuredGiftModel.Gift");
            object = (CartAssuredGiftModel$Gift)object;
            Bundle bundle = new Bundle();
            object2 = ((CartAssuredGiftModel$Gift)object).getGiftValueText();
            bundle.putString("header", (String)object2);
            object2 = "subheader";
            object = ((CartAssuredGiftModel$Gift)object).getOrderValueRangeText();
            bundle.putString((String)object2, (String)object);
            object = AnalyticsManager.Companion.getInstance();
            GTMEvents gTMEvents = ((AnalyticsManager)object).getGtmEvents();
            String string2 = "bag screen";
            String string3 = "highlighted gifts interaction";
            String string4 = "highlighted section click";
            String string5 = "";
            String string6 = "assured_gifts_highlighted_clicks";
            gTMEvents.pushCartInteractionsEvent(string4, string5, string6, string2, string3, bundle);
            n3 = 0x43340000;
            float f6 = 180.0f;
            imageView.setRotation(f6);
            ai0_2.B((View)linearLayout);
            ai0_2.B(view);
        }
    }
}

