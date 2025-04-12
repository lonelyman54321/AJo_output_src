/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CouponsPromotionPointsViewBinding
implements BC3 {
    public final AjioTextView couponBonanzaFaq;
    public final AjioTextView couponBonanzaHelp;
    public final AjioTextView couponBonanzaTc;
    public final LinearLayout loginLink;
    public final AjioTextView pointsLabel;
    public final LinearLayout pointsStaticLink;
    private final RelativeLayout rootView;
    public final LinearLayout staticLink;

    private CouponsPromotionPointsViewBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout, AjioTextView ajioTextView4, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.rootView = relativeLayout;
        this.couponBonanzaFaq = ajioTextView;
        this.couponBonanzaHelp = ajioTextView2;
        this.couponBonanzaTc = ajioTextView3;
        this.loginLink = linearLayout;
        this.pointsLabel = ajioTextView4;
        this.pointsStaticLink = linearLayout2;
        this.staticLink = linearLayout3;
    }

    public static CouponsPromotionPointsViewBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_bonanza_faq;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.coupon_bonanza_help;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.coupon_bonanza_tc;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.login_link;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (LinearLayout)view;
                    if (view2 != null) {
                        n3 = R$id.points_label;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.points_static_link;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                n3 = R$id.static_link;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (LinearLayout)view;
                                if (view4 != null) {
                                    Object object6 = object;
                                    object6 = (RelativeLayout)object;
                                    CouponsPromotionPointsViewBinding couponsPromotionPointsViewBinding = new CouponsPromotionPointsViewBinding((RelativeLayout)object6, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (LinearLayout)view2, (AjioTextView)object5, (LinearLayout)view3, (LinearLayout)view4);
                                    return couponsPromotionPointsViewBinding;
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

    public static CouponsPromotionPointsViewBinding inflate(LayoutInflater layoutInflater) {
        return CouponsPromotionPointsViewBinding.inflate(layoutInflater, null, false);
    }

    public static CouponsPromotionPointsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupons_promotion_points_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponsPromotionPointsViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

