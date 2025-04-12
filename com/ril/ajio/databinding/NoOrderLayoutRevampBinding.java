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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NoOrderLayoutRevampBinding
implements BC3 {
    public final AjioButton noOrderLayoutBtnOlderOrder;
    public final AjioButton noOrderLayoutBtnShopping;
    public final AjioTextView noOrderLayoutLblCloset;
    public final RecyclerView noOrderLayoutRv;
    public final AjioTextView noOrderLayoutTvTitle;
    public final LinearLayout nolrBottomLayout;
    public final LinearLayout nolrLayoutRV;
    private final RelativeLayout rootView;

    private NoOrderLayoutRevampBinding(RelativeLayout relativeLayout, AjioButton ajioButton, AjioButton ajioButton2, AjioTextView ajioTextView, RecyclerView recyclerView, AjioTextView ajioTextView2, LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = relativeLayout;
        this.noOrderLayoutBtnOlderOrder = ajioButton;
        this.noOrderLayoutBtnShopping = ajioButton2;
        this.noOrderLayoutLblCloset = ajioTextView;
        this.noOrderLayoutRv = recyclerView;
        this.noOrderLayoutTvTitle = ajioTextView2;
        this.nolrBottomLayout = linearLayout;
        this.nolrLayoutRV = linearLayout2;
    }

    public static NoOrderLayoutRevampBinding bind(View object) {
        View view;
        int n3 = R$id.no_order_layout_btn_older_order;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.no_order_layout_btn_shopping;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioButton)view;
            if (object3 != null) {
                n3 = R$id.no_order_layout_lbl_closet;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.no_order_layout_rv;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (RecyclerView)view;
                    if (object5 != null) {
                        n3 = R$id.no_order_layout_tv_title;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.nolrBottomLayout;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (LinearLayout)view;
                            if (view2 != null) {
                                n3 = R$id.nolrLayoutRV;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (LinearLayout)view;
                                if (view3 != null) {
                                    Object object7 = object;
                                    object7 = (RelativeLayout)object;
                                    NoOrderLayoutRevampBinding noOrderLayoutRevampBinding = new NoOrderLayoutRevampBinding((RelativeLayout)object7, (AjioButton)object2, (AjioButton)object3, (AjioTextView)object4, (RecyclerView)object5, (AjioTextView)object6, (LinearLayout)view2, (LinearLayout)view3);
                                    return noOrderLayoutRevampBinding;
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

    public static NoOrderLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return NoOrderLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static NoOrderLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.no_order_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NoOrderLayoutRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

