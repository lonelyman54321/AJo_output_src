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
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceLuxeBinding;

public final class NewLuxeProductWidgetRowBinding
implements BC3 {
    public final AjioImageView capsuleImage;
    public final AjioTextView capsuleItemBrandName;
    public final AjioTextView capsuleItemOldPrice;
    public final AjioTextView capsuleItemPrice;
    public final AjioTextView capsuleItemProductName;
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final AjioTextView plpRowDiscountPercentTv;
    public final RelativeLayout pricelayout;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowShopTheLook;
    public final AjioRoundedCornerImageView rowStlImvPromo;
    public final LayoutSalePriceLuxeBinding saleContainer;

    private NewLuxeProductWidgetRowBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, AjioTextView ajioTextView5, RelativeLayout relativeLayout, ConstraintLayout constraintLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView, LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding) {
        this.rootView = constraintLayout;
        this.capsuleImage = ajioImageView;
        this.capsuleItemBrandName = ajioTextView;
        this.capsuleItemOldPrice = ajioTextView2;
        this.capsuleItemPrice = ajioTextView3;
        this.capsuleItemProductName = ajioTextView4;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.plpRowDiscountPercentTv = ajioTextView5;
        this.pricelayout = relativeLayout;
        this.rowShopTheLook = constraintLayout2;
        this.rowStlImvPromo = ajioRoundedCornerImageView;
        this.saleContainer = layoutSalePriceLuxeBinding;
    }

    public static NewLuxeProductWidgetRowBinding bind(View object) {
        View view;
        int n3 = R$id.capsule_image;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
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
                        n3 = R$id.capsule_item_product_name;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null && (view = dd2_2.a(n3 = R$id.freebie_lyt, object)) != null) {
                            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view);
                            n3 = R$id.plp_row_discount_percent_tv;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.pricelayout;
                                View view2 = view = dd2_2.a(n3, object);
                                view2 = (RelativeLayout)view;
                                if (view2 != null) {
                                    Object object8 = object;
                                    object8 = (ConstraintLayout)((Object)object);
                                    n3 = R$id.row_stl_imv_promo;
                                    Object object9 = view = dd2_2.a(n3, object);
                                    object9 = (AjioRoundedCornerImageView)view;
                                    if (object9 != null && (view = dd2_2.a(n3 = R$id.sale_container, object)) != null) {
                                        LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding = LayoutSalePriceLuxeBinding.bind(view);
                                        object = new NewLuxeProductWidgetRowBinding((ConstraintLayout)((Object)object8), (AjioImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, layoutFreebieGetFreebiesPlpBinding, (AjioTextView)object7, (RelativeLayout)view2, (ConstraintLayout)((Object)object8), (AjioRoundedCornerImageView)((Object)object9), layoutSalePriceLuxeBinding);
                                        return object;
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

    public static NewLuxeProductWidgetRowBinding inflate(LayoutInflater layoutInflater) {
        return NewLuxeProductWidgetRowBinding.inflate(layoutInflater, null, false);
    }

    public static NewLuxeProductWidgetRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_luxe_product_widget_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewLuxeProductWidgetRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

