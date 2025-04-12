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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogCartCouponSavingBinding
implements BC3 {
    public final RelativeLayout baseRl;
    public final AppCompatTextView cartSavingDialogCouponAmount;
    public final AppCompatTextView cartSavingDialogCouponMsg;
    public final AppCompatTextView cartSavingDialogCouponName;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final Guideline guideline;
    private final RelativeLayout rootView;

    private DialogCartCouponSavingBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, Guideline guideline) {
        this.rootView = relativeLayout;
        this.baseRl = relativeLayout2;
        this.cartSavingDialogCouponAmount = appCompatTextView;
        this.cartSavingDialogCouponMsg = appCompatTextView2;
        this.cartSavingDialogCouponName = appCompatTextView3;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout;
        this.guideline = guideline;
    }

    public static DialogCartCouponSavingBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (RelativeLayout)object;
        int n3 = R$id.cart_saving_dialog_coupon_amount;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatTextView)view;
        if (object2 != null) {
            n3 = R$id.cart_saving_dialog_coupon_msg;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatTextView)view;
            if (object3 != null) {
                n3 = R$id.cart_saving_dialog_coupon_name;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AppCompatTextView)view;
                if (object4 != null) {
                    n3 = R$id.close_dialog;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AppCompatImageView)view;
                    if (object5 != null) {
                        n3 = R$id.dlprLayoutContent;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (ConstraintLayout)view;
                        if (object6 != null) {
                            n3 = R$id.guideline;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (Guideline)view;
                            if (view3 != null) {
                                Object object7 = object;
                                view = view2;
                                object = new DialogCartCouponSavingBinding((RelativeLayout)view2, (RelativeLayout)view2, (AppCompatTextView)object2, (AppCompatTextView)object3, (AppCompatTextView)object4, (AppCompatImageView)((Object)object5), (ConstraintLayout)((Object)object6), (Guideline)view3);
                                return object;
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

    public static DialogCartCouponSavingBinding inflate(LayoutInflater layoutInflater) {
        return DialogCartCouponSavingBinding.inflate(layoutInflater, null, false);
    }

    public static DialogCartCouponSavingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_cart_coupon_saving;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogCartCouponSavingBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

