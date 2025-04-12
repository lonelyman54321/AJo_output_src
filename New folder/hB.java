/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.internal.Intrinsics;

public final class hB
extends RecyclerView$B {
    public final TextView a;

    public hB(View view) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        int n3 = R$id.brand_facet_value_title_row_tv;
        view = (TextView)view.findViewById(n3);
        this.a = view;
    }

    public final void w(FacetValue object) {
        Intrinsics.checkNotNullParameter(object, "facetValue");
        TextView textView = this.a;
        object = ((FacetValue)object).getName();
        textView.setText((CharSequence)object);
    }
}

