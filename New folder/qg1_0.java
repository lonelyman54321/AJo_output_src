/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qG1
 */
public final class qg1_0
extends RecyclerView$B
implements View.OnClickListener {
    public final xE3 a;
    public final Facet b;
    public final TextView c;
    public FacetValue d;

    public qg1_0(View view, xE3 xE32, Facet facet) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = xE32;
        this.b = facet;
        int n3 = R$id.visual_filter_row_item_text;
        xE32 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(xE32, "findViewById(...)");
        xE32 = (TextView)xE32;
        this.c = xE32;
        view.setOnClickListener((View.OnClickListener)this);
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.a;
        if (object != null) {
            object2 = this.d;
            Facet facet = this.b;
            object.I7((FacetValue)object2, facet);
        }
    }

    public final void w(FacetValue object) {
        String string2 = "currentFacetValue";
        Intrinsics.checkNotNullParameter(object, string2);
        this.d = object;
        boolean n3 = ((FacetValue)object).getSelected();
        TextView textView = this.c;
        if (n3) {
            int n4 = R$color.accent_color_10;
            textView.setBackgroundResource(n4);
            int n7 = hv3_0.m(R$color.new_accent_color_27);
            textView.setTextColor(n7);
        } else {
            int n8 = R$color.accent_color_11;
            textView.setBackgroundResource(n8);
            int n10 = hv3_0.m(R$color.accent_color_21);
            textView.setTextColor(n10);
        }
        object = ((FacetValue)object).getName();
        textView.setText((CharSequence)object);
    }
}

