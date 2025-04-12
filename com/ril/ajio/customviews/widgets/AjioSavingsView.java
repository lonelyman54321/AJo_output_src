/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioSavingsDoneClickListener;
import com.ril.ajio.customviews.widgets.AjioSavingsView$1;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartSavings;

public class AjioSavingsView
extends LinearLayout {
    private AjioTextView bottomText;
    private AjioTextView couponDiscountLabel;
    private AjioTextView couponDiscountValue;
    private RelativeLayout coupongDiscountLayout;
    private AjioTextView discountLabel;
    private RelativeLayout discountLayout;
    private AjioTextView discountValue;
    private AjioButton doneButton;
    private Context mContext;
    private AjioTextView promoDiscountLabel;
    private RelativeLayout promoDiscountLayout;
    private AjioTextView promoDiscountValue;
    private AjioTextView titleView;
    private AjioTextView totalDiscountLabel;
    private RelativeLayout totalDiscountLayout;
    private AjioTextView totalDiscountValue;

    public AjioSavingsView(Context context) {
        super(context);
        this.init(context);
    }

    public AjioSavingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context);
    }

    public AjioSavingsView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.init(context);
    }

    public AjioSavingsView(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
        this.init(context);
    }

    private void init(Context object) {
        AjioTextView ajioTextView;
        this.mContext = object;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.ajio_savings_layout;
        object = (LinearLayout)object.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.title;
        this.titleView = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.discount_layout;
        ajioTextView = (RelativeLayout)object.findViewById(n3);
        this.discountLayout = ajioTextView;
        n3 = R$id.discount_label;
        this.discountLabel = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.discount_value;
        this.discountValue = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.coupon_discount_layout;
        ajioTextView = (RelativeLayout)object.findViewById(n3);
        this.coupongDiscountLayout = ajioTextView;
        n3 = R$id.coupon_discount_label;
        this.couponDiscountLabel = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.coupon_discount_value;
        this.couponDiscountValue = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.promo_discount_layout;
        ajioTextView = (RelativeLayout)object.findViewById(n3);
        this.promoDiscountLayout = ajioTextView;
        n3 = R$id.promo_discount_label;
        this.promoDiscountLabel = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.promo_discount_value;
        this.promoDiscountValue = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.total_discount_layout;
        ajioTextView = (RelativeLayout)object.findViewById(n3);
        this.totalDiscountLayout = ajioTextView;
        n3 = R$id.total_discount_label;
        this.totalDiscountLabel = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.total_discount_value;
        this.totalDiscountValue = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.bottom_text;
        this.bottomText = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.done_button;
        object = (AjioButton)object.findViewById(n3);
        this.doneButton = object;
    }

    public void setAjioSavings(CartSavings object, AjioSavingsDoneClickListener ajioSavingsDoneClickListener) {
        float f5;
        float f6;
        CharSequence charSequence;
        Object object2 = this.titleView;
        Object object3 = ((CartSavings)object).getTitle();
        object2.setText((CharSequence)object3);
        float f7 = ((CartSavings)object).getDiscountPriceValue();
        int n3 = 0;
        float f8 = 0.0f;
        object3 = null;
        int n4 = 8;
        String string2 = null;
        float f11 = f7 - 0.0f;
        Object object4 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        if (object4 <= 0) {
            object2 = this.discountLayout;
            object2.setVisibility(n4);
        } else {
            this.discountLayout.setVisibility(0);
            object2 = this.discountLabel;
            charSequence = new StringBuilder("Discount (");
            int n7 = ((CartSavings)object).getDiscountPercent();
            charSequence.append(n7);
            String string3 = "%)";
            charSequence.append(string3);
            charSequence = charSequence.toString();
            object2.setText(charSequence);
            object2 = this.discountValue;
            f6 = ((CartSavings)object).getDiscountPriceValue();
            charSequence = qz2_0.u(f6);
            object2.setText(charSequence);
        }
        f7 = ((CartSavings)object).getCouponDiscountValue();
        float f12 = f7 - 0.0f;
        object4 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object4 <= 0) {
            object2 = this.coupongDiscountLayout;
            object2.setVisibility(n4);
        } else {
            this.coupongDiscountLayout.setVisibility(0);
            this.couponDiscountLabel.setText("Coupon savings*");
            object2 = this.couponDiscountValue;
            f6 = ((CartSavings)object).getCouponDiscountValue();
            charSequence = qz2_0.u(f6);
            object2.setText(charSequence);
        }
        f7 = ((CartSavings)object).getPromoDiscountValue();
        float f14 = f7 - 0.0f;
        object4 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
        if (object4 <= 0) {
            object2 = this.promoDiscountLayout;
            object2.setVisibility(n4);
        } else {
            this.promoDiscountLayout.setVisibility(0);
            this.promoDiscountLabel.setText("Promo savings");
            object2 = this.promoDiscountValue;
            f6 = ((CartSavings)object).getPromoDiscountValue();
            charSequence = qz2_0.u(f6);
            object2.setText(charSequence);
        }
        f7 = ((CartSavings)object).getDiscountPriceValue();
        float f15 = f7 - 0.0f;
        object4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object4 > 0) {
            f7 = ((CartSavings)object).getDiscountPriceValue();
        } else {
            object4 = false;
            f7 = 0.0f;
            object2 = null;
        }
        f6 = ((CartSavings)object).getCouponDiscountValue();
        float f16 = f6 - 0.0f;
        float f17 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
        if (f17 > 0) {
            f6 = ((CartSavings)object).getCouponDiscountValue();
        } else {
            f17 = 0.0f;
            f6 = 0.0f;
            charSequence = null;
        }
        f7 += f6;
        f6 = ((CartSavings)object).getPromoDiscountValue();
        float f18 = f6 - 0.0f;
        f17 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (f17 > 0) {
            f6 = ((CartSavings)object).getPromoDiscountValue();
        } else {
            f17 = 0.0f;
            f6 = 0.0f;
            charSequence = null;
        }
        f17 = (f5 = (f7 += f6) - 0.0f) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
        if (f17 <= 0) {
            object2 = this.totalDiscountLayout;
            object2.setVisibility(n4);
        } else {
            this.totalDiscountLayout.setVisibility(0);
            object3 = this.totalDiscountLabel;
            charSequence = "Total savings";
            object3.setText(charSequence);
            object3 = this.totalDiscountValue;
            object2 = qz2_0.u(f7);
            object3.setText((CharSequence)object2);
        }
        object4 = ((CartSavings)object).isCoupon();
        if (object4 != false) {
            object4 = ((CartSavings)object).isCouponApplied();
            if (object4 != false) {
                String string4;
                f7 = ((CartSavings)object).getCouponDiscountValue();
                float f19 = f7 - 0.0f;
                object4 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                if (object4 != false) {
                    object2 = new StringBuilder("Total coupon savings on this product is ");
                    f8 = ((CartSavings)object).getCouponDiscountValue();
                    object3 = qz2_0.p(f8);
                    ((StringBuilder)object2).append((String)object3);
                    object3 = ". ";
                    ((StringBuilder)object2).append((String)object3);
                    object2 = ((StringBuilder)object2).toString();
                } else {
                    object2 = "";
                }
                object3 = ((CartSavings)object).getBottomText();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n3 == 0) {
                    object3 = new StringBuilder((String)(object = ((CartSavings)object).getBottomText()));
                    int n8 = TextUtils.isEmpty((CharSequence)object3);
                    if (n8 == 0 && (n8 = ((String)(object = ((StringBuilder)object3).toString())).contains(string4 = ":")) != 0) {
                        n8 = ((StringBuilder)object3).lastIndexOf(string4);
                        n4 = n8 + 1;
                        string2 = ".";
                        ((StringBuilder)object3).replace(n8, n4, string2);
                    }
                    object = Ex0.a((String)object2);
                    object2 = ((StringBuilder)object3).toString();
                    ((StringBuilder)object).append((String)object2);
                    object2 = ((StringBuilder)object).toString();
                }
                object = this.bottomText;
                string4 = "*";
                object3 = new StringBuilder(string4);
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
                object.setText((CharSequence)object2);
            } else {
                object = this.bottomText;
                object2 = this.mContext.getResources();
                n3 = R$string.coupon_not_applicable;
                object2 = object2.getString(n3);
                object.setText((CharSequence)object2);
            }
        } else {
            object = this.bottomText;
            object.setVisibility(n4);
        }
        object = this.doneButton;
        object2 = new AjioSavingsView$1(this, ajioSavingsDoneClickListener);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

