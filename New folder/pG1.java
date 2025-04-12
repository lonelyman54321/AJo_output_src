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
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue;
import kotlin.jvm.internal.Intrinsics;

public final class pG1
extends RecyclerView$f {
    public Facet a;
    public ImmutableList b;
    public final xE3 c;
    public final int d;

    public pG1(Facet object, ImmutableList immutableList, xE3 xE32) {
        int n3;
        this.a = object;
        this.b = immutableList;
        this.c = xE32;
        object = z40_0.Companion;
        this.d = n3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.g("android_slp_visual_filter_max_count");
    }

    public final int getItemCount() {
        int n3;
        ImmutableList immutableList = this.b;
        if (immutableList == null) {
            n3 = 0;
            immutableList = null;
        } else {
            Intrinsics.checkNotNull(immutableList);
            n3 = immutableList.size();
            int n4 = this.d;
            if (n3 > n4) {
                n3 = n4;
            } else {
                immutableList = this.b;
                Intrinsics.checkNotNull(immutableList);
                n3 = immutableList.size();
            }
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof qg1_0;
        if (bl2) {
            recyclerView$B = (qg1_0)recyclerView$B;
            object = this.b;
            Intrinsics.checkNotNull(object);
            Object object2 = object.get(n3);
            object = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = (FacetValue)object2;
            ((qg1_0)recyclerView$B).w((FacetValue)object2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.luxe_visual_filter_item_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.c;
        Facet facet = this.a;
        qg1_0 qg1_02 = new qg1_0((View)viewGroup, (xE3)object, facet);
        return qg1_02;
    }
}

