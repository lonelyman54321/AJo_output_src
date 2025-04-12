/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

public final class IF1
extends cz2_0 {
    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        dz2 dz22 = this.f;
        String string2 = "inflate(...)";
        if (n3 == 0) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.luxe_general_facet_value_row_view;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new sF1((View)viewGroup, dz22);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.luxe_price_range_facet_value_row;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new UF1((View)viewGroup, dz22);
        }
        return recyclerView$B;
    }
}

