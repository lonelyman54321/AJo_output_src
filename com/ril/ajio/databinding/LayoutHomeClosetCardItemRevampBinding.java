/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutSalePriceWishlistWidgetBinding;

public final class LayoutHomeClosetCardItemRevampBinding
implements BC3 {
    public final AjioRoundedCornerImageView lhcciIvImage;
    public final LinearLayout lhcciLayoutPriceDrop;
    public final ConstraintLayout lhcciMainLayout;
    public final ConstraintLayout lhcciPriceLayout;
    public final AjioTextView lhcciTvBrand;
    public final AjioTextView lhcciTvName;
    public final AjioTextView lhcciTvNewPrice;
    public final AjioTextView lhcciTvPriceDropTitle;
    public final AjioTextView lhcciTvPriceDropValue;
    public final AjioTextView lhcciTvWasPrice;
    public final View oosBg;
    public final TextView oosTv;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceWishlistWidgetBinding saleContainer;

    private LayoutHomeClosetCardItemRevampBinding(ConstraintLayout constraintLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, LinearLayout linearLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, View view, TextView textView, LayoutSalePriceWishlistWidgetBinding layoutSalePriceWishlistWidgetBinding) {
        this.rootView = constraintLayout;
        this.lhcciIvImage = ajioRoundedCornerImageView;
        this.lhcciLayoutPriceDrop = linearLayout;
        this.lhcciMainLayout = constraintLayout2;
        this.lhcciPriceLayout = constraintLayout3;
        this.lhcciTvBrand = ajioTextView;
        this.lhcciTvName = ajioTextView2;
        this.lhcciTvNewPrice = ajioTextView3;
        this.lhcciTvPriceDropTitle = ajioTextView4;
        this.lhcciTvPriceDropValue = ajioTextView5;
        this.lhcciTvWasPrice = ajioTextView6;
        this.oosBg = view;
        this.oosTv = textView;
        this.saleContainer = layoutSalePriceWishlistWidgetBinding;
    }

    public static LayoutHomeClosetCardItemRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.lhcciIvImage;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioRoundedCornerImageView)view2;
        if (object2 != null) {
            n3 = R$id.lhcciLayoutPriceDrop;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null) {
                Object object3 = view;
                object3 = (ConstraintLayout)view;
                n3 = R$id.lhcciPriceLayout;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (ConstraintLayout)view2;
                if (object4 != null) {
                    n3 = R$id.lhcciTvBrand;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.lhcciTvName;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.lhcciTvNewPrice;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.lhcciTvPriceDropTitle;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.lhcciTvPriceDropValue;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        View view4;
                                        n3 = R$id.lhcciTvWasPrice;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null && (view4 = dd2_2.a(n3 = R$id.oosBg, view)) != null) {
                                            n3 = R$id.oosTv;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (TextView)view2;
                                            if (view5 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                LayoutSalePriceWishlistWidgetBinding layoutSalePriceWishlistWidgetBinding = LayoutSalePriceWishlistWidgetBinding.bind(view2);
                                                object = new LayoutHomeClosetCardItemRevampBinding((ConstraintLayout)((Object)object3), (AjioRoundedCornerImageView)((Object)object2), (LinearLayout)view3, (ConstraintLayout)((Object)object3), (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, view4, (TextView)view5, layoutSalePriceWishlistWidgetBinding);
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutHomeClosetCardItemRevampBinding inflate(LayoutInflater layoutInflater) {
        return LayoutHomeClosetCardItemRevampBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutHomeClosetCardItemRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_home_closet_card_item_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutHomeClosetCardItemRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

