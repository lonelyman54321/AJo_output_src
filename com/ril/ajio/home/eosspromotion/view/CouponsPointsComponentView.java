/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.SpannableString
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.home.eosspromotion.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.home.eosspromotion.view.CouponsPointsComponentView$a;
import com.ril.ajio.home.eosspromotion.view.CouponsPointsComponentView$b;
import com.ril.ajio.home.eosspromotion.view.CouponsPointsComponentView$c;
import com.ril.ajio.home.eosspromotion.view.CouponsPointsComponentView$d;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import com.ril.ajio.services.data.user.UserInformation;

public class CouponsPointsComponentView
extends FrameLayout
implements jc1_2,
View.OnClickListener {
    public m82_0 a;
    public AjioTextView b;
    public AjioTextView c;
    public AjioTextView d;
    public AjioTextView e;
    public LinearLayout f;
    public final UserInformation g;

    public CouponsPointsComponentView(Context context) {
        super(context);
        UserInformation userInformation;
        this.g = userInformation = VX0.a(AJIOApplication.Companion);
        this.a(context);
    }

    public CouponsPointsComponentView(Context context, AttributeSet object) {
        super(context, object);
        object = VX0.a(AJIOApplication.Companion);
        this.g = object;
        this.a(context);
    }

    public CouponsPointsComponentView(Context context, AttributeSet object, int n3) {
        super(context, object, n3);
        object = VX0.a(AJIOApplication.Companion);
        this.g = object;
        this.a(context);
    }

    public final void a(Context object) {
        AjioTextView ajioTextView;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.coupons_promotion_points_view;
        object = object.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.points_label;
        this.b = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.login_link;
        ajioTextView = (LinearLayout)object.findViewById(n3);
        this.f = ajioTextView;
        n3 = R$id.coupon_bonanza_help;
        this.c = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.coupon_bonanza_tc;
        this.d = ajioTextView = (AjioTextView)object.findViewById(n3);
        n3 = R$id.coupon_bonanza_faq;
        object = (AjioTextView)object.findViewById(n3);
        this.e = object;
    }

    public final void onClick(View view) {
    }

    public void setData(CouponPromotion object) {
        SpannableString spannableString;
        int n3 = 2;
        int n4 = 1;
        Object object2 = this.g;
        boolean n7 = ((UserInformation)object2).isUserOnline();
        AjioCustomTypefaceSpan ajioCustomTypefaceSpan = null;
        int n8 = 3;
        if (n7) {
            object2 = this.b;
            int n10 = R$string.coupons_promotion_points;
            Object object3 = ((CouponPromotion)object).getBalancePoints();
            String string2 = ((CouponPromotion)object).getEossPoints();
            Object[] objectArray = new Object[n3];
            objectArray[0] = object3;
            objectArray[n4] = string2;
            String string3 = hv3_0.L(n10, objectArray);
            object2.setText((CharSequence)string3);
            this.f.setVisibility(8);
            AJIOApplication.Companion.getClass();
            object2 = mz3_0.t(AJIOApplication$a.a(), n8);
            Typeface typeface = mz3_0.t(AJIOApplication$a.a(), 5);
            n10 = R$string.coupons_promotion_points;
            object3 = ((CouponPromotion)object).getBalancePoints();
            object = ((CouponPromotion)object).getEossPoints();
            spannableString = new Object[n3];
            spannableString[0] = object3;
            spannableString[n4] = object;
            object = hv3_0.L(n10, (Object[])spannableString);
            spannableString = new SpannableString((CharSequence)object);
            n10 = ((String)object).indexOf(47);
            string2 = "";
            object3 = new AjioCustomTypefaceSpan(string2, (Typeface)object2);
            int n14 = 33;
            spannableString.setSpan(object3, 0, n10, n14);
            ajioCustomTypefaceSpan = new AjioCustomTypefaceSpan(string2, typeface);
            int n15 = ((String)object).length();
            spannableString.setSpan((Object)ajioCustomTypefaceSpan, n10 += n4, n15, n14);
            object = this.b;
            object.setText((CharSequence)spannableString);
        } else {
            AJIOApplication.Companion.getClass();
            object = mz3_0.t(AJIOApplication$a.a(), n8);
            spannableString = this.b;
            n4 = R$string.coupons_promotion_points_anonymousmessage;
            String string4 = hv3_0.K(n4);
            spannableString.setText((CharSequence)string4);
            spannableString = this.b;
            spannableString.setTypeface((Typeface)object);
            object = this.f;
            object.setVisibility(0);
        }
        object = this.f;
        spannableString = new CouponsPointsComponentView$a(this);
        object.setOnClickListener((View.OnClickListener)spannableString);
        object = this.c;
        spannableString = new CouponsPointsComponentView$b(this);
        object.setOnClickListener((View.OnClickListener)spannableString);
        object = this.d;
        spannableString = new CouponsPointsComponentView$c(this);
        object.setOnClickListener((View.OnClickListener)spannableString);
        object = this.e;
        spannableString = new CouponsPointsComponentView$d(this);
        object.setOnClickListener((View.OnClickListener)spannableString);
    }

    public void setOnClickCouponListener(m82_0 m82_02) {
        this.a = m82_02;
    }
}

