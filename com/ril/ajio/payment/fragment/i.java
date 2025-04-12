/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.PesdkToolbarHandler;
import com.ril.ajio.payment.fragment.i$a;
import com.ril.ajio.payment.fragment.i$c;
import com.ril.ajio.payment.fragment.i$d;
import com.ril.ajio.payment.fragment.i$e;
import com.ril.ajio.services.data.Payment.CardTokenizeConsentDetails;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;

public final class i
extends fw_2 {
    public static final i$a Companion;
    public final D a;
    public Function1 b;
    public TextView c;
    public ImageView d;
    public TextView e;
    public TextView f;
    public RecyclerView g;
    public String h;
    public String i;

    static {
        i$a i$a;
        Companion = i$a = new Object();
    }

    public i() {
        Object object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        i$c i$c = new i$c(this);
        i$d i$d = new i$d(this);
        i$e i$e = new i$e(this);
        this.a = object = LW0.a(this, (yn1_2)object, i$c, i$d, i$e);
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        if (object != null) {
            InputMethodManager inputMethodManager = (InputMethodManager)object.getSystemService("input_method");
            View view = object.getCurrentFocus();
            if (view == null) {
                view = new View((Context)object);
            }
            object = view.getWindowToken();
            view = null;
            inputMethodManager.hideSoftInputFromWindow((IBinder)object, 0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_secure_card_details_luxe;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_secure_card_details;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        String string2;
        Object object3;
        Object object4;
        Object object5;
        int n4;
        block33: {
            block35: {
                block34: {
                    int n7;
                    Object object6;
                    String string3;
                    int n8;
                    block32: {
                        int n10;
                        n4 = 1;
                        Intrinsics.checkNotNullParameter(object, "view");
                        super.onViewCreated((View)object, (Bundle)object2);
                        n8 = R$id.tv_proceed;
                        object2 = (TextView)object.findViewById(n8);
                        this.c = object2;
                        n8 = R$id.tv_skip;
                        object2 = (TextView)object.findViewById(n8);
                        this.e = object2;
                        n8 = R$id.rv_guidelines;
                        object2 = (RecyclerView)object.findViewById(n8);
                        this.g = object2;
                        n8 = R$id.tv_guideline_heading;
                        object2 = (TextView)object.findViewById(n8);
                        this.f = object2;
                        n8 = R$id.iv_logo;
                        object2 = (ImageView)object.findViewById(n8);
                        this.d = object2;
                        object2 = this.f;
                        object5 = null;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("tvGuidelineHeading");
                            n8 = 0;
                            object2 = null;
                        }
                        object4 = this.a;
                        object3 = ((kj2_1)((D)object4).getValue()).s;
                        if (object3 != null && (object3 = ((PaymentInstruments)object3).getCardTokenizeConsentDetails()) != null) {
                            object3 = ((CardTokenizeConsentDetails)object3).getSubheading();
                        } else {
                            n10 = 0;
                            object3 = null;
                        }
                        string2 = "#network";
                        string3 = "cardType";
                        if (object3 != null) {
                            object6 = this.i;
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n7 = 0;
                                object6 = null;
                            }
                            object3 = kotlin.text.b.n((String)object3, string2, (String)object6, false);
                        } else {
                            n10 = 0;
                            object3 = null;
                        }
                        object2.setText((CharSequence)object3);
                        object2 = new da$a();
                        ((da$a)object2).k = n4;
                        ((da$a)object2).g = n4;
                        ((da$a)object2).s = n4;
                        ((da$a)object2).b = n10 = R$drawable.ic_default_locker;
                        object3 = this.h;
                        if (object3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("imageURL");
                            n10 = 0;
                            object3 = null;
                        }
                        if ((object6 = this.d) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("ivLogo");
                            n7 = 0;
                            object6 = null;
                        }
                        ((da$a)object2).n = object3;
                        ((da$a)object2).u = object6;
                        ((da$a)object2).i = n4;
                        ((da$a)object2).a();
                        n8 = (int)(og1_1.b() ? 1 : 0);
                        object3 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity";
                        if (n8 == 0) break block32;
                        n8 = R$id.pesdk_toolbar;
                        object2 = object.findViewById(n8);
                        Intrinsics.checkNotNullExpressionValue(object2, "findViewById(...)");
                        object2 = (Toolbar)object2;
                        n7 = R$id.pesdk_toolbar_title_tv;
                        object = (TextView)object.findViewById(n7);
                        object6 = ((kj2_1)((D)object4).getValue()).s;
                        if (object6 != null && (object6 = ((PaymentInstruments)object6).getCardTokenizeConsentDetails()) != null) {
                            object6 = ((CardTokenizeConsentDetails)object6).getHeading();
                        } else {
                            n7 = 0;
                            object6 = null;
                        }
                        if (object6 != null) {
                            String string4 = this.i;
                            if (string4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                string4 = null;
                            }
                            string2 = kotlin.text.b.n((String)object6, string2, string4, false);
                        } else {
                            string2 = null;
                        }
                        object.setText((CharSequence)string2);
                        n3 = R$drawable.ic_back_arrow_lux;
                        ((Toolbar)object2).setNavigationIcon(n3);
                        n3 = R$string.back_button_text;
                        ((Toolbar)object2).setNavigationContentDescription(n3);
                        object = this.getActivity();
                        n3 = object instanceof AppCompatActivity;
                        if (n3 != 0) {
                            object = this.getActivity();
                            Intrinsics.checkNotNull(object, (String)object3);
                            ((AppCompatActivity)object).setSupportActionBar((Toolbar)object2);
                            object = (AppCompatActivity)this.getActivity();
                            kq2_1.d((Toolbar)object2, (AppCompatActivity)object);
                        }
                        break block33;
                    }
                    n8 = R$id.pesdk_layout_coordinator;
                    object = object.findViewById(n8);
                    Intrinsics.checkNotNull(object);
                    object2 = new PesdkToolbarHandler((View)object);
                    object = ((kj2_1)((D)object4).getValue()).s;
                    if (object != null && (object = ((PaymentInstruments)object).getCardTokenizeConsentDetails()) != null) {
                        object = ((CardTokenizeConsentDetails)object).getHeading();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    if (object == null) break block34;
                    object6 = this.i;
                    if (object6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n7 = 0;
                        object6 = null;
                    }
                    if ((object = kotlin.text.b.n((String)object, string2, (String)object6, false)) != null) break block35;
                }
                object = "";
            }
            ((PesdkToolbarHandler)object2).setTitleText((String)object);
            ((PesdkToolbarHandler)object2).setNavigationClick();
            object = this.getActivity();
            n3 = object instanceof AppCompatActivity;
            if (n3 != 0) {
                object = this.getActivity();
                Intrinsics.checkNotNull(object, (String)object3);
                object = (AppCompatActivity)object;
                object3 = ((PesdkToolbarHandler)object2).getToolbar();
                ((AppCompatActivity)object).setSupportActionBar((Toolbar)object3);
            }
            if ((object = ((PesdkToolbarHandler)object2).getToolbar()) != null) {
                object = ((PesdkToolbarHandler)object2).getToolbar();
                Intrinsics.checkNotNull(object);
                object.invalidate();
            }
            if ((object = ((PesdkToolbarHandler)object2).getToolbar()) != null) {
                object2 = new yw2_1(this);
                ((Toolbar)object).setNavigationOnClickListener((View.OnClickListener)object2);
            }
        }
        if ((object = ((kj2_1)((D)object4).getValue()).s) != null && (object = ((PaymentInstruments)object).getCardTokenizeConsentDetails()) != null) {
            object = ((CardTokenizeConsentDetails)object).getContent();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object2 = new VC2((List)object);
            object = this.g;
            object4 = "rvGuidelines";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            string2 = this.requireContext();
            object3 = new LinearLayoutManager((Context)string2);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
            object = this.g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("proceedTv");
            n3 = 0;
            object = null;
        }
        object2 = new ww2_1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.e;
        if (object == null) {
            object = "skipTv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object5 = object;
        }
        object = new xw2_1(this);
        object5.setOnClickListener((View.OnClickListener)object);
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getGtmEvents();
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getCurrentScreen();
        object5 = new Pair("source_screen", object);
        object = new Pair[n4];
        object[0] = object5;
        object = DE.b((Pair[])object);
        ((GTMEvents)object2).pushOpenScreenEvent("save card consent screen", (Bundle)object);
    }
}

