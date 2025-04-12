/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.events.Ga4Events;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

public final class CE3
extends RecyclerView$B {
    public final xE3 a;
    public final RecyclerView b;
    public final AjioTextView c;
    public wE3 d;

    public CE3(View object, Context context, xE3 object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(context, "context");
        super((View)object);
        this.a = object2;
        int n3 = R$id.plp_visual_filter_rv;
        object2 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.b = object2 = (RecyclerView)object2;
        int n4 = R$id.plp_visual_heading_tv;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (AjioTextView)object;
        this.c = object;
        object = Ga4Events.INSTANCE;
        super(context, 0, false);
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        ((RecyclerView)object2).setHasFixedSize(true);
    }
}

