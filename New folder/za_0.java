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
 * Renamed from ZA
 */
public class za_0
extends RecyclerView$f {
    public ImmutableList a;
    public final HashMap b;
    public final HashMap c;
    public final KI0 d;
    public final int e;

    public za_0(ImmutableList immutableList, HashMap hashMap, HashMap hashMap2, KI0 kI0) {
        Intrinsics.checkNotNullParameter(immutableList, "facetValueList");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        Intrinsics.checkNotNullParameter(kI0, "facetValueClickListener");
        this.a = immutableList;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = kI0;
        this.e = 1;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        ImmutableList immutableList = this.a;
        FacetValue facetValue = (FacetValue)immutableList.get(n3);
        if ((n3 = (int)(facetValue.isTitleFacet() ? 1 : 0)) != 0) {
            n3 = this.e;
        } else {
            n3 = 0;
            facetValue = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof YY0;
        String string2 = "get(...)";
        if (bl2) {
            RecyclerView$B recyclerView$B2 = recyclerView$B;
            recyclerView$B2 = (YY0)recyclerView$B;
            recyclerView$B = this.a.get(n3);
            Intrinsics.checkNotNullExpressionValue(recyclerView$B, string2);
            Object object2 = recyclerView$B;
            object2 = (FacetValue)((Object)recyclerView$B);
            HashMap hashMap = this.c;
            int n4 = -1;
            HashMap hashMap2 = this.b;
            ((YY0)recyclerView$B2).x((FacetValue)object2, hashMap2, hashMap, n4, n3);
        } else {
            bl2 = recyclerView$B instanceof hB;
            if (bl2) {
                recyclerView$B = (hB)recyclerView$B;
                object = this.a;
                Object object3 = object.get(n3);
                Intrinsics.checkNotNullExpressionValue(object3, string2);
                object3 = (FacetValue)object3;
                ((hB)recyclerView$B).w((FacetValue)object3);
            }
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = this.e;
        String string2 = "inflate(...)";
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.brand_facet_value_title_row_view;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new hB((View)viewGroup);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.general_facet_value_row_view;
            viewGroup = object.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.d;
            recyclerView$B = new YY0((View)viewGroup, (KI0)object);
        }
        return recyclerView$B;
    }
}

