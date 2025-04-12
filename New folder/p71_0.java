/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandlerMultipleWidget;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from p71
 */
public final class p71_0
extends RecyclerView$B
implements TT2$b {
    public final View a;
    public final U71 b;
    public final OnGAEventHandlerListener c;
    public final tt2_2 d;
    public final x82_0 e;
    public final e00$a f;
    public final k92_0 g;
    public final ConstraintLayout h;
    public final AjioTextView i;
    public final AjioTextView j;
    public final RecyclerView k;
    public final AnalyticsGAEventHandlerMultipleWidget l;
    public final AnalyticsGAEventHandlerMultipleWidget m;
    public String n;
    public int o;
    public String p;
    public HomeRowData q;
    public String r;
    public final p71$a s;

    public p71_0(View object, U71 object2, OnGAEventHandlerListener object3, tt2_2 tt2_22, x82_0 x82_02, e00$a e00$a, k92_0 k92_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object3, "onGAEventHandlerListener");
        Intrinsics.checkNotNullParameter(tt2_22, "scrollStateHolder");
        Intrinsics.checkNotNullParameter((Object)e00$a, "cmsPageTypes");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = tt2_22;
        this.e = x82_02;
        this.f = e00$a;
        this.g = k92_02;
        int n3 = R$id.product_widget_parent;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ConstraintLayout)((Object)object2);
        this.h = object2;
        n3 = R$id.product_widget_title_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.i = object2;
        n3 = R$id.product_widget_subtitle_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.j = object2;
        n3 = R$id.home_product_widget_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (RecyclerView)object;
        this.k = object;
        object = AnalyticsGAEventHandlerMultipleWidget.Companion;
        object2 = object.getInstance();
        this.l = object2;
        object = object.getMultipleWidgetInstance();
        this.m = object;
        object = "";
        this.n = object;
        this.p = object;
        this.r = object;
        super(this);
        this.s = object;
    }

    public final String k() {
        return this.p;
    }

    public final void w() {
        Object object = this.b;
        if (object != null) {
            int n3 = this.getBindingAdapterPosition();
            object.z(n3);
        }
        object = kotlinx.coroutines.d.a(ir0_2.a);
        q71_0 q71_02 = new q71_0(this, null);
        Ae3.d((i90_0)object, null, null, q71_02, 3);
    }
}

