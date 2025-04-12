/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutReturnExchangeDropAtStoreBinding;

public final class FragmentReturnExchangeControllerListBinding
implements BC3 {
    public final RecyclerView fragmentExchangeBottomRv;
    public final RecyclerView fragmentExchangeRv;
    public final LayoutReturnExchangeDropAtStoreBinding freclLayoutDas;
    public final AjioTextView itemListName;
    public final LinearLayout parentToplist;
    private final RelativeLayout rootView;
    public final LinearLayout savedRequestLl;
    public final AjioTextView savedRequestTv;

    private FragmentReturnExchangeControllerListBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2, LayoutReturnExchangeDropAtStoreBinding layoutReturnExchangeDropAtStoreBinding, AjioTextView ajioTextView, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView2) {
        this.rootView = relativeLayout;
        this.fragmentExchangeBottomRv = recyclerView;
        this.fragmentExchangeRv = recyclerView2;
        this.freclLayoutDas = layoutReturnExchangeDropAtStoreBinding;
        this.itemListName = ajioTextView;
        this.parentToplist = linearLayout;
        this.savedRequestLl = linearLayout2;
        this.savedRequestTv = ajioTextView2;
    }

    public static FragmentReturnExchangeControllerListBinding bind(View object) {
        View view;
        int n3 = R$id.fragment_exchange_bottom_rv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.fragment_exchange_rv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.frecl_layout_das, object)) != null) {
                LayoutReturnExchangeDropAtStoreBinding layoutReturnExchangeDropAtStoreBinding = LayoutReturnExchangeDropAtStoreBinding.bind(view);
                n3 = R$id.item_list_name;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.parent_toplist;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (LinearLayout)view;
                    if (view2 != null) {
                        n3 = R$id.saved_request_ll;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (LinearLayout)view;
                        if (view3 != null) {
                            n3 = R$id.saved_request_tv;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (RelativeLayout)object;
                                FragmentReturnExchangeControllerListBinding fragmentReturnExchangeControllerListBinding = new FragmentReturnExchangeControllerListBinding((RelativeLayout)object6, (RecyclerView)object2, (RecyclerView)object3, layoutReturnExchangeDropAtStoreBinding, (AjioTextView)object4, (LinearLayout)view2, (LinearLayout)view3, (AjioTextView)object5);
                                return fragmentReturnExchangeControllerListBinding;
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

    public static FragmentReturnExchangeControllerListBinding inflate(LayoutInflater layoutInflater) {
        return FragmentReturnExchangeControllerListBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentReturnExchangeControllerListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_return_exchange_controller_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentReturnExchangeControllerListBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

