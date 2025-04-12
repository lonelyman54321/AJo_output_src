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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewSimilarProductListLayoutHorizontalRowBinding
implements BC3 {
    public final AjioRoundedCornerImageView imgProduct;
    public final ImageView imgPromo;
    public final AjioTextView itemBrand;
    public final AjioTextView itemOldPrice;
    public final AjioTextView itemPrice;
    private final RelativeLayout rootView;
    public final RelativeLayout rowSimilarProduct;

    private NewSimilarProductListLayoutHorizontalRowBinding(RelativeLayout relativeLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.imgProduct = ajioRoundedCornerImageView;
        this.imgPromo = imageView;
        this.itemBrand = ajioTextView;
        this.itemOldPrice = ajioTextView2;
        this.itemPrice = ajioTextView3;
        this.rowSimilarProduct = relativeLayout2;
    }

    public static NewSimilarProductListLayoutHorizontalRowBinding bind(View object) {
        View view;
        int n3 = R$id.img_product;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioRoundedCornerImageView)view;
        if (object2 != null) {
            n3 = R$id.img_promo;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.item_brand;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.item_old_price;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.item_price;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            Object object6 = object;
                            object6 = (RelativeLayout)object;
                            object = new NewSimilarProductListLayoutHorizontalRowBinding((RelativeLayout)object6, (AjioRoundedCornerImageView)((Object)object2), (ImageView)view2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (RelativeLayout)object6);
                            return object;
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

    public static NewSimilarProductListLayoutHorizontalRowBinding inflate(LayoutInflater layoutInflater) {
        return NewSimilarProductListLayoutHorizontalRowBinding.inflate(layoutInflater, null, false);
    }

    public static NewSimilarProductListLayoutHorizontalRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_similar_product_list_layout_horizontal_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewSimilarProductListLayoutHorizontalRowBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

