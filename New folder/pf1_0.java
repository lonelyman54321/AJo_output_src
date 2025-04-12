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
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$layout;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pF1
 */
public final class pf1_0
extends qy0_1 {
    public pf1_0(ImmutableList immutableList, HashMap hashMap, HashMap hashMap2, KI0 kI0, int n3) {
        Intrinsics.checkNotNullParameter(immutableList, "facetValueList");
        Intrinsics.checkNotNullParameter(hashMap, "userSelectedFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "userDeselectedFacetValues");
        Intrinsics.checkNotNullParameter(kI0, "facetValueClickListener");
        super(immutableList, hashMap, hashMap2, kI0, n3, null, null);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.luxe_general_facet_value_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.d;
        sF1 sF12 = new sF1((View)viewGroup, (KI0)object);
        return sF12;
    }
}

