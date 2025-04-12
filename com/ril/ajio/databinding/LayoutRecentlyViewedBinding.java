/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutRecentlyViewedBinding
implements BC3 {
    public final ImageView capsuleImage;
    public final AjioTextView capsuleItemBrandName;
    public final AjioTextView capsuleItemOldPrice;
    public final AjioTextView capsuleItemPrice;
    public final ConstraintLayout layoutCapsuleImage;
    public final LinearLayout lrvLayoutPriceDrop;
    public final AjioTextView lrvTvExclusive;
    public final AjioTextView lrvTvPriceDropValue;
    private final FrameLayout rootView;
    public final FrameLayout rowShopTheLook;
    public final ImageView rowStlImvPromo;

    private LayoutRecentlyViewedBinding(FrameLayout frameLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout, LinearLayout linearLayout, AjioTextView ajioTextView4, AjioTextView ajioTextView5, FrameLayout frameLayout2, ImageView imageView2) {
        this.rootView = frameLayout;
        this.capsuleImage = imageView;
        this.capsuleItemBrandName = ajioTextView;
        this.capsuleItemOldPrice = ajioTextView2;
        this.capsuleItemPrice = ajioTextView3;
        this.layoutCapsuleImage = constraintLayout;
        this.lrvLayoutPriceDrop = linearLayout;
        this.lrvTvExclusive = ajioTextView4;
        this.lrvTvPriceDropValue = ajioTextView5;
        this.rowShopTheLook = frameLayout2;
        this.rowStlImvPromo = imageView2;
    }

    public static LayoutRecentlyViewedBinding bind(View object) {
        View view;
        int n3 = R$id.capsule_image;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.capsule_item_brand_name;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.capsule_item_old_price;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.capsule_item_price;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.layout_capsule_image;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (ConstraintLayout)view;
                        if (object5 != null) {
                            n3 = R$id.lrv_layout_price_drop;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                n3 = R$id.lrv_tv_exclusive;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioTextView)view;
                                if (object6 != null) {
                                    n3 = R$id.lrv_tv_price_drop_value;
                                    Object object7 = view = dd2_2.a(n3, object);
                                    object7 = (AjioTextView)view;
                                    if (object7 != null) {
                                        Object object8 = object;
                                        object8 = (FrameLayout)object;
                                        n3 = R$id.row_stl_imv_promo;
                                        View view4 = view = dd2_2.a(n3, object);
                                        view4 = (ImageView)view;
                                        if (view4 != null) {
                                            object = new LayoutRecentlyViewedBinding((FrameLayout)object8, (ImageView)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (ConstraintLayout)((Object)object5), (LinearLayout)view3, (AjioTextView)object6, (AjioTextView)object7, (FrameLayout)object8, (ImageView)view4);
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

    public static LayoutRecentlyViewedBinding inflate(LayoutInflater layoutInflater) {
        return LayoutRecentlyViewedBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutRecentlyViewedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_recently_viewed;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutRecentlyViewedBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

