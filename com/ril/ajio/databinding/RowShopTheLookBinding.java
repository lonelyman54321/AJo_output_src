/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowShopTheLookBinding
implements BC3 {
    public final AjioRoundedCornerImageView capsuleImage;
    public final AjioTextView capsuleItemBrandName;
    public final AjioTextView capsuleItemOldPrice;
    public final AjioTextView capsuleItemPrice;
    public final RelativeLayout pricelayout;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowShopTheLook;
    public final AjioRoundedCornerImageView rowStlImvPromo;
    public final AjioTextView tvAddbundle;

    private RowShopTheLookBinding(ConstraintLayout constraintLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView2, AjioTextView ajioTextView4) {
        this.rootView = constraintLayout;
        this.capsuleImage = ajioRoundedCornerImageView;
        this.capsuleItemBrandName = ajioTextView;
        this.capsuleItemOldPrice = ajioTextView2;
        this.capsuleItemPrice = ajioTextView3;
        this.pricelayout = relativeLayout;
        this.rowShopTheLook = constraintLayout2;
        this.rowStlImvPromo = ajioRoundedCornerImageView2;
        this.tvAddbundle = ajioTextView4;
    }

    public static RowShopTheLookBinding bind(View object) {
        View view;
        int n3 = R$id.capsule_image;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioRoundedCornerImageView)view;
        if (object2 != null) {
            n3 = R$id.capsule_item_brand_name;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.capsule_item_old_price;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.capsule_item_price;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.pricelayout;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (RelativeLayout)view;
                        if (view2 != null) {
                            Object object6 = object;
                            object6 = (ConstraintLayout)((Object)object);
                            n3 = R$id.row_stl_imv_promo;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioRoundedCornerImageView)view;
                            if (object7 != null) {
                                n3 = R$id.tv_addbundle;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioTextView)view;
                                if (object8 != null) {
                                    object = new RowShopTheLookBinding((ConstraintLayout)((Object)object6), (AjioRoundedCornerImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (RelativeLayout)view2, (ConstraintLayout)((Object)object6), (AjioRoundedCornerImageView)((Object)object7), (AjioTextView)object8);
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

    public static RowShopTheLookBinding inflate(LayoutInflater layoutInflater) {
        return RowShopTheLookBinding.inflate(layoutInflater, null, false);
    }

    public static RowShopTheLookBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_shop_the_look;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowShopTheLookBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

