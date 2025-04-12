/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NewRowSimilarToPdpBinding
implements BC3 {
    public final TextView descTv;
    public final RelativeLayout noProductAvailableRl;
    public final FrameLayout plpShimmerContainer;
    public final ShimmerFrameLayout plpShimmerView;
    private final LinearLayout rootView;
    public final LinearLayout similarProductsLayout;
    public final RecyclerView similarProductsListItem;
    public final ComposeView similarToCompose;
    public final TextView titleTv;

    private NewRowSimilarToPdpBinding(LinearLayout linearLayout, TextView textView, RelativeLayout relativeLayout, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, LinearLayout linearLayout2, RecyclerView recyclerView, ComposeView composeView, TextView textView2) {
        this.rootView = linearLayout;
        this.descTv = textView;
        this.noProductAvailableRl = relativeLayout;
        this.plpShimmerContainer = frameLayout;
        this.plpShimmerView = shimmerFrameLayout;
        this.similarProductsLayout = linearLayout2;
        this.similarProductsListItem = recyclerView;
        this.similarToCompose = composeView;
        this.titleTv = textView2;
    }

    public static NewRowSimilarToPdpBinding bind(View object) {
        View view;
        int n3 = R$id.desc_tv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.no_product_available_rl;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.plp_shimmer_container;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (FrameLayout)view;
                if (view4 != null) {
                    n3 = R$id.plp_shimmer_view;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (ShimmerFrameLayout)view;
                    if (object2 != null) {
                        Object object3 = object;
                        object3 = (LinearLayout)object;
                        n3 = R$id.similar_products_list_item;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (RecyclerView)view;
                        if (object4 != null) {
                            n3 = R$id.similar_to_compose;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (ComposeView)view;
                            if (object5 != null) {
                                n3 = R$id.title_tv;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (TextView)view;
                                if (view5 != null) {
                                    object = new NewRowSimilarToPdpBinding((LinearLayout)object3, (TextView)view2, (RelativeLayout)view3, (FrameLayout)view4, (ShimmerFrameLayout)((Object)object2), (LinearLayout)object3, (RecyclerView)object4, (ComposeView)((Object)object5), (TextView)view5);
                                    return object;
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewRowSimilarToPdpBinding inflate(LayoutInflater layoutInflater) {
        return NewRowSimilarToPdpBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowSimilarToPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_similar_to_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowSimilarToPdpBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

