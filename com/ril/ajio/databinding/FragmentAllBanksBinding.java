/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentAllBanksBinding
implements BC3 {
    public final RecyclerView emiAllBanksList;
    public final LinearLayout emiEmptyViewContainer;
    public final AjioTextView emiEmptyViewDescp;
    public final AjioTextView emiEmptyViewTitle;
    private final FrameLayout rootView;

    private FragmentAllBanksBinding(FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = frameLayout;
        this.emiAllBanksList = recyclerView;
        this.emiEmptyViewContainer = linearLayout;
        this.emiEmptyViewDescp = ajioTextView;
        this.emiEmptyViewTitle = ajioTextView2;
    }

    public static FragmentAllBanksBinding bind(View object) {
        View view;
        int n3 = R$id.emi_all_banks_list;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.emi_empty_view_container;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.emi_empty_view_descp;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.emi_empty_view_title;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (FrameLayout)object;
                        FragmentAllBanksBinding fragmentAllBanksBinding = new FragmentAllBanksBinding((FrameLayout)object5, (RecyclerView)object2, (LinearLayout)view2, (AjioTextView)object3, (AjioTextView)object4);
                        return fragmentAllBanksBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentAllBanksBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAllBanksBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAllBanksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_all_banks;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAllBanksBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

