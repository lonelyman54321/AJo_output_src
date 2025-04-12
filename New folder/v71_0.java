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
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V71
 */
public final class v71_0
extends RecyclerView$B
implements TT2$b {
    public final View a;
    public final U71 b;
    public final OnGAEventHandlerListener c;
    public final x82_0 d;
    public final Boolean e;
    public final tt2_2 f;
    public final ConstraintLayout g;
    public final AjioTextView h;
    public final AjioTextView i;
    public final RecyclerView j;
    public final AnalyticsGAEventHandlerMultipleWidget k;
    public String l;
    public boolean m;
    public int n;
    public String o;
    public final V71$a p;

    public v71_0(View object, U71 object2, OnGAEventHandlerListener object3, x82_0 x82_02, Boolean bl2, tt2_2 tt2_22) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(object3, "onGAEventHandlerListener");
        Intrinsics.checkNotNullParameter(tt2_22, "scrollStateHolder");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = x82_02;
        this.e = bl2;
        this.f = tt2_22;
        int n3 = R$id.product_widget_parent;
        object2 = object.findViewById(n3);
        object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (ConstraintLayout)((Object)object2);
        this.g = object2;
        n3 = R$id.product_widget_title_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.h = object2;
        n3 = R$id.product_widget_subtitle_tv;
        object2 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        this.i = object2;
        n3 = R$id.home_product_widget_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object = (RecyclerView)object;
        this.j = object;
        object = AnalyticsGAEventHandlerMultipleWidget.Companion.getInstance();
        this.k = object;
        object = "";
        this.l = object;
        this.o = object;
        super(this);
        this.p = object;
    }

    public final String k() {
        return this.o;
    }
}

