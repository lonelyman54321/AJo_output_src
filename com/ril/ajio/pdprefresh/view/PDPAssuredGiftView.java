/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.pdprefresh.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.pdprefresh.view.BasePDPNewAjioView;
import kotlin.jvm.internal.Intrinsics;

public final class PDPAssuredGiftView
extends BasePDPNewAjioView {
    public static final /* synthetic */ int n;
    public final NewCustomEventsRevamp a;
    public boolean b;
    public TextView c;
    public TextView d;
    public TextView e;
    public ImageView f;
    public LottieAnimationView g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public hq_0 l;
    public jo_2 m;

    public PDPAssuredGiftView(Context context) {
        NewCustomEventsRevamp newCustomEventsRevamp;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.a = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.h = "title";
        this.i = "description";
        this.j = "image";
        this.k = "cta_text";
        this.a(context);
    }

    public PDPAssuredGiftView(Context context, AttributeSet object) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, (AttributeSet)object);
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.a = object;
        this.h = "title";
        this.i = "description";
        this.j = "image";
        this.k = "cta_text";
        this.a(context);
    }

    public PDPAssuredGiftView(Context context, AttributeSet object, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, (AttributeSet)object, n3);
        object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        this.a = object;
        this.h = "title";
        this.i = "description";
        this.j = "image";
        this.k = "cta_text";
        this.a(context);
    }

    public final void a(Context object) {
        Object object2;
        Object object3 = LayoutInflater.from((Context)object);
        int n3 = R$layout.pdp_carousel_assured_gift_widget;
        boolean bl2 = true;
        object3 = object3.inflate(n3, (ViewGroup)this, bl2);
        n3 = R$id.ic_spc_assured_gift;
        this.f = object2 = (ImageView)object3.findViewById(n3);
        n3 = R$id.id_pdp_gift_title;
        object2 = (TextView)object3.findViewById(n3);
        this.c = object2;
        n3 = R$id.id_pdp_gift_details;
        object2 = (TextView)object3.findViewById(n3);
        this.d = object2;
        n3 = R$id.id_os_view_gifts;
        object2 = (TextView)object3.findViewById(n3);
        this.e = object2;
        n3 = R$id.pdp_assured_gift_anim;
        object3 = (LottieAnimationView)object3.findViewById(n3);
        this.g = object3;
        object3 = new jo_2((Context)object);
        this.m = object3;
        object = vh2_1.Companion;
        object.getClass();
        boolean bl3 = vh2_1.m;
        if (bl3) {
            float f5;
            Bundle bundle = new Bundle();
            object = this.m;
            if (object != null) {
                f5 = ((jo_2)object).c();
                object3 = "amount_payable";
                bundle.putFloat((String)object3, f5);
            }
            object3 = this.a;
            object2 = "widget interaction";
            String string2 = "free gift widget view";
            String string3 = "";
            String string4 = "widget_interaction";
            String string5 = "pdp screen";
            String string6 = "pdp screen";
            String string7 = "";
            String string8 = "";
            int n4 = 1536;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object2, string2, string3, string4, string5, string6, string7, bundle, string8, false, null, n4, null);
            bl3 = false;
            f5 = 0.0f;
            object = null;
            vh2_1.m = false;
        }
    }

    public final jo_2 getAppPreferences() {
        return this.m;
    }

    public final void setAppPreferences(jo_2 jo_22) {
        this.m = jo_22;
    }

    public void setData() {
        String string2;
        int n3;
        Object object = tr2_2.a;
        object = this.g;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assuredGiftsAnim");
            n3 = 0;
            object = null;
        }
        tr2_2.h((LottieAnimationView)((Object)object));
        n3 = this.b;
        String string3 = "icImage";
        if (n3 != 0) {
            object = this.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object = null;
            }
            int n4 = 8;
            object.setVisibility(n4);
        }
        cp_1.Companion.getClass();
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.d("pdp_assured_gift_json");
        String string4 = this.h;
        int n7 = object.has(string4);
        int n8 = 1;
        if (n7 == n8 && (string2 = object.getString(string4)) != null && (n7 = string2.length()) != 0) {
            string2 = this.c;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idTitle");
                n7 = 0;
                string2 = null;
            }
            string4 = object.getString(string4);
            string2.setText((CharSequence)string4);
        }
        if ((n7 = object.has(string4 = this.i)) == n8 && (string2 = object.getString(string4)) != null && (n7 = string2.length()) != 0) {
            string2 = this.d;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("idDetails");
                n7 = 0;
                string2 = null;
            }
            string4 = object.getString(string4);
            string2.setText((CharSequence)string4);
        }
        string4 = this.k;
        n7 = (int)(object.has(string4) ? 1 : 0);
        String string5 = "idViewGifts";
        if (n7 == n8 && (string2 = object.getString(string4)) != null && (n7 = string2.length()) != 0) {
            string2 = this.e;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n7 = 0;
                string2 = null;
            }
            string4 = object.getString(string4);
            string2.setText((CharSequence)string4);
        }
        if ((n7 = (int)(object.has(string4 = this.j) ? 1 : 0)) == n8 && (object = object.getString(string4)) != null && (n3 = ((String)object).length()) != 0) {
            object = new da$a();
            ((da$a)object).k = n8;
            ((da$a)object).r = n8;
            string2 = this.f;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n7 = 0;
                string2 = null;
            }
            ((da$a)object).n = string4;
            ((da$a)object).u = string2;
            ((da$a)object).a();
        }
        if ((object = this.e) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
        } else {
            object2 = object;
        }
        object = new jh2_1(this);
        object2.setOnClickListener((View.OnClickListener)object);
    }

    public final void setFleek(boolean bl2) {
        this.b = bl2;
    }

    public final void setListener(hq_0 hq_02) {
        Intrinsics.checkNotNullParameter(hq_02, "onAssuredGiftClickListener");
        this.l = hq_02;
    }
}

