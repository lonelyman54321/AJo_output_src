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
import com.ril.ajio.R$id;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

public final class UF1
extends pz2 {
    public final dz2 f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;

    public UF1(View view, dz2 dz22) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(dz22, "priceFacetValueClickListener");
        super(view, dz22);
        this.f = dz22;
        int n3 = R$id.price_facet_value_range_layout;
        dz22 = view.findViewById(n3);
        this.g = dz22;
        n3 = R$id.price_facet_value_range_min_text_tv;
        dz22 = (TextView)view.findViewById(n3);
        this.h = dz22;
        n3 = R$id.price_facet_value_range_max_text_tv;
        dz22 = (TextView)view.findViewById(n3);
        this.i = dz22;
        n3 = R$id.price_facet_value_range_min_val_tv;
        dz22 = (TextView)view.findViewById(n3);
        this.j = dz22;
        n3 = R$id.price_facet_value_range_max_val_tv;
        dz22 = (TextView)view.findViewById(n3);
        this.k = dz22;
        n3 = R$id.price_facet_value_range_clear_tv;
        view = (TextView)view.findViewById(n3);
        this.l = view;
    }

    public final void w(int n3, int n4) {
        Object object;
        TF1 tF1 = new TF1(this);
        this.g.setOnClickListener((View.OnClickListener)tF1);
        tF1 = this.i;
        TextView textView = this.h;
        TextView textView2 = this.l;
        TextView textView3 = this.k;
        TextView textView4 = this.j;
        int n7 = -1;
        if (n3 != n7 && n4 != n7) {
            object = qz2_0.n(String.valueOf(n3));
            textView4.setText((CharSequence)object);
            object = qz2_0.n(String.valueOf(n4));
            textView3.setText((CharSequence)object);
            object = null;
            textView4.setVisibility(0);
            textView3.setVisibility(0);
            textView2.setVisibility(0);
            n3 = R$style.muli_bold_10_accent_29;
            Hm3.f(textView, n3);
            n3 = R$style.muli_bold_10_accent_29;
            Hm3.f((TextView)tF1, n3);
        } else {
            object = "";
            textView4.setText((CharSequence)object);
            textView3.setText((CharSequence)object);
            n3 = 8;
            textView4.setVisibility(n3);
            textView3.setVisibility(n3);
            textView2.setVisibility(n3);
            n3 = R$style.muli_regular_14_accent_29;
            Hm3.f(textView, n3);
            n3 = R$style.muli_regular_14_accent_29;
            Hm3.f((TextView)tF1, n3);
        }
        object = new cV(this, 1);
        textView2.setOnClickListener((View.OnClickListener)object);
    }
}

