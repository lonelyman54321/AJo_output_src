/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;

public final class PesdkLuxNetbankingFragmentBinding
implements BC3 {
    public final ImageView categoryImvSearch;
    public final LinearLayout categorySearchLayout;
    public final RecyclerView netbankingList;
    public final PEProgressView paymentProgressBar;
    private final ConstraintLayout rootView;
    public final EditText searchText;

    private PesdkLuxNetbankingFragmentBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView, PEProgressView pEProgressView, EditText editText) {
        this.rootView = constraintLayout;
        this.categoryImvSearch = imageView;
        this.categorySearchLayout = linearLayout;
        this.netbankingList = recyclerView;
        this.paymentProgressBar = pEProgressView;
        this.searchText = editText;
    }

    public static PesdkLuxNetbankingFragmentBinding bind(View object) {
        View view;
        int n3 = R$id.category_imv_search;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.category_search_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.netbanking_list;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (RecyclerView)view;
                if (object2 != null) {
                    n3 = R$id.payment_progress_bar;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (PEProgressView)view;
                    if (object3 != null) {
                        n3 = R$id.search_text;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (EditText)view;
                        if (view4 != null) {
                            Object object4 = object;
                            object4 = (ConstraintLayout)((Object)object);
                            PesdkLuxNetbankingFragmentBinding pesdkLuxNetbankingFragmentBinding = new PesdkLuxNetbankingFragmentBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (LinearLayout)view3, (RecyclerView)object2, (PEProgressView)((Object)object3), (EditText)view4);
                            return pesdkLuxNetbankingFragmentBinding;
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

    public static PesdkLuxNetbankingFragmentBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxNetbankingFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxNetbankingFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_netbanking_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxNetbankingFragmentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

