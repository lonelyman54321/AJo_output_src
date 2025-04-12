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
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewSimilarProductListLayoutRowBinding
implements BC3 {
    public final AjioCircularImageView addToBag;
    public final AjioRoundedCornerImageView imgProduct;
    public final ImageView imgPromo;
    public final AjioTextView itemBrand;
    public final AjioTextView itemExclusive;
    public final AjioTextView itemName;
    public final AjioTextView itemOldPrice;
    public final AjioTextView itemPrice;
    private final RelativeLayout rootView;
    public final RelativeLayout rowSimilarProduct;
    public final AjioCircularImageView saveToListCircle;

    private NewSimilarProductListLayoutRowBinding(RelativeLayout relativeLayout, AjioCircularImageView ajioCircularImageView, AjioRoundedCornerImageView ajioRoundedCornerImageView, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, RelativeLayout relativeLayout2, AjioCircularImageView ajioCircularImageView2) {
        this.rootView = relativeLayout;
        this.addToBag = ajioCircularImageView;
        this.imgProduct = ajioRoundedCornerImageView;
        this.imgPromo = imageView;
        this.itemBrand = ajioTextView;
        this.itemExclusive = ajioTextView2;
        this.itemName = ajioTextView3;
        this.itemOldPrice = ajioTextView4;
        this.itemPrice = ajioTextView5;
        this.rowSimilarProduct = relativeLayout2;
        this.saveToListCircle = ajioCircularImageView2;
    }

    public static NewSimilarProductListLayoutRowBinding bind(View object) {
        View view;
        int n3 = R$id.add_to_bag;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioCircularImageView)view;
        if (object2 != null) {
            n3 = R$id.img_product;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioRoundedCornerImageView)view;
            if (object3 != null) {
                n3 = R$id.img_promo;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.item_brand;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.item_exclusive;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.item_name;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.item_old_price;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.item_price;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        Object object9 = object;
                                        object9 = (RelativeLayout)object;
                                        n3 = R$id.save_to_list_circle;
                                        Object object10 = view = dd2_2.a(n3, object);
                                        object10 = (AjioCircularImageView)view;
                                        if (object10 != null) {
                                            object = new NewSimilarProductListLayoutRowBinding((RelativeLayout)object9, (AjioCircularImageView)((Object)object2), (AjioRoundedCornerImageView)((Object)object3), (ImageView)view2, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (RelativeLayout)object9, (AjioCircularImageView)((Object)object10));
                                            return object;
                                        }
                                    }
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

    public static NewSimilarProductListLayoutRowBinding inflate(LayoutInflater layoutInflater) {
        return NewSimilarProductListLayoutRowBinding.inflate(layoutInflater, null, false);
    }

    public static NewSimilarProductListLayoutRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_similar_product_list_layout_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewSimilarProductListLayoutRowBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

