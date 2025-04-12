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
 * Renamed from iF1
 */
public final class if1_0
extends FI0 {
    public GI0 f;

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = "inflate(...)";
        int n4 = this.d;
        if (n3 == n4) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.luxe_filter_facet_row_view;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object);
            object = this.f;
            recyclerView$B = new kf1_0((View)viewGroup, (GI0)object);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.facet_title_layout;
            viewGroup = layoutInflater.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, (String)object);
            recyclerView$B = new JI0((View)viewGroup);
        }
        return recyclerView$B;
    }
}

