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

/*
 * Renamed from OD1
 */
public final class od1_1
extends za_0 {
    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = "inflate(...)";
        int n4 = this.e;
        if (n3 == n4) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.brand_facet_value_title_row_view;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object);
            recyclerView$B = new hB((View)viewGroup);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.luxe_general_facet_value_row_view;
            viewGroup = layoutInflater.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object);
            object = this.d;
            recyclerView$B = new sF1((View)viewGroup, (KI0)object);
        }
        return recyclerView$B;
    }
}

