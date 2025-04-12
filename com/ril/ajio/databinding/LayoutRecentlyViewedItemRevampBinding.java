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
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutRecentlyViewedItemRevampBinding
implements BC3 {
    public final AjioRoundedCornerImageView capsuleImage;
    public final AjioTextView capsuleItemBrandName;
    public final AjioTextView capsuleItemName;
    public final AjioTextView capsuleItemOldPrice;
    public final AjioTextView capsuleItemPrice;
    public final ConstraintLayout layoutCapsuleImage;
    public final LinearLayout lrvLayoutPriceDrop;
    public final AjioTextView lrvTvExclusive;
    public final AjioTextView lrvTvPriceDropValue;
    private final FrameLayout rootView;
    public final FrameLayout rowShopTheLook;
    public final ImageView rowStlImvPromo;

    private LayoutRecentlyViewedItemRevampBinding(FrameLayout frameLayout, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, ConstraintLayout constraintLayout, LinearLayout linearLayout, AjioTextView ajioTextView5, AjioTextView ajioTextView6, FrameLayout frameLayout2, ImageView imageView) {
        this.rootView = frameLayout;
        this.capsuleImage = ajioRoundedCornerImageView;
        this.capsuleItemBrandName = ajioTextView;
        this.capsuleItemName = ajioTextView2;
        this.capsuleItemOldPrice = ajioTextView3;
        this.capsuleItemPrice = ajioTextView4;
        this.layoutCapsuleImage = constraintLayout;
        this.lrvLayoutPriceDrop = linearLayout;
        this.lrvTvExclusive = ajioTextView5;
        this.lrvTvPriceDropValue = ajioTextView6;
        this.rowShopTheLook = frameLayout2;
        this.rowStlImvPromo = imageView;
    }

    public static LayoutRecentlyViewedItemRevampBinding bind(View object) {
        View view;
        int n3 = R$id.capsule_image;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioRoundedCornerImageView)view;
        if (object2 != null) {
            n3 = R$id.capsule_item_brand_name;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.capsule_item_name;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.capsule_item_old_price;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.capsule_item_price;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.layout_capsule_image;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (ConstraintLayout)view;
                            if (object7 != null) {
                                n3 = R$id.lrv_layout_price_drop;
                                View view2 = view = dd2_2.a(n3, object);
                                view2 = (LinearLayout)view;
                                if (view2 != null) {
                                    n3 = R$id.lrv_tv_exclusive;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioTextView)view;
                                    if (object8 != null) {
                                        n3 = R$id.lrv_tv_price_drop_value;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            Object object10 = object;
                                            object10 = (FrameLayout)object;
                                            n3 = R$id.row_stl_imv_promo;
                                            View view3 = view = dd2_2.a(n3, object);
                                            view3 = (ImageView)view;
                                            if (view3 != null) {
                                                object = new LayoutRecentlyViewedItemRevampBinding((FrameLayout)object10, (AjioRoundedCornerImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (ConstraintLayout)((Object)object7), (LinearLayout)view2, (AjioTextView)object8, (AjioTextView)object9, (FrameLayout)object10, (ImageView)view3);
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutRecentlyViewedItemRevampBinding inflate(LayoutInflater layoutInflater) {
        return LayoutRecentlyViewedItemRevampBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutRecentlyViewedItemRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_recently_viewed_item_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutRecentlyViewedItemRevampBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

