/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class AjioSavingsLayoutBinding
implements BC3 {
    public final AjioTextView bottomText;
    public final AjioTextView couponDiscountLabel;
    public final RelativeLayout couponDiscountLayout;
    public final AjioTextView couponDiscountValue;
    public final AjioTextView discountLabel;
    public final RelativeLayout discountLayout;
    public final AjioTextView discountValue;
    public final AjioButton doneButton;
    public final AjioTextView promoDiscountLabel;
    public final RelativeLayout promoDiscountLayout;
    public final AjioTextView promoDiscountValue;
    private final ScrollView rootView;
    public final AjioTextView title;
    public final AjioTextView totalDiscountLabel;
    public final RelativeLayout totalDiscountLayout;
    public final AjioTextView totalDiscountValue;

    private AjioSavingsLayoutBinding(ScrollView scrollView, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4, RelativeLayout relativeLayout2, AjioTextView ajioTextView5, AjioButton ajioButton, AjioTextView ajioTextView6, RelativeLayout relativeLayout3, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, RelativeLayout relativeLayout4, AjioTextView ajioTextView10) {
        this.rootView = scrollView;
        this.bottomText = ajioTextView;
        this.couponDiscountLabel = ajioTextView2;
        this.couponDiscountLayout = relativeLayout;
        this.couponDiscountValue = ajioTextView3;
        this.discountLabel = ajioTextView4;
        this.discountLayout = relativeLayout2;
        this.discountValue = ajioTextView5;
        this.doneButton = ajioButton;
        this.promoDiscountLabel = ajioTextView6;
        this.promoDiscountLayout = relativeLayout3;
        this.promoDiscountValue = ajioTextView7;
        this.title = ajioTextView8;
        this.totalDiscountLabel = ajioTextView9;
        this.totalDiscountLayout = relativeLayout4;
        this.totalDiscountValue = ajioTextView10;
    }

    public static AjioSavingsLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.bottom_text;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.coupon_discount_label;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.coupon_discount_layout;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (RelativeLayout)view2;
                if (view3 != null) {
                    n3 = R$id.coupon_discount_value;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.discount_label;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioTextView)view2;
                        if (object5 != null) {
                            n3 = R$id.discount_layout;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (RelativeLayout)view2;
                            if (view4 != null) {
                                n3 = R$id.discount_value;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioTextView)view2;
                                if (object6 != null) {
                                    n3 = R$id.done_button;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioButton)view2;
                                    if (object7 != null) {
                                        n3 = R$id.promo_discount_label;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.promo_discount_layout;
                                            View view5 = view2 = dd2_2.a(n3, view);
                                            view5 = (RelativeLayout)view2;
                                            if (view5 != null) {
                                                n3 = R$id.promo_discount_value;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.title;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.total_discount_label;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.total_discount_layout;
                                                            View view6 = view2 = dd2_2.a(n3, view);
                                                            view6 = (RelativeLayout)view2;
                                                            if (view6 != null) {
                                                                n3 = R$id.total_discount_value;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (AjioTextView)view2;
                                                                if (object12 != null) {
                                                                    View view7 = view;
                                                                    view7 = (ScrollView)view;
                                                                    AjioSavingsLayoutBinding ajioSavingsLayoutBinding = new AjioSavingsLayoutBinding((ScrollView)view7, (AjioTextView)object2, (AjioTextView)object3, (RelativeLayout)view3, (AjioTextView)object4, (AjioTextView)object5, (RelativeLayout)view4, (AjioTextView)object6, (AjioButton)object7, (AjioTextView)object8, (RelativeLayout)view5, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (RelativeLayout)view6, (AjioTextView)object12);
                                                                    return ajioSavingsLayoutBinding;
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static AjioSavingsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return AjioSavingsLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static AjioSavingsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ajio_savings_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AjioSavingsLayoutBinding.bind((View)layoutInflater);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}

