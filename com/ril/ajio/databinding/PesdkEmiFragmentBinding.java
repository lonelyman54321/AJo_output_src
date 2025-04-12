/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;

public final class PesdkEmiFragmentBinding
implements BC3 {
    public final ImageView categoryImvSearch;
    public final LinearLayout categorySearchLayout;
    public final TabLayout emiTabLayout;
    public final FrameLayout frameAllBanks;
    public final FrameLayout frameNoCostEmiBanks;
    public final PEProgressView paymentProgressBar;
    private final ConstraintLayout rootView;
    public final EditText searchText;

    private PesdkEmiFragmentBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, TabLayout tabLayout, FrameLayout frameLayout, FrameLayout frameLayout2, PEProgressView pEProgressView, EditText editText) {
        this.rootView = constraintLayout;
        this.categoryImvSearch = imageView;
        this.categorySearchLayout = linearLayout;
        this.emiTabLayout = tabLayout;
        this.frameAllBanks = frameLayout;
        this.frameNoCostEmiBanks = frameLayout2;
        this.paymentProgressBar = pEProgressView;
        this.searchText = editText;
    }

    public static PesdkEmiFragmentBinding bind(View object) {
        View view;
        int n3 = R$id.category_imv_search;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.category_search_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.emi_tab_layout;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (TabLayout)view;
                if (object2 != null) {
                    n3 = R$id.frame_all_banks;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (FrameLayout)view;
                    if (view4 != null) {
                        n3 = R$id.frame_no_cost_emi_banks;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (FrameLayout)view;
                        if (view5 != null) {
                            n3 = R$id.payment_progress_bar;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (PEProgressView)view;
                            if (object3 != null) {
                                n3 = R$id.search_text;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (EditText)view;
                                if (view6 != null) {
                                    Object object4 = object;
                                    object4 = (ConstraintLayout)((Object)object);
                                    PesdkEmiFragmentBinding pesdkEmiFragmentBinding = new PesdkEmiFragmentBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (LinearLayout)view3, (TabLayout)((Object)object2), (FrameLayout)view4, (FrameLayout)view5, (PEProgressView)((Object)object3), (EditText)view6);
                                    return pesdkEmiFragmentBinding;
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

    public static PesdkEmiFragmentBinding inflate(LayoutInflater layoutInflater) {
        return PesdkEmiFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkEmiFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_emi_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkEmiFragmentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

