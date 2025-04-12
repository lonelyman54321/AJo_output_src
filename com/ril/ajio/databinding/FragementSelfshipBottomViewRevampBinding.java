/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragementSelfshipBottomViewRevampBinding
implements BC3 {
    public final AjioAspectRatioImageView close;
    public final ImageView ivBox;
    public final ImageView ivShip;
    public final TextView lblHowToShip;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final AjioTextView tvBoxInfo;
    public final AjioTextView tvShipInfo;

    private FragementSelfshipBottomViewRevampBinding(ConstraintLayout constraintLayout, AjioAspectRatioImageView ajioAspectRatioImageView, ImageView imageView, ImageView imageView2, TextView textView, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.close = ajioAspectRatioImageView;
        this.ivBox = imageView;
        this.ivShip = imageView2;
        this.lblHowToShip = textView;
        this.recyclerView = recyclerView;
        this.tvBoxInfo = ajioTextView;
        this.tvShipInfo = ajioTextView2;
    }

    public static FragementSelfshipBottomViewRevampBinding bind(View object) {
        View view;
        int n3 = R$id.close;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.iv_box;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.iv_ship;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.lblHowToShip;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.recycler_view;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (RecyclerView)view;
                        if (object3 != null) {
                            n3 = R$id.tv_box_info;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.tv_ship_info;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    Object object6 = object;
                                    object6 = (ConstraintLayout)((Object)object);
                                    FragementSelfshipBottomViewRevampBinding fragementSelfshipBottomViewRevampBinding = new FragementSelfshipBottomViewRevampBinding((ConstraintLayout)((Object)object6), (AjioAspectRatioImageView)((Object)object2), (ImageView)view2, (ImageView)view3, (TextView)view4, (RecyclerView)object3, (AjioTextView)object4, (AjioTextView)object5);
                                    return fragementSelfshipBottomViewRevampBinding;
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

    public static FragementSelfshipBottomViewRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragementSelfshipBottomViewRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragementSelfshipBottomViewRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragement_selfship_bottom_view_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragementSelfshipBottomViewRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

