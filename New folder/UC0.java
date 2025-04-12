/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

public final class UC0
implements View.OnClickListener {
    public final /* synthetic */ gd0_0 a;
    public final /* synthetic */ gD0$a b;

    public /* synthetic */ UC0(gd0_0 gd0_02, gD0$a a2) {
        this.a = gd0_02;
        this.b = a2;
    }

    public final void onClick(View view) {
        gd0_0 gd0_02 = this.a;
        Intrinsics.checkNotNullParameter(gd0_02, "this$0");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$this_apply");
        Bundle bundle = new Bundle();
        Object object2 = gd0_02.o;
        bundle.putString("product_id", (String)object2);
        Object object3 = gd0_02.p;
        bundle.putString("order_id", (String)object3);
        object3 = gd0_02.q;
        bundle.putString("order_status", (String)object3);
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        object = ((gD0$a)object).l;
        object = object != null ? ((AppCompatTextView)object).getText() : null;
        String string3 = String.valueOf(object);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        int n3 = 1568;
        object3 = gd0_02.n;
        String string5 = "buttonTap";
        String string6 = "size exchange";
        String string7 = "buttonTap";
        String string8 = "exchange size & reason selection screen";
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string5, string6, string3, string7, string8, null, string2, bundle, string4, false, null, n3, null);
        object2 = gd0_02.c;
        if (object2 != null) {
            object2.W1();
        }
    }
}

