/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CouponListItemLuxeBinding
implements BC3 {
    public final TextView applyCouponTv;
    public final ConstraintLayout clEmailVerification;
    public final TextView couponCodeTv;
    public final View couponDivider;
    public final TextView couponInfoTv;
    public final AjioTextView lblEmailVerification;
    private final ConstraintLayout rootView;
    public final ConstraintLayout savingContainer;
    public final TextView savingRupeeTv;
    public final TextView savingTv;
    public final TextView savingValueTv;
    public final AjioTextView timerTv;
    public final TextView tnc;
    public final TextView verifyApplyCouponTv;

    private CouponListItemLuxeBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, View view, TextView textView3, AjioTextView ajioTextView, ConstraintLayout constraintLayout3, TextView textView4, TextView textView5, TextView textView6, AjioTextView ajioTextView2, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.applyCouponTv = textView;
        this.clEmailVerification = constraintLayout2;
        this.couponCodeTv = textView2;
        this.couponDivider = view;
        this.couponInfoTv = textView3;
        this.lblEmailVerification = ajioTextView;
        this.savingContainer = constraintLayout3;
        this.savingRupeeTv = textView4;
        this.savingTv = textView5;
        this.savingValueTv = textView6;
        this.timerTv = ajioTextView2;
        this.tnc = textView7;
        this.verifyApplyCouponTv = textView8;
    }

    public static CouponListItemLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.applyCouponTv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.cl_email_verification;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (ConstraintLayout)view2;
            if (object2 != null) {
                View view4;
                n3 = R$id.couponCodeTv;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null && (view4 = dd2_2.a(n3 = R$id.couponDivider, view)) != null) {
                    n3 = R$id.couponInfoTv;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.lbl_email_verification;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.savingContainer;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (ConstraintLayout)view2;
                            if (object4 != null) {
                                n3 = R$id.savingRupeeTv;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (TextView)view2;
                                if (view7 != null) {
                                    n3 = R$id.savingTv;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (TextView)view2;
                                    if (view8 != null) {
                                        n3 = R$id.savingValueTv;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (TextView)view2;
                                        if (view9 != null) {
                                            n3 = R$id.timer_tv;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (AjioTextView)view2;
                                            if (object5 != null) {
                                                n3 = R$id.tnc;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (TextView)view2;
                                                if (view10 != null) {
                                                    n3 = R$id.verifyApplyCouponTv;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (TextView)view2;
                                                    if (view11 != null) {
                                                        Object object6 = view;
                                                        object6 = (ConstraintLayout)view;
                                                        CouponListItemLuxeBinding couponListItemLuxeBinding = new CouponListItemLuxeBinding((ConstraintLayout)((Object)object6), (TextView)view3, (ConstraintLayout)((Object)object2), (TextView)view5, view4, (TextView)view6, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (TextView)view7, (TextView)view8, (TextView)view9, (AjioTextView)object5, (TextView)view10, (TextView)view11);
                                                        return couponListItemLuxeBinding;
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

    public static CouponListItemLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CouponListItemLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CouponListItemLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_list_item_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponListItemLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

