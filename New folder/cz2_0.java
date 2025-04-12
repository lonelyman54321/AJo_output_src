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
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.FacetValue;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cz2
 */
public class cz2_0
extends RecyclerView$f {
    public final ImmutableList a;
    public final HashMap b;
    public final HashMap c;
    public final int d;
    public final int e;
    public final dz2 f;
    public final int g;

    public cz2_0(ImmutableList immutableList, HashMap hashMap, HashMap hashMap2, int n3, int n4, dz2 dz22) {
        Intrinsics.checkNotNullParameter(immutableList, "facetValueList");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        Intrinsics.checkNotNullParameter(dz22, "facetValueClickListener");
        this.a = immutableList;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = n3;
        this.e = n4;
        this.f = dz22;
        this.g = 1;
    }

    public final int getItemCount() {
        return this.a.size() + 1;
    }

    public final int getItemViewType(int n3) {
        ImmutableList immutableList = this.a;
        int n4 = immutableList.size();
        n3 = n3 == n4 ? this.g : 0;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, string2);
        int n4 = recyclerView$B instanceof YY0;
        if (n4 != 0) {
            RecyclerView$B recyclerView$B2 = recyclerView$B;
            recyclerView$B2 = (YY0)recyclerView$B;
            recyclerView$B = this.a.get(n3);
            string2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(recyclerView$B, string2);
            Object object = recyclerView$B;
            object = (FacetValue)((Object)recyclerView$B);
            HashMap hashMap = this.c;
            int n7 = -1;
            HashMap hashMap2 = this.b;
            ((YY0)recyclerView$B2).x((FacetValue)object, hashMap2, hashMap, n7, n3);
        } else {
            n3 = recyclerView$B instanceof pz2;
            if (n3 != 0) {
                recyclerView$B = (pz2)recyclerView$B;
                n3 = this.d;
                n4 = this.e;
                ((pz2)recyclerView$B).w(n3, n4);
            }
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        dz2 dz22 = this.f;
        String string2 = "inflate(...)";
        if (n3 == 0) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.general_facet_value_row_view;
            viewGroup = layoutInflater.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new YY0((View)viewGroup, dz22);
        } else {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.price_facet_value_range_row_view;
            viewGroup = layoutInflater.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new pz2((View)viewGroup, dz22);
        }
        return recyclerView$B;
    }
}

