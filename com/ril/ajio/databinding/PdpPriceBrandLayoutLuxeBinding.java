/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPdpBinding;

public final class PdpPriceBrandLayoutLuxeBinding
implements BC3 {
    public final AjioTextView brandName;
    public final LinearLayout colorLayout;
    public final LayoutFreebieGetFreebiesPdpBinding freebiesLyt;
    public final AjioTextView numberOfColors;
    public final AjioTextView productDiscPercentageOff;
    public final AjioTextView productDiscPrice;
    public final AjioTextView productMrpText;
    public final AjioTextView productMrpTextNoDiscount;
    public final AjioTextView productName;
    public final AjioTextView productPrice;
    public final AjioTextView productPriceGstTv;
    private final ConstraintLayout rootView;
    public final View saleBgStrip;
    public final ImageView saleImv;
    public final AjioTextView sellingFastTag;

    private PdpPriceBrandLayoutLuxeBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, LinearLayout linearLayout, LayoutFreebieGetFreebiesPdpBinding layoutFreebieGetFreebiesPdpBinding, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, View view, ImageView imageView, AjioTextView ajioTextView10) {
        this.rootView = constraintLayout;
        this.brandName = ajioTextView;
        this.colorLayout = linearLayout;
        this.freebiesLyt = layoutFreebieGetFreebiesPdpBinding;
        this.numberOfColors = ajioTextView2;
        this.productDiscPercentageOff = ajioTextView3;
        this.productDiscPrice = ajioTextView4;
        this.productMrpText = ajioTextView5;
        this.productMrpTextNoDiscount = ajioTextView6;
        this.productName = ajioTextView7;
        this.productPrice = ajioTextView8;
        this.productPriceGstTv = ajioTextView9;
        this.saleBgStrip = view;
        this.saleImv = imageView;
        this.sellingFastTag = ajioTextView10;
    }

    public static PdpPriceBrandLayoutLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.brand_name;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.color_layout;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null && (view2 = dd2_2.a(n3 = R$id.freebies_lyt, view)) != null) {
                LayoutFreebieGetFreebiesPdpBinding layoutFreebieGetFreebiesPdpBinding = LayoutFreebieGetFreebiesPdpBinding.bind(view2);
                n3 = R$id.number_of_colors;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.product_disc_percentage_off;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.product_disc_price;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            n3 = R$id.product_mrp_text;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.product_mrp_text_no_discount;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.product_name;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.product_price;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)view2;
                                        if (object9 != null) {
                                            View view4;
                                            n3 = R$id.product_price_gst_tv;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null && (view4 = dd2_2.a(n3 = R$id.sale_bg_strip, view)) != null) {
                                                n3 = R$id.sale_imv;
                                                View view5 = view2 = dd2_2.a(n3, view);
                                                view5 = (ImageView)view2;
                                                if (view5 != null) {
                                                    n3 = R$id.selling_fast_tag;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (AjioTextView)view2;
                                                    if (object11 != null) {
                                                        Object object12 = view;
                                                        object12 = (ConstraintLayout)view;
                                                        PdpPriceBrandLayoutLuxeBinding pdpPriceBrandLayoutLuxeBinding = new PdpPriceBrandLayoutLuxeBinding((ConstraintLayout)((Object)object12), (AjioTextView)object2, (LinearLayout)view3, layoutFreebieGetFreebiesPdpBinding, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, view4, (ImageView)view5, (AjioTextView)object11);
                                                        return pdpPriceBrandLayoutLuxeBinding;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpPriceBrandLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return PdpPriceBrandLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static PdpPriceBrandLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_price_brand_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpPriceBrandLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

