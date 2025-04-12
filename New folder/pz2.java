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
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public class pz2
extends RecyclerView$B {
    public final dz2 a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;

    public pz2(View view, dz2 dz22) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        Intrinsics.checkNotNullParameter(dz22, "priceFacetValueClickListener");
        super(view);
        this.a = dz22;
        int n3 = R$id.price_facet_value_range_layout;
        dz22 = view.findViewById(n3);
        this.b = dz22;
        n3 = R$id.price_facet_value_range_min_tv;
        dz22 = (TextView)view.findViewById(n3);
        this.c = dz22;
        n3 = R$id.price_facet_value_range_max_tv;
        dz22 = (TextView)view.findViewById(n3);
        this.d = dz22;
        n3 = R$id.price_facet_value_range_clear_tv;
        view = (TextView)view.findViewById(n3);
        this.e = view;
    }

    public void w(int n3, int n4) {
        Object object;
        nz2 nz22 = new nz2(this);
        this.b.setOnClickListener((View.OnClickListener)nz22);
        nz22 = this.d;
        TextView textView = this.c;
        TextView textView2 = this.e;
        int n7 = -1;
        if (n3 != n7 && n4 != n7) {
            object = qz2_0.n(String.valueOf(n3));
            textView.setText((CharSequence)object);
            object = qz2_0.n(String.valueOf(n4));
            nz22.setText((CharSequence)object);
            n3 = 0;
            object = null;
            textView2.setVisibility(0);
        } else {
            n3 = 8;
            textView2.setVisibility(n3);
            object = "";
            textView.setText((CharSequence)object);
            nz22.setText((CharSequence)object);
        }
        object = new oz2(this, 0);
        textView2.setOnClickListener((View.OnClickListener)object);
    }
}

