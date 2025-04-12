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
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class wE3
extends RecyclerView$f {
    public Facet a;
    public ImmutableList b;
    public final xE3 c;
    public int d;
    public final int e;
    public int f;

    public wE3(Facet object, ImmutableList immutableList, xE3 xE32, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(immutableList, "facetValues");
        this.a = object;
        this.b = immutableList;
        this.c = xE32;
        this.d = n3;
        object = z40_0.Companion;
        this.e = n4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.g("android_slp_visual_filter_max_count");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g() {
        int n3;
        Object object = this.a;
        int n4 = 0;
        Serializable serializable = null;
        if (object == null) return 0 != 0;
        object = ((Facet)object).getValues();
        if (object == null) return 0 != 0;
        object = this.a;
        if (object != null && (object = ((Facet)object).getValues()) != null) {
            n3 = ((ArrayList)object).size();
            serializable = Integer.valueOf(n3);
        }
        Intrinsics.checkNotNull(serializable);
        n3 = (Integer)serializable;
        serializable = this.b;
        n4 = ((AbstractCollection)((Object)serializable)).size();
        if (n3 <= n4) return 0 != 0;
        return 1 != 0;
    }

    public final int getItemCount() {
        ImmutableList immutableList = this.b;
        int n3 = immutableList.size();
        int n4 = 1;
        int n7 = this.e;
        if (n3 > n7) {
            n3 = 1;
        } else {
            n3 = 0;
            immutableList = null;
        }
        if (n3 != 0) {
            n7 += n4;
        } else {
            n3 = (int)(this.g() ? 1 : 0);
            if (n3 != 0) {
                immutableList = this.b;
                n3 = immutableList.size();
                n7 = n3 + 1;
            } else {
                immutableList = this.b;
                n7 = immutableList.size();
            }
        }
        return n7;
    }

    public final int getItemViewType(int n3) {
        int n4;
        ImmutableList immutableList = this.b;
        int n7 = immutableList.size();
        n3 = n7 > (n4 = this.e) && (n7 = n3 + 1) > n4 || (n7 = (int)(this.g() ? 1 : 0)) != 0 && ++n3 > (n7 = (immutableList = this.b).size()) ? 13 : 5;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = recyclerView$B instanceof yE3;
        if (n4 != 0) {
            Object object2;
            int n7;
            object = this.b;
            n4 = ((AbstractCollection)object).size();
            if (n4 <= (n7 = this.e)) {
                n4 = (int)(this.g() ? 1 : 0);
                if (n4 != 0) {
                    object = this.b;
                    n7 = ((AbstractCollection)object).size();
                } else {
                    object = this.b;
                    n7 = ((AbstractCollection)object).size();
                }
            }
            this.f = n7;
            object = this.c;
            if (object != null) {
                object2 = this.a;
                if (object2 != null) {
                    object2 = ((Facet)object2).getName();
                } else {
                    n7 = 0;
                    object2 = null;
                }
                int n8 = this.f;
                int n10 = this.d;
                object.U0(n8, n10, (String)object2);
            }
            recyclerView$B = (yE3)recyclerView$B;
            object = this.b.get(n3);
            object2 = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (FacetValue)object;
            n7 = this.f;
            ((yE3)recyclerView$B).w((FacetValue)object, n3, n7);
        } else {
            n4 = recyclerView$B instanceof p43;
            if (n4 != 0) {
                recyclerView$B = (p43)recyclerView$B;
                n4 = this.f;
                ((p43)recyclerView$B).w(n3, n4);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "viewGroup";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 5;
        xE3 xE32 = this.c;
        String string2 = "inflate(...)";
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.visual_filter_item_row_view;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.a;
            int n8 = this.d;
            recyclerView$B = new yE3((View)viewGroup, xE32, (Facet)object, n8);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n10 = R$layout.visual_filter_show_more_view;
            viewGroup = object.inflate(n10, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.a;
            int n14 = this.d;
            recyclerView$B = new p43((View)viewGroup, xE32, (Facet)object, n14);
        }
        return recyclerView$B;
    }
}

