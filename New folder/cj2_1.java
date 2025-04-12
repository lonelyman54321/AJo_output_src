/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.web.AjioCustomWebView;
import com.ril.ajio.web.a;
import com.ril.ajio.web.a$a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cj2
 */
public final class cj2_1
extends RecyclerView$B
implements a,
View.OnClickListener {
    public final View a;
    public final yi2_1 b;
    public final AjioCustomWebView c;
    public final AjioProgressView d;
    public final boolean e;
    public final String f;
    public boolean g;
    public final NewCustomEventsRevamp h;
    public final String i;

    public cj2_1(View object, yi2_1 object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = object2;
        int n3 = R$id.pdp_size_web;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
        object2 = (AjioCustomWebView)((Object)object2);
        this.c = object2;
        n3 = R$id.progress_bar;
        object = (AjioProgressView)object.findViewById(n3);
        this.d = object;
        super();
        yr1_2.b((Function0)object);
        object = z40_0.Companion;
        this.e = bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("pdp_size_chart_visiblity_enable");
        object = z40$a.a((Context)AJIOApplication$a.a()).a.b("pdp_size_chart_imageinteraction_bricks");
        this.f = object;
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.h = object2;
        this.i = object = bv_0.a((AnalyticsManager$Companion)object);
    }

    public final void A9(String string2, String string3) {
    }

    public final void dismissProgress() {
        AjioProgressView ajioProgressView = this.d;
        if (ajioProgressView != null) {
            ajioProgressView.dismiss();
        }
    }

    public final void e8(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void m3(String string2) {
        a$a.a(string2);
    }

    public final void onClick(View view) {
    }

    public final void showProgress() {
        AjioProgressView ajioProgressView = this.d;
        if (ajioProgressView != null) {
            ajioProgressView.show();
        }
    }
}

