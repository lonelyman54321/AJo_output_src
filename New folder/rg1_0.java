/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Facet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rG1
 */
public final class rg1_0
extends RecyclerView$B
implements View.OnClickListener {
    public final xE3 a;
    public final RecyclerView b;
    public final AjioTextView c;
    public final TextView d;
    public pG1 e;
    public Facet f;
    public final int g;

    public rg1_0(View view, Context context, xE3 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(context, "context");
        super(view);
        this.a = object;
        int n3 = R$id.plp_visual_filter_rv;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.b = object = (RecyclerView)object;
        int n4 = R$id.plp_visual_heading_tv;
        Object object2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        object2 = (AjioTextView)object2;
        this.c = object2;
        int n7 = R$id.plp_visual_filter_more_filter_tv;
        string2 = (TextView)view.findViewById(n7);
        this.d = string2;
        object2 = z40_0.Companion;
        this.g = n4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.g("android_slp_visual_filter_max_count");
        super(context, 0, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
        ((RecyclerView)object).setHasFixedSize(true);
        int n8 = R$id.plp_visual_filter_clear_filter_tv;
        ((TextView)view.findViewById(n8)).setOnClickListener((View.OnClickListener)this);
        string2.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.plp_visual_filter_clear_filter_tv;
        xE3 xE32 = this.a;
        if (n3 == n4) {
            if (xE32 != null) {
                object = this.f;
                xE32.ca((Facet)object);
            }
        } else {
            int n7 = object.getId();
            if (n7 == (n3 = R$id.plp_visual_filter_more_filter_tv) && xE32 != null) {
                object = this.f;
                xE32.F0((Facet)object);
            }
        }
    }
}

