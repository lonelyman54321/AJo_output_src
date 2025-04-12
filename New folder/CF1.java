/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CF1
extends s12 {
    public TextView w;

    public final void Ua(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.filter_toolbar;
        Object object2 = (Toolbar)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.filter_view_heading_tv;
        object2 = (TextView)object.findViewById(n3);
        this.g = object2;
        n3 = R$id.filter_view_subheading_tv;
        object2 = (TextView)object.findViewById(n3);
        this.w = object2;
        n3 = R$id.filter_view_reset_filters_tv;
        object2 = (TextView)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.filter_view_facet_title_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.h = object2;
        n3 = R$id.filter_view_facet_value_frag_container;
        object2 = (FrameLayout)object.findViewById(n3);
        this.j = object2;
        n3 = R$id.filter_view_cancel_tv;
        object2 = (TextView)object.findViewById(n3);
        this.k = object2;
        n3 = R$id.filter_view_apply_filter_tv;
        object = (TextView)object.findViewById(n3);
        this.l = object;
        object2 = this.requireActivity();
        int n4 = 1;
        Object object3 = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.h;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        object = this.Ta();
        n3 = 0;
        object2 = null;
        object = object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null ? ((ProductsList)object).getFacets() : null;
        if (object != null && (object = this.h) != null) {
            object3 = this.Ta();
            object3 = object3 != null ? ((F12)object3).d : null;
            Intrinsics.checkNotNull(object3);
            object3 = ((bv2_0)object3).N;
            object3 = object3 != null ? ((ProductsList)object3).getFacets() : null;
            Intrinsics.checkNotNull(object3);
            object3 = ImmutableList.copyOf((Collection)this.Va((List)object3));
            Intrinsics.checkNotNullExpressionValue(object3, "copyOf(...)");
            Object object4 = this.Ta();
            if (object4 != null) {
                object2 = ((F12)object4).d;
            }
            Intrinsics.checkNotNull(object2);
            object2 = ((bv2_0)object2).i0;
            Intrinsics.checkNotNullParameter(object3, "facetList");
            object4 = "facetNameClickListener";
            Intrinsics.checkNotNullParameter(this, (String)object4);
            if1_0 if1_02 = new FI0((ImmutableList)object3, (HashMap)object2, this);
            if1_02.f = this;
            ((RecyclerView)object).setAdapter(if1_02);
        }
    }

    public final void Ya() {
        int n3;
        Toolbar toolbar = this.e;
        if (toolbar != null && (toolbar = (ImageView)toolbar.findViewById(n3 = R$id.filter_toolbar_navigation_iv)) != null) {
            BF1 bF1 = new BF1(this, 0);
            toolbar.setOnClickListener(bF1);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_plp_filter_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void updateTitle() {
        int n3;
        int n4;
        int n7;
        Object object = this.Ta();
        int n8 = 0;
        Object object2 = null;
        if (object != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null && (object = ((ProductsList)object).getPagination()) != null) {
            n7 = ((Pagination)object).getTotalResults();
            object = n7;
        } else {
            n7 = 0;
            object = null;
        }
        if (object != null && (n4 = ((Integer)object).intValue()) > (n3 = 1)) {
            object = this.w;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = this.Ta()) != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null && (object = ((ProductsList)object).getPagination()) != null) {
                n7 = ((Pagination)object).getTotalResults();
                object2 = n7;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(object2);
            object2 = " PRODUCTS";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
        } else if (object != null) {
            object = this.w;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = this.Ta()) != null && (object = ((F12)object).d) != null && (object = ((bv2_0)object).N) != null && (object = ((ProductsList)object).getPagination()) != null) {
                n7 = ((Pagination)object).getTotalResults();
                object2 = n7;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(object2);
            object2 = " PRODUCT";
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
        } else {
            object = this.w;
            if (object != null) {
                n8 = 8;
                object.setVisibility(n8);
            }
            object = "";
        }
        object2 = this.w;
        if (object2 != null) {
            object2.setText((CharSequence)object);
        }
    }
}

