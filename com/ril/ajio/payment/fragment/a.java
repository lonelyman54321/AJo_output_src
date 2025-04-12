/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableString
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.D;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioCustomTypefaceSpan;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.payment.fragment.a$a;
import com.ril.ajio.payment.fragment.a$b;
import com.ril.ajio.payment.fragment.a$c;
import com.ril.ajio.payment.fragment.a$d;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.CartRequest;
import com.ril.ajio.services.data.Payment.TenantResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

public final class a
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final a$a Companion;
    public final D a;
    public ImageView b;
    public TextView c;
    public TextView d;

    static {
        a$a a$a;
        Companion = a$a = new Object();
    }

    public a() {
        Object object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        a$b a$b = new a$b(this);
        a$c a$c = new a$c(this);
        a$d a$d = new a$d(this);
        this.a = object = LW0.a(this, (yn1_2)object, a$b, a$c, a$d);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onClick(View object) {
        Object object2 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.dismissAllowingStateLoss();
        int n3 = object.getId();
        int n4 = R$id.cod_dialog_tv_placeorder;
        if (n3 == n4) {
            object = this.getParentFragment();
            n3 = object instanceof g;
            if (n3 != 0) {
                object = this.getParentFragment();
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.payment.fragment.PeCheckoutFragment");
                object = (g)object;
                object2 = Boolean.FALSE;
                boolean bl2 = true;
                ((g)object).Sa((Boolean)object2, bl2);
            }
            object = AnalyticsManager.Companion;
            Object object3 = "friction popup";
            String string2 = "Place order";
            tj2_0.e((AnalyticsManager$Companion)object, (String)object3, string2, "cod friction popup");
            object2 = ((kj2_1)this.a.getValue()).E;
            if (object2 != null && (object2 = ((TenantResponse)object2).getCartRequest()) != null && (object2 = ((CartRequest)object2).getCartId()) != null) {
                object2 = "Popup_order_placed_".concat((String)object2);
                object3 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
                string2 = "Order Placed After Fraud Popup";
                ak0_0.a((AnalyticsManager$Companion)object, (GTMEvents)object3, string2, (String)object2);
            }
        } else {
            n4 = R$id.choose_other_option;
            boolean bl3 = false;
            Object var6_8 = null;
            if (n3 == n4) {
                object = (g)this.getParentFragment();
                if (object != null) {
                    object2 = Boolean.TRUE;
                    ((g)object).Sa((Boolean)object2, false);
                }
            } else {
                n4 = R$id.cod_popup_close;
                if (n3 == n4) {
                    object = (g)this.getParentFragment();
                    if (object != null) {
                        object2 = Boolean.FALSE;
                        ((g)object).Sa((Boolean)object2, false);
                    }
                    this.dismissAllowingStateLoss();
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.CustomBottomSheetDialogTheme;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_dialog_cod;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_cod_dialog;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        boolean bl2 = false;
        String string2 = null;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.cod_popup_close;
        object2 = (ImageView)object.findViewById(n3);
        int n4 = R$id.cod_dialog_tv_placeorder;
        TextView textView = (TextView)object.findViewById(n4);
        int n7 = R$id.choose_other_option;
        TextView textView2 = (TextView)object.findViewById(n7);
        int n8 = R$id.id_friction_image;
        Object object4 = (ImageView)object.findViewById(n8);
        this.b = object4;
        n8 = R$id.id_friction_title;
        object4 = (TextView)object.findViewById(n8);
        this.c = object4;
        n8 = R$id.cod_friction_tv;
        object4 = (TextView)object.findViewById(n8);
        this.d = object4;
        n8 = (int)(og1_1.b() ? 1 : 0);
        if (n8 != 0) {
            n8 = textView2.getPaintFlags() | 8;
            textView2.setPaintFlags(n8);
        }
        object2.setOnClickListener((View.OnClickListener)this);
        textView.setOnClickListener((View.OnClickListener)this);
        textView2.setOnClickListener((View.OnClickListener)this);
        object2 = object.getViewTreeObserver();
        object4 = new sh_2(this);
        object2.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)object4);
        object2 = h40_0.a;
        object2 = z40_0.Companion;
        object4 = AJIOApplication.Companion;
        object2 = Q.a((AJIOApplication$a)object4, (z40$a)object2).a.d("cod_fraud_check_new_configValue");
        Object object5 = "title";
        int n10 = object2.has((String)object5);
        if (n10 != 0 && (object3 = this.c) != null) {
            object5 = object2.getString((String)object5);
            object3.setText((CharSequence)object5);
        }
        int n14 = R$id.parent_layout;
        object = (LinearLayout)object.findViewById(n14);
        object3 = Looper.getMainLooper();
        object5 = new Handler((Looper)object3);
        object3 = new th_2(0, object, this);
        long l2 = 100;
        object5.postDelayed((Runnable)object3, l2);
        object = "description";
        n14 = (int)(object2.has((String)object) ? 1 : 0);
        if (n14 != 0) {
            object4 = this.d;
            if (object4 != null) {
                object = object2.getString((String)object);
                object = D91.a(0, (String)object);
                object4.setText((CharSequence)object);
            }
        } else {
            object = hv3_0.K(R$string.cod_friction_msg);
            object5 = FontsManager.getInstance();
            object4.getClass();
            object4 = AJIOApplication$a.a();
            n10 = 10;
            object4 = ((FontsManager)object5).getTypefaceWithFont((Context)object4, n10);
            Intrinsics.checkNotNullExpressionValue(object4, "getTypefaceWithFont(...)");
            object5 = new SpannableString((CharSequence)object);
            String string3 = "";
            Object object6 = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
            int n15 = 6;
            int n16 = StringsKt.O((CharSequence)object, "6", 0, false, n15);
            int n17 = StringsKt.O((CharSequence)object, "people", 0, false, n15) + n15;
            int n18 = 34;
            object5.setSpan(object6, n16, n17, n18);
            object6 = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
            String string4 = "4";
            n16 = StringsKt.O((CharSequence)object, string4, 0, false, n15);
            String string5 = "facilities";
            n17 = StringsKt.O((CharSequence)object, string5, 0, false, n15) + n10;
            object5.setSpan(object6, n16, n17, n18);
            object3 = new AjioCustomTypefaceSpan(string3, (Typeface)object4);
            object4 = "picked";
            n8 = StringsKt.O((CharSequence)object, (String)object4, 0, false, n15);
            object6 = "delivered";
            int n19 = StringsKt.O((CharSequence)object, (String)object6, 0, false, n15) + 16;
            object5.setSpan(object3, n8, n19, n18);
            object = this.d;
            if (object != null) {
                object.setText((CharSequence)object5);
            }
        }
        if ((object = this.b) != null && (n8 = (int)(object2.has(string2 = "imageLink") ? 1 : 0)) != 0) {
            object4 = new da$a();
            n14 = 1;
            ((da$a)object4).k = n14;
            ((da$a)object4).a = n10 = R$drawable.pesdk_ic_cod_popup;
            ((da$a)object4).b = n10;
            ((da$a)object4).c = n10;
            ((da$a)object4).r = n14;
            string2 = object2.getString(string2);
            ((da$a)object4).n = string2;
            ((da$a)object4).u = object;
            ((da$a)object4).i = n14;
            ((da$a)object4).a();
        }
        if (bl2 = object2.has((String)(object = "cta_forward_text"))) {
            object = object2.getString((String)object);
            textView.setText((CharSequence)object);
        }
        if (bl2 = object2.has((String)(object = "cta_backward_text"))) {
            object = object2.getString((String)object);
            textView2.setText((CharSequence)object);
        }
    }
}

