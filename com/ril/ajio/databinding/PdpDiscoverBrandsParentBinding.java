/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.FleekRowDiscoverVideoBinding;

public final class PdpDiscoverBrandsParentBinding
implements BC3 {
    public final RelativeLayout btnViewAllProduct;
    public final CardView imgContainer;
    public final ImageView ivBrandIcon;
    private final ConstraintLayout rootView;
    public final AppCompatTextView txtBrandDescription;
    public final AppCompatTextView txtBrandName;
    public final AppCompatTextView txtViewStore;
    public final FleekRowDiscoverVideoBinding videoPlayerView;

    private PdpDiscoverBrandsParentBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, CardView cardView, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, FleekRowDiscoverVideoBinding fleekRowDiscoverVideoBinding) {
        this.rootView = constraintLayout;
        this.btnViewAllProduct = relativeLayout;
        this.imgContainer = cardView;
        this.ivBrandIcon = imageView;
        this.txtBrandDescription = appCompatTextView;
        this.txtBrandName = appCompatTextView2;
        this.txtViewStore = appCompatTextView3;
        this.videoPlayerView = fleekRowDiscoverVideoBinding;
    }

    public static PdpDiscoverBrandsParentBinding bind(View object) {
        View view;
        int n3 = R$id.btn_view_all_product;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n3 = R$id.img_container;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (CardView)view;
            if (object2 != null) {
                n3 = R$id.iv_brand_icon;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.txt_brand_description;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AppCompatTextView)view;
                    if (object3 != null) {
                        n3 = R$id.txt_brand_name;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AppCompatTextView)view;
                        if (object4 != null) {
                            n3 = R$id.txt_view_store;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AppCompatTextView)view;
                            if (object5 != null && (view = dd2_2.a(n3 = R$id.video_player_view, object)) != null) {
                                FleekRowDiscoverVideoBinding fleekRowDiscoverVideoBinding = FleekRowDiscoverVideoBinding.bind(view);
                                Object object6 = object;
                                object6 = (ConstraintLayout)((Object)object);
                                PdpDiscoverBrandsParentBinding pdpDiscoverBrandsParentBinding = new PdpDiscoverBrandsParentBinding((ConstraintLayout)((Object)object6), (RelativeLayout)view2, (CardView)((Object)object2), (ImageView)view3, (AppCompatTextView)object3, (AppCompatTextView)object4, (AppCompatTextView)object5, fleekRowDiscoverVideoBinding);
                                return pdpDiscoverBrandsParentBinding;
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

    public static PdpDiscoverBrandsParentBinding inflate(LayoutInflater layoutInflater) {
        return PdpDiscoverBrandsParentBinding.inflate(layoutInflater, null, false);
    }

    public static PdpDiscoverBrandsParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_discover_brands_parent;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpDiscoverBrandsParentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

